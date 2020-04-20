package com.second;

public class Main {
    public static void main(String[] args) {
        String month = "March";

        if (month == "January" ||
        month == "March" ||
        month == "May" ||
        month == "July" ||
        month == "August" ||
        month == "October" ||
        month == "December"){
            System.out.println("31 дни");
        }
        else if (month == "April" ||
                month == "June" ||
                month == "September" ||
                month == "November"){
            System.out.println("30 дни");
        }
        else if (month == "February"){
            System.out.println("28 или 29 дни");
        }
    }
}
