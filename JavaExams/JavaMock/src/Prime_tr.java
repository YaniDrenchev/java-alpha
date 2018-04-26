import java.util.Scanner;

public class Prime_tr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = 6;
        if (n == 1) {
            System.out.print("1");
        }
        if (n == 2) {
            System.out.print("1");
            System.out.println();
            System.out.print("11");
            System.out.println();
        }
        if (n == 3) {
            System.out.print("1");
            System.out.println();
            System.out.print("11");
            System.out.println();
            System.out.print("111");
            System.out.println();
        }
        if (n == 4) {
            System.out.print("1");
            System.out.println();
            System.out.print("11");
            System.out.println();
            System.out.print("111");
            System.out.println();

        }
        if (n == 5) {
            System.out.print("1");
            System.out.println();
            System.out.print("11");
            System.out.println();
            System.out.print("111");
            System.out.println();
            System.out.print("11101");
            System.out.println();
        }

        else if (n > 5) {
            System.out.print("1");
            System.out.println();
            System.out.print("11");
            System.out.println();
            System.out.print("111");
            System.out.println();
            System.out.print("11101");
            System.out.println();

            while (a <= n) {
                //int isPrime = 1;
                int maxDevider = (int) Math.sqrt(a);
                boolean isPrime = true;
                for (int i = 2; i <= maxDevider; i++) {
                    if (a % i == 0) {
                        isPrime = false;
                    }
                }
                if (isPrime == true) {
                    for (int i = 1; i <= a; i++) {
                        boolean isPrime2 = true;
                        int maxDevider2 = (int) Math.sqrt(i);
                        for (int g = 2; g <= maxDevider2; g++) {
                            if (i % g == 0) {
                                isPrime2 = false;
                            }
                        }
                        if (isPrime2 == true) {
                            System.out.print("1");
                        }
                        else {
                            System.out.print("0");
                        }
                    }
                }
                if (isPrime == true){
                    System.out.println();
                }
                a++;
            }
        }
    }
}
