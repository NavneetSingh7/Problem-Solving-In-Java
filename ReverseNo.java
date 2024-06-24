//Reverse of a Given Number.....

import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number: ");
        int no = sc.nextInt();
        

        /*Print Reverse of a no */ 
        // while (no > 0) {
        //     int x = no % 10;
        //     System.out.print(x);
        //     no /= 10;
        // }
            

        /*Reverse of a given no */
        int rev = 0;
        while (no > 0) {
            int x = no % 10;
            rev = (rev*10) + x;
            no /= 10;
        }
        System.out.println(rev);
        

        sc.close();
    }
}
