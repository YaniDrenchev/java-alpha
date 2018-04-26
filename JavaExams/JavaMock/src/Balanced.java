import java.util.Scanner;

public class Balanced {
    public static void main(String[] args) {
        int Balanced = 0;
        Scanner scan = new Scanner(System.in);
        int sumOfall = 0;
        while (true){
            String lines = scan.nextLine();
            int balanced = Integer.parseInt(lines);
            String[] strs = lines.trim().split("");
            int[] numbers = new int[strs.length];
            for (int i = 0; i < strs.length; i++) {
                numbers[i] = Integer.parseInt(strs[i]);
            }
            int sum = numbers[0] + numbers[2];
            if (sum == numbers[1]){
                sumOfall = sumOfall + balanced;
            }
            else {
                break;
            }
        }
        System.out.println(sumOfall);
    }
}
