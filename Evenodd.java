//Program to check whether the given number is even or odd number

import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        if (n >= 0) {
            if (n % 2 == 0)
                System.out.println("even");
            else
                System.out.println("odd");
        } else
            System.out.println("invalid");
            obj.close();
    }

}
