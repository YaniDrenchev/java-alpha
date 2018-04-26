package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

    public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String mainstring = br.readLine();
            String mainString[] = mainstring.trim().split("");

            int times = Integer.parseInt(br.readLine());

            int count = 0;
            System.out.println();
            while (count < times) {
                String newWord = "";
                int title = 0;
                String check = br.readLine();
                String chars[] = check.trim().split("");
                int buff = 0;
                for (int i = 0; i < mainString.length; i++) {

                    if (buff >= chars.length) {
                        break;
                    }
                    if (mainString[i].equals(chars[buff])) {
                        title++;
                        buff++;
                    }
                }

                buff = 0;
                if (title == check.length()) {
                    for (int i = 0; i < mainString.length; i++) {

                        if (buff >= chars.length) {
                            break;
                        }
                        if (mainString[i].equals(chars[buff])) {
                            mainString[i] = "";
                            buff++;
                        }

                    }
                    for (int i = 0; i < mainString.length; i++) {
                        if (!mainString[i].equals("")) {
                            newWord = newWord + mainString[i];
                        }
                    }

                }else{
                    newWord = "No such title found!";
                }
                count++;
                System.out.println(newWord);
            }

        }

}