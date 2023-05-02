package com.dm;

public class Transaction {


        ////////To String

    ////////// Getters and Setters
        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getVendor() {
            return vendor;
        }

        public void setVendor(String vendor) {
            this.vendor = vendor;
        }

        ///////// Constructors
        public Transaction(String date, String time, String description, String vendor, double amountOfDeposit, double amountOfPayment) {
            this.date = date;
            this.time = time;
            this.description = description;
            this.vendor = vendor;

        }

        private String date;
        private String time;
        private String description;
        private String vendor;

    public Transaction(String date, String time, String description, String vendor, double amountOfTransaction) {
        this.date = date;
        this.time = time;
        this.description = description;
        this.vendor = vendor;
        this.amountOfTransaction = amountOfTransaction;
    }

    private double amountOfTransaction;

    @Override
    public String toString() {
        return "Transactions{" +
                "date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", description='" + description + '\'' +
                ", vendor='" + vendor + '\'' +
                ", amountOfTransaction=" + amountOfTransaction +
                '}';
    }

    public double getAmountOfTransaction() {
        return amountOfTransaction;
    }

    public Transaction(double amountOfTransaction) {
        this.amountOfTransaction = amountOfTransaction;
    }

    public void setAmountOfTransaction(double amountOfTransaction) {
        this.amountOfTransaction = amountOfTransaction;
    }
}
