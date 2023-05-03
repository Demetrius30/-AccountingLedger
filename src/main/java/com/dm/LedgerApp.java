package com.dm;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.util.InputMismatchException;

public class LedgerApp {

        static ArrayList<Transaction> transactions = new ArrayList<>();
        static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args){



            String input;
            do{
                System.out.println("Please enter a command: ");
                System.out.println("\t1: Add deposit here");
                System.out.println("\t2: Make payment here");
                System.out.println("\t3: Display Ledger Screen");
                System.out.println("\t4: Exit");
                System.out.println("Command: ");
                input = scanner.nextLine();

                switch (input){
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
            }while (!input.equalsIgnoreCase("4"));

    }

    public static void displayLedger() {

        // display ledger screen as method

        String subInput;


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
            System.out.println("All entries");
            for (int i = 0; i < transactions.size(); i++) {
                Transaction allTransactions = transactions.get(i);
                System.out.println(allTransactions);
            }
        }
        private static void displayDeposits(){
            System.out.println("Deposit entries only");
        }
        private static void displayPayments(){
            System.out.println("Payment entries only");
        }
        private static void displayReports() {

//            do {
//                System.out.println("\t1 Month To Date");
//                System.out.println("\t2 Previous Month");
//                System.out.println("\t3 Year To Date");
//                System.out.println("\t4 Previous Year");
//                System.out.println("\t5 Search by Vendor");
//                System.out.println("Back");
//                System.out.println("Command: ");
//
//
//            }

        }





// create static method for nested menu ledger screen
    public static void loadTransactions(){
//            Transaction amazon = new Transaction("2023-04-25", "10:13:25", "ergonomic keyboard", "Amazon",-89.50);
//            Transaction joe = new Transaction("2023-05-05", "11:15:00", "Invoice 1001 paid", "Joe", 1500.00);
//            Transaction routersNetworks = new Transaction("2023-08-18", "01:13:35", "HotSpot", "Routers ADTRAN Aerohive Networks", 65.43);
//            Transaction apple = new Transaction("2023-04-10", "08:13:40", "iPhone X", "Apple", 625.80);
//            Transaction nike = new Transaction("2023-04-16", "06:13:25", "Shoes", "Nike", 99.65);
//            Transaction netflix = new Transaction("2023-04-13", "11:35:00", "Netflix TV", "Netflix", 865.96);
//            Transaction tesla = new Transaction("2023-07-14", "10:53:25", "Steering wheel", "Tesla", 126.99);
//            Transaction walmart = new Transaction("2023-09-19", "03:15:00", "Treadmill", "Walmart", 805.86);
//
//
//
//        Transaction payment = new Transaction();
//                transactions.add(payment);
//            transactions.add(amazon);
//            transactions.add(joe);
//            transactions.add(routersNetworks);
//            transactions.add(apple);
//            transactions.add(nike);
//            transactions.add(netflix);
//            transactions.add(tesla);
//            transactions.add(walmart);


            try {
                FileWriter fileWriter = new FileWriter("./src/main/java/com/dm/transaction.csv");
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

//                bufferedWriter.write(String.valueOf(amazon));
//                bufferedWriter.write(String.valueOf(joe));
//                bufferedWriter.write(String.valueOf(routersNetworks));
//                bufferedWriter.write(String.valueOf(apple));
//                bufferedWriter.write(String.valueOf(nike));
//                bufferedWriter.write(String.valueOf(netflix));
//                bufferedWriter.write(String.valueOf(tesla));
//                bufferedWriter.write(String.valueOf(walmart));

                bufferedWriter.close();


            }catch(IOException e){
                throw new RuntimeException(e);
            }



        try {
            FileReader fileReader = new FileReader("./src/main/java/com/dm/transaction.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String input;

//            String input = bufferedReader.readLine();
            while((input = bufferedReader.readLine()) != null){
                String[] splitInput = input.split("|");

                String transactionDate = splitInput[0];
                String transactionTime = splitInput[1];
                String transactionDescription = splitInput[2];
                String transactionVendor = splitInput[3];
                double transactionAmount = Double.parseDouble(splitInput[4]);

                Transaction currentTransaction = new Transaction (transactionDate, transactionTime, transactionDescription, transactionVendor, transactionAmount);

                System.out.printf(transactionDate, transactionTime, transactionDescription, transactionVendor, transactionVendor);
                currentTransaction.getDate();
                currentTransaction.getTime();
                currentTransaction.getDescription();
                currentTransaction.getVendor();
                currentTransaction.getAmountOfTransaction();
                System.out.println(currentTransaction);

                System.out.println(input);
//
            }
            bufferedReader.close();
        }catch (IOException e) {
            e.printStackTrace();
            System.out.println("Payment Unsuccessful");
            }

        }

//         import or read from file

//            for(int i=0; i<transactions.size();i++){
//                Transaction allTransactions = transactions.get(i);
//                System.out.println(allTransactions);
//            }
//    }

            public static void addDeposit(){
            System.out.println("Please provide info for deposit: ");

            System.out.println("Please Enter the date you would like to make this transaction: ");
            String date = scanner.nextLine();

            System.out.println("Please Enter the time you would like to make this transaction: ");
            String time = scanner.nextLine();

            System.out.println("(Optional) Please Enter Description: ");
            String description = scanner.nextLine();

            System.out.println("Please Enter Vendor Name: ");
            String vendor = scanner.nextLine();

            System.out.println("Please Enter Amount for Deposit: ");
            double amountOfTransaction = scanner.nextDouble();
            scanner.nextLine();


            Transaction payment = new Transaction(date, time, description, vendor, amountOfTransaction);
            transactions.add(payment);

                try {
                    FileWriter fileWriter = new FileWriter("./src/main/java/com/dm/transaction.csv");
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                    bufferedWriter.write(date + "|" + time + "|" + description + "|" + vendor + "|" + amountOfTransaction);
                    System.out.println("Deposit made successful");
                    fileWriter.close();

                }catch (IOException e){
                    System.out.println("Deposit was unsuccessful. ");
                    e.printStackTrace();
                }

//            ArrayList<String> arrayList = new ArrayList<String>();
//
//                arrayList.add(date);
//                arrayList.add(time);
//                arrayList.add(description);
//                arrayList.add(vendor);
//                arrayList.add(String.valueOf(amountOfTransaction));
//                    for(int i=0;i< arrayList.size();i++){
//                        System.out.println("Deposit info" + arrayList.get(i));
//                    }






            // create an instance of new transaction here
        // add to array list of transaction
        }

    public static void makePayment(){
        System.out.println("Please provide info for payment: ");

        System.out.println("Please Enter the date you would like to make this transaction: ");
        String date = scanner.nextLine();

        System.out.println("Please Enter the time you would like to make this transaction: ");
        String time = scanner.nextLine();

        System.out.println("(Optional) Please Enter Description: ");
        String description = scanner.nextLine();

        System.out.println("Please Enter Vendor Name: ");
        String vendor = scanner.nextLine();

        System.out.println("Please Enter Amount for payment: ");
        double amountOfTransaction = scanner.nextDouble();
        scanner.nextLine();


        Transaction payment = new Transaction(date, time, description, vendor, amountOfTransaction);
        transactions.add(payment);

        try {
            FileWriter fileWriter = new FileWriter("./src/main/java/com/dm/transaction.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(date + "|" + time + "|" + description + "|" + vendor + "|" + amountOfTransaction);
            System.out.println("Payment made successful");
            fileWriter.close();

        }catch (IOException e){
            System.out.println("Payment was unsuccessful. ");
            e.printStackTrace();
        }


        // create an instance of new transaction here
        // add to array list of transaction

    }

}



