import java.util.Scanner;

public class EvenOddSum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int evenSum = 0;
        int oddSum = 0;
        int choice = 0;

        do{
            System.out.print("Enter no: ");
            int no = sc.nextInt();
            if(no % 2==0){
                evenSum += no;
            }
            else{
                oddSum += no;
            }
            System.out.println("Do you want to continue -> Press 1 for YES and 0 for NO");
            choice = sc.nextInt();
        
        }while(choice==1);

        System.out.println("Even no sum = "+evenSum);
        System.out.println("Odd no sum = "+oddSum);

        sc.close();
    }
}
