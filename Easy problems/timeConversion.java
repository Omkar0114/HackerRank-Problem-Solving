package com.omkar;

public class TimeConversion {
    public static void main(String[] args) {


//        timeConversion("07:05:45AM");

        System.out.println(timeConversion1("07:05:45PM"));
    }

    public static void timeConversion(String s) {
        // Write your code here

        //get hours :
        int h1 = (int) s.charAt(1) - '0';
        int h2 = (int) s.charAt(0) - '0';
        int hh = (h2 * 0 + h1 % 10);

        //if time is in AM :

        if (s.charAt(8) == 'A') {
            if (hh == 12) {
                System.out.print("00");
                for (int i = 2; i <= 7; i++) {
                    System.out.print(s.charAt(i));
                }
            } else {
                System.out.print(hh);
                for (int i = 2; i <= 7; i++) {
                    System.out.print(s.charAt(i));
                }
            }
        }
        // if time is in PM :
        else {
            if (hh == 12) {
                System.out.print("12");
                for (int i = 2; i <= 7; i++)
                    System.out.print(s.charAt(i));
            } else {
                hh = hh + 12;
                System.out.print(hh);
                for (int i = 2; i <= 7; i++) {
                    System.out.print(s.charAt(i));
                }
            }
        }
    }

    // for string return type:


    public static String timeConversion1(String s) {
        // Write your code here
        String str = "";

        if (s.substring(0,2).equals("12") && s.contains("AM")) {
            str = "00";
            s= str + s.substring(2,s.length());
        }

        if (!s.substring(0,2).equals("12") && s.contains("PM")) {
            str = Integer.toString(Integer.parseInt(s.substring(0,2)) + 12);
            s = str + s.substring(2,s.length());
        }
        return s.substring(0,s.length()-2);

    }
}
