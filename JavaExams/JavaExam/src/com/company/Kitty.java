package com.company;

import java.util.Scanner;

public class Kitty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String main[] = str.trim().split("");
        String num = scan.nextLine();
        String [] nums = num.trim().split(" ");
        int [] numbers = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numbers[i] = Integer.parseInt(nums[i]);
        }
        int coderSoul = 0;
        int food =  0;
        int deadlock = 0;
        int index = 0;
        int mainlenght = main.length-1;
        for (int i = 0; i < numbers.length; i++) {

            if ((index+numbers[i]) > mainlenght){
                index = (index + numbers[i])-mainlenght;
            }
            else if ((index+numbers[i]) < 0){
                index = mainlenght + (index+numbers[i]);
            }else {
                index += numbers[i];
            }
            if (main[index].equals("@")){
                coderSoul++;
                main[index] = "";
            }
            else if (main[index].equals("*")){
                food++;
                main[index] = "";
            }
            else if (main[index].equals("x")){
                if (index % 2 == 0){
                    if (coderSoul > 0){
                        coderSoul--;
                    }
                }
            }
        }
    }
}
