package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class SecretMessegeRec {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String encodedMessage = scan.nextLine();

        String str[] = encodedMessage.replaceAll("\\d", "").split("");
        ArrayList<String> decodedMassage = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            decodedMassage.add(str[i]);
        }
        String[] numbers1 = encodedMessage.replaceAll("[^0-9]+", " ").trim().split(" ");
        int numbers[] = new int[numbers1.length];
        for (int i = 0; i < numbers1.length; i++) {
            numbers[i] = Integer.parseInt(numbers1[i]);
        }
        int numberOfBraccets = numbers1.length-1;

        ArrayList<String> message = decode(decodedMassage, 0, numberOfBraccets, numbers);
//        numberOfBraccets--;

//        for (int i = 0; i < message.size(); i++) {
//            System.out.print(message.get(i));
//        }
//    }

    }

    static ArrayList<String> decode(ArrayList<String> message, int currentIndex, int braccets, int[] numbers) {
        if (!message.contains("{") && !message.contains("}")) {
            return message;
        }
        int countBraccets = 0;
        int index = currentIndex;
        int endIndex = 0;
        int startIndex = 0;
        while (index < message.size()) {
            String currentChar = message.get(index);
            if (message.get(index).equals("}")) {
                countBraccets++;
                if (countBraccets == braccets) {
                    endIndex = index;
                }
            }
            index++;
        }
        if (endIndex >= message.size()){
            endIndex--;
        }
        for (int i = endIndex;i >= 0; i--){
            if (message.get(i).equals("{")) {
                startIndex = i;
                break;
            }
        }
        currentIndex = startIndex;
        ArrayList<String> messagetobeAdded = new ArrayList<>();
        for (int i = 0;i < numbers[braccets]; i++) {
            for (int j = startIndex+1; j < endIndex; j++) {
                messagetobeAdded.add(message.get(j));
            }
        }

        for ( int i = 0; i < messagetobeAdded.size(); i++){
            message.set(startIndex, messagetobeAdded.get(i));
            startIndex++;
        }
        return decode(message, currentIndex,braccets-1, numbers);
    }
}
