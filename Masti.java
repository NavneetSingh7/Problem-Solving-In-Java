import java.util.Scanner;

public class Masti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.print("Enter any value (But if you enter multiple of 10 then I am out):");
            int no = sc.nextInt();
            if(no % 10 == 0){
                System.out.println("You enter multiple of 10, So that's why I am Out..");
                break;
            }
            System.out.println("You enter: " + no);

        }
        while(true);

        sc.close();
    }
}
