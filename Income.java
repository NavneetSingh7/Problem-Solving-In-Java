// Income tak calculator

import java.util.Scanner;

public class Income{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Income: ");
        double inc = sc.nextDouble();
        double tax;

        if (inc < 500000) {
            System.out.println("NO Income Tax");
        }
        else if (inc > 500000 && inc < 1000000) {
            tax = inc * 0.2;
            System.out.println("Your Income =" + inc);
            System.out.println("So Pay 20% Tax = " + tax);
        }
        else if (inc > 1000000) {
            tax = inc * 0.3;
            System.out.println("Your Income =" + inc);
            System.out.println("So Pay 30% Tax = " + tax);
        }

        sc.close();
    }
}
