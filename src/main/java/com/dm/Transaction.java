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

        public float getAmountOfTransaction() { return amountOfTransaction; }

        public void setAmountOfTransaction(float amountOfTransaction) {this.amountOfTransaction = amountOfTransaction;}

        ///////// Constructors



        private String date;
        private String time;
        private String description;
        private String vendor;
        private float amountOfTransaction;

    public Transaction(String date, String time, String description, String vendor, float amountOfTransaction) {
        this.date = date;
        this.time = time;
        this.description = description;
        this.vendor = vendor;
        this.amountOfTransaction = amountOfTransaction;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", description='" + description + '\'' +
                ", vendor='" + vendor + '\'' +
                ", amountOfTransaction=" + amountOfTransaction +
                '}';
    }


    public Transaction(float amountOfTransaction) {
        this.amountOfTransaction = amountOfTransaction;
    }


}
