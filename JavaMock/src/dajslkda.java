import java.util.Scanner;

public class dajslkda {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        boolean isPrime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }

        }
        if(isPrime =true)

        {
            System.out.println(n);
        }else

        {
            System.out.println("is not prime");
        }
    }

}

