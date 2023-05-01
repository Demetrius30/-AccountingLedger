package com.dm;

// import scanner, file reader
//make constructors, getters and setters
//create home screen class
//The home screen should have D) Add Deposit - prompt user for the deposit information and save it
//to the csv file
//▪ P) Make Payment (Debit) - prompt user for the debit information
//and save it to the csv file
//▪ L) Ledger - display the ledger screen
//▪ X) Exit - exit the application
//Ledger - All entries should show the newest entries first
//o A) All - Display all entries
//o D) Deposits - Display only the entries that are deposits into the account
//o P) Payments - Display only the negative entries (or payments)
//o R) Reports - A new screen that allows the user to run pre-defined reports or
//to run a custom search
//▪ 1) Month To Date
//▪ 2) Previous Month
//▪ 3) Year To Date
//▪ 4) Previous Year
//▪ 5) Search by Vendor - prompt the user for the vendor name and
//display all entries for that vendor
//▪ 0) Back - go back to the report page
//o H) Home - go back to the home page

import java.util.ArrayList;
import java.util.Scanner;

public class LedgerApp {

//        static ArrayList<Transactions> transactions = new ArrayList<>();
        static Scanner scanner = new Scanner(System.in);

        public static void transactions(String[] args){

            loadTransactions();

            String input = null;
            do{
                System.out.println("Please enter a command: ");
                System.out.println("\t1: Add deposit here");
                System.out.println("\t2: Make payment here");
                System.out.println("\t3: Display Ledger Screen");
                System.out.println("\t4: Exit");
                System.out.println("Command");

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

    public static void loadTransactions(){}

    public static void addDeposit(){
            System.out.println("Please provide info for deposit: ");

            System.out.println("Please Enter Vendor Name: ");
            String vendor = scanner.nextLine();

            System.out.println("Please Enter Amount for Deposit: ");
            double amountOfDeposit = scanner.nextDouble();

            System.out.println("Please Enter the date you would like to make this transaction: ");
            String date = scanner.nextLine();

            System.out.println("Please Enter the time you would like to make this transaction: ");
            String time = scanner.nextLine();

            System.out.println("(Optional) Please Enter Description: ");
            String description = scanner.nextLine();
        }

    public static void makePayment(){
        System.out.println("Please provide info for payment: ");

        System.out.println("Please Enter Vendor Name: ");
        String vendor = scanner.nextLine();

        System.out.println("Please Enter Amount for payment: ");
        double amountOfDeposit = scanner.nextDouble();

        System.out.println("Please Enter the date you would like to make this transaction: ");
        String date = scanner.nextLine();

        System.out.println("Please Enter the time you would like to make this transaction: ");
        String time = scanner.nextLine();

        System.out.println("(Optional) Please Enter Description: ");
        String description = scanner.nextLine();

    }


    public static void displayLedger(){


    }
}
class LedgerScreen{
    static Scanner scanner = new Scanner(System.in);

    String subInput;

    public static void ledgerScreen(String[] args){

        String subInput;
    }
        do{
            System.out.println("Please enter a command: ");
            System.out.println("\t1 Display all Entries");
            System.out.println("\t2 Display deposit entries only");
            System.out.println("\t3 Display payment entries only");
            System.out.println("\t4 Display Reports");
            System.out.println("\t5 Return to Home screen");
            System.out.println("Command: ");

            subInput = String.valueOf(scanner.hasNext());

            switch (subInput){
                case "1":
                    displayAll();
                    System.out.println("\t1 Display all Entries");
                    break;
                case "2":
                    displayDeposits();
                    System.out.println("\t2 Display deposit entries only");
                    break;
                case "3":
                    displayPayments();
                    System.out.println("\t3 Display payment entries only");
                    break;
                case "4":
                    displayReports();
                    System.out.println("\t4 Display Reports");
                    break;
                case "5":
                    System.out.println("\t5 Return to Home screen");
                    break;
                default:
                    System.out.println("Invalid input");

            }while(!subInput.equalsIgnoreCase("5"));


    }
        private void displayAll(){}

        private void displayDeposits(){}
        private void displayPayments(){}
        private void displayReports() {

            do {
                System.out.println("\t1 Month To Date");
                System.out.println("\t2 Previous Month");
                System.out.println("\t3 Year To Date");
                System.out.println("\t4 Previous Year");
                System.out.println("\t5 Search by Vendor");
                System.out.println("Back");
                System.out.println("Command: ");

                subInput = scanner.nextLine();

                switch (subInput){
                    case "2":
                        displayMonthToDate
                }

            }
        }
}

