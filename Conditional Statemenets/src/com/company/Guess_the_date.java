package com.company;
import java.util.Scanner;
public class Guess_the_date {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        int  year = scan.nextInt();
        int  month = scan.nextInt();
        int  day = scan.nextInt();
        String month_print = "Feb";
        if (day != 1){
            day = day - 1;
            switch (month){
                case 1: month_print = "Jan";
                break;
                case 2: month_print = "Feb";
                    break;
                case 3: month_print = "Mar";
                    break;
                case 4: month_print = "Apr";
                    break;
                case 5: month_print = "May";
                    break;
                case 6: month_print = "Jun";
                    break;
                case 7: month_print = "Jul";
                    break;
                case 8: month_print = "Aug";
                    break;
                case 9: month_print = "Sep";
                    break;
                case 10: month_print = "Oct";
                    break;
                case 11: month_print = "Nov";
                    break;
                case 12: month_print = "Dec";
                    break;
            }
            System.out.println(day + "-" + month_print + "-" + year);
        }
        if (day == 1 && month == 1){
            System.out.println(31 + "-" + "Dec" + "-" + (year-1));
        }
        if (day == 1 && (month == 2 || month == 4 || month == 6 || month == 8 || month == 9 || month == 11)){
            switch (month){
                case 2: month_print = "Jan";
                    break;
                case 4: month_print = "Mar";
                    break;
                case 6: month_print = "May";
                    break;
                case 8: month_print = "Jul";
                    break;
                case 9: month_print = "Aug";
                    break;
                case 11: month_print = "Oct";
                    break;
            }
            System.out.println(day + 30 + "-" + month_print + "-" + year);
        }
        if (day == 1 && (month == 5 || month == 7 || month == 10 || month == 12)){
            switch (month){
                case 5: month_print = "Apr";
                    break;
                case 7: month_print = "Jun";
                    break;
                case 10: month_print = "Sept";
                    break;
                case 12: month_print = "Nov";
                    break;
            }
            System.out.println(day + 29 + "-" + month_print + "-" + year);
        }
        if (year%4 == 0 && day == 1 && month == 3){
            System.out.println(29 + "-" + month_print + "-" + year);
        }

    }
}
