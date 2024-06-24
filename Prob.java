//Check given number is positive number or not....

import java.util.Scanner;

public class Prob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt();
        if(num > 0){
            System.out.println(num + " is Positive Number");
        }
        else {
            System.out.println(num+ " is Negative Number");
        }

        sc.close();
    }
}
