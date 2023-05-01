package com.dm;

public class Transactions {


        ////////To String

        @Override
        public String toString() {
            return "Transactions{" +
                    "date='" + date + '\'' +
                    ", time='" + time + '\'' +
                    ", description='" + description + '\'' +
                    ", vendor='" + vendor + '\'' +
                    ", amountOfDeposit=" + amountOfDeposit +
                    ", amountOfPayment=" + amountOfPayment +
                    '}';
        }

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

        public double getAmountOfDeposit() {
            return amountOfDeposit;
        }

        public void setAmountOfDeposit(double amountOfDeposit) {
            this.amountOfDeposit = amountOfDeposit;
        }

        public double getAmountOfPayment() {
            return amountOfPayment;
        }

        public void setAmountOfPayment(double amountOfPayment) {
            this.amountOfPayment = amountOfPayment;
        }

        ///////// Constructors
        public Transactions(String date, String time, String description, String vendor, double amountOfDeposit, double amountOfPayment) {
            this.date = date;
            this.time = time;
            this.description = description;
            this.vendor = vendor;
            this.amountOfDeposit = amountOfDeposit;
            this.amountOfPayment = amountOfPayment;
        }

        private String date;
        private String time;
        private String description;
        private String vendor;
        private double amountOfDeposit;
        private double amountOfPayment;

    }
