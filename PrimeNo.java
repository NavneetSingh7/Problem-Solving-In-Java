import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no (You want to check Prime or not!): ");
        int num = sc.nextInt();

        boolean isPrime = true;
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime == true) {
            System.out.println(num + " is Prime Number");
        } else {
            System.out.println(num + " is Not a Prime Number");
        }

        sc.close();
    }
}
