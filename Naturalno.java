//Sum of n Natural Numbers..

import java.util.Scanner;

public class Naturalno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no (you want to print sum till that no) :- ");
        int no = sc.nextInt();
        
        /*int sum = 0;
        for(int i = 0; i<=no ; i++){
            sum += i;
        }*/

        
        //int i = 0;
        //     while (i <= no) {
        //     sum += i;
        //     i++;
        // }

        
        int sum = 0;
        int i = 0;
        do{
            sum += i;
            i++;
        }while(i <= no);
        
        System.out.println(sum);

        sc.close();
    }
}
