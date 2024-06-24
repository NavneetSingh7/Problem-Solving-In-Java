import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        int fact = 1;

        if (num < 1) {
            System.out.println("Please enter positive number");
        }

        if (num > 0) {
            for (int i = 1; i <= num; i++) {
                fact *= i;
            }
            System.out.println("Factorial = " + fact);
        }

        sc.close();
    }
}
