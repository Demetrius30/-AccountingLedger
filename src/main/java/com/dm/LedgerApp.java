package com.dm;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class LedgerApp {

        static ArrayList<Transaction> transactions = new ArrayList<>();
        static Scanner scanner = new Scanner(System.in);
        static LocalDate today = LocalDate.now();


        public static void main(String[] args) {


//        loadTransaction();


        String input;
        do {
            System.out.println("Main Menu: ");
            System.out.println("\t1: Add deposit here");
            System.out.println("\t2: Make payment here");
            System.out.println("\t3: Display Ledger Screen");
            System.out.println("\t4: Exit");
            System.out.println("Command: ");
            input = scanner.nextLine();

            switch (input) {
                case "1":
                    addDeposit();
                    break;
                case "2":
                    makePayment();
                    break;
                case "3":
                    displayLedger();
                    break;
                case "4":
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid input");
            }
        } while (!input.equalsIgnoreCase("4"));

        loadTransaction();

    }


            // all transactions are loaded here
        public static void loadTransaction(){

        try {
            FileReader fileReader = new FileReader("./src/main/java/com/dm/transaction.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String input;

            while ((input = bufferedReader.readLine()) != null) {
                System.out.println(input); // create a transaction and add to array of transaction
            }

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();

        }

    }

        public static void addDeposit() {
        try {
            LocalDateTime dateTime = LocalDateTime.now();

            System.out.println("Please enter date for deposit (YYYY-MM-DD): ");
            String depositDate = scanner.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-DD");
            String formattedDate = String.format(depositDate, formatter);


            System.out.println("Please enter time for this deposit(HH:MM:SS): ");
            String depositTime = scanner.nextLine();
            DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("HH:MM:SS");
            String formattedTime = String.format(depositTime, formatter1);


            System.out.println("Please enter Description: ");
            String depositDescription = scanner.nextLine();

            System.out.println("Please enter Vendor for deposit: ");
            String depositVendor = scanner.nextLine();

            System.out.println("Please enter Amount for Deposit: ");
            float depositAmountOfTransaction = scanner.nextFloat();
            scanner.nextLine();

            Transaction newDeposit = new Transaction(depositDate, depositTime, depositDescription, depositVendor, depositAmountOfTransaction);
            transactions.add(newDeposit);
            System.out.println(newDeposit);

            FileWriter fileWriter = new FileWriter("./src/main/java/com/dm/transaction.csv", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(depositDate + "|" + depositTime + "|" + depositDescription + "|" + depositVendor + "|" + depositAmountOfTransaction);
            System.out.println("Deposit made successful");
            bufferedWriter.close();

        } catch (IOException e) {
            System.out.println("Deposit was unsuccessful. ");
            e.printStackTrace();


        }

    }


        public static void makePayment() {


            try {

                System.out.println("Please enter date for payment (YYYY-MM-DD): ");
                String paymentDate = scanner.nextLine();
                DateTimeFormatter format = DateTimeFormatter.ofPattern("YYYY-MM-DD");
                String formattedDate = String.format(paymentDate, format);


                System.out.println("Please enter time for this payment(HH:MM:SS): ");
                String paymentTime = scanner.nextLine();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:MM:SS");
                String formattedTime = String.format(paymentTime, formatter);

                System.out.println("Please enter Description: ");
                String paymentDescription = scanner.nextLine();

                System.out.println("Please enter Vendor for payment: ");
                String paymentVendor = scanner.nextLine();

                System.out.println("Please enter Amount for payment: ");
                float paymentAmountOfTransaction = scanner.nextFloat();
                scanner.nextLine();

                Transaction newPayment = new Transaction(paymentDate, paymentTime, paymentDescription, paymentVendor, paymentAmountOfTransaction);
                transactions.add(newPayment);
                System.out.println(newPayment);


                FileWriter fileWriter = new FileWriter("./src/main/java/com/dm/transaction.csv", true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(paymentDate + "|" + paymentTime + "|" + paymentDescription + "|" + paymentVendor + "|" + paymentAmountOfTransaction);
                System.out.println("Payment made successful");
                bufferedWriter.close();

            } catch (IOException e) {
                System.out.println("Payment was unsuccessful. ");
                e.printStackTrace();
            }

        }

        public static void displayLedger() {

        String subInput;
        ArrayList<String> arrayList = new ArrayList<String>();

        // asking where to go on ledger screen
        do {
            System.out.println("Please enter a command: ");
            System.out.println("\t1: Display all Entries");
            System.out.println("\t2: Display deposit entries only");
            System.out.println("\t3: Display payment entries only");
            System.out.println("\t4: Display Reports");
            System.out.println("\t5: Return to Home screen");
            System.out.println("Command: ");

            subInput = scanner.nextLine();

            switch (subInput) {
                case "1":
                    displayAll();
                    System.out.println("\t1: Display all Entries");
                    break;
                case "2":
                    displayDeposits();
                    System.out.println("\t2: Display deposit entries only");
                    break;
                case "3":
                    displayPayments();
                    System.out.println("\t3: Display payment entries only");
                    break;
                case "4":
                    displayReports();
                    System.out.println("\t4: Display Reports");
                    break;
                case "5":
                    System.out.println("\t5: Return to Home screen");
                    break;
                default:
                    System.out.println("Invalid input");
            }

        } while (!subInput.equalsIgnoreCase("5"));

    }

        private static void displayAll() {

        // displaying all entries

        try {
            Scanner scanner1 = new Scanner(System.in);


            ArrayList<String> arrayList = new ArrayList<String>();

            // displaying all transactions here
            for (int i = 0; i < transactions.size(); i++) {
                Transaction currentTransaction = transactions.get(i);
                System.out.println("Current Transaction: " + transactions.get(i));
            }

            FileReader fileReader = new FileReader("./src/main/java/com/dm/transaction.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String input;

            while ((input = bufferedReader.readLine()) != null) {
                System.out.println(input);
            }

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();

        }

        String userInput;
        do {

            System.out.println("Please enter \"done\" when finished reviewing all entries");
            userInput = scanner.nextLine();
            if (!userInput.equalsIgnoreCase("done")) {
//                transaction.add(userInput);
            }
        } while (!userInput.equalsIgnoreCase("done"));
        System.out.println(transactions);

    }

        private static void displayDeposits() { // displaying deposits only

            System.out.println("\n Deposits");
        try {
            Scanner scanner1 = new Scanner(System.in);


            ArrayList<String> arrayList = new ArrayList<String>();

            // displaying all transactions here
            for (int i = 0; i < transactions.size(); i++) {
                Transaction currentTransaction = transactions.get(i);
                System.out.println("Current Transaction: " + transactions.get(i));
            }

            FileReader fileReader = new FileReader("./src/main/java/com/dm/transaction.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String input;

            while ((input = bufferedReader.readLine()) != null) {
                System.out.println(input);
            }

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();

        }

        String userInput;
        do {

            System.out.println("Please enter \"done\" when finished reviewing all entries");
            userInput = scanner.nextLine();
            if (!userInput.equalsIgnoreCase("done")) {
//                transaction.add(userInput);
            }
        } while (!userInput.equalsIgnoreCase("done"));
        System.out.println(transactions);
        }

        private static void displayPayments() {

        try {
            Scanner scanner1 = new Scanner(System.in);


            ArrayList<String> arrayList = new ArrayList<String>();

            // displaying all transactions here
            for (int i = 0; i < transactions.size(); i++) {
                Transaction currentTransaction = transactions.get(i);
                System.out.println("Current Transaction: " + transactions.get(i));
            }

            FileReader fileReader = new FileReader("./src/main/java/com/dm/transaction.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String input;

            while ((input = bufferedReader.readLine()) != null) {
                System.out.println(input);
            }

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // displaying payments only

        System.out.println("Payment entries only");
    }

        private static void displayReports() {

        // displaying reports (Month To Date, Previous Month, Year To Date, Previous Year, Search by Vendor)

        String subInput2;

        do {
            System.out.println("\t1: Month To Date");
            System.out.println("\t2: Previous Month");
            System.out.println("\t3: Year To Date");
            System.out.println("\t4: Previous Year");
            System.out.println("\t5: Search by Vendor");
            System.out.println("\t6: Back");
            System.out.println("Command: ");
            subInput2 = scanner.nextLine();

            switch (subInput2) {
                case "1":
                    monthToDate(transactions);
                    System.out.println("Month To Date");
                    break;
                case "2":
                    prevMonth(transactions);
                    System.out.println("Previous Month");
                    break;
                case "3":
                    yearToDate(transactions);
                    System.out.println("Year To Date");
                    break;
                case "4":
                    prevYear(transactions);
                    System.out.println("Previous Year");
                    break;
                case "5":
                    searchByVendor(transactions);
                    System.out.println("Search By Vendor");
                    break;
                case "6":
                    System.out.println("Back");
                    break;
                default:
                    System.out.println("Invalid Input");
            }

        } while (!subInput2.equalsIgnoreCase("5"));


    }











        private static void monthToDate(ArrayList<Transaction> transaction) {


    }

        public static void prevMonth(ArrayList<Transaction> transaction) {
    }

        public static void yearToDate(ArrayList<Transaction> transaction) {
    }

        public static void prevYear(ArrayList<Transaction> transaction) {
    }

        public static void searchByVendor(ArrayList<Transaction> transaction) {
    }

    }




