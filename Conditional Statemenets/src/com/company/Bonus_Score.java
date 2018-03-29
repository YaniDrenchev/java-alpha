package com.company;
import java.util.Scanner;
public class Bonus_Score {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();
        if (score>=1 && score<=3){
            System.out.println(score*10);
        }else if (score>=4 && score<=6){
            System.out.println(score*100);
        }else if (score>=7 && score<=9){
        System.out.println(score*1000);
        }else{
            System.out.println("invalid score");
        }
    }
}
