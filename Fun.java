import java.util.Scanner;

public class Fun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Enter no (But if you enter multiple of 10 then I am not print Anything..)");
            int no = sc.nextInt();
            if(no % 10 == 0){
                System.out.println("Oops! You looks like enter multiple of 10..");
                continue;
            }
            System.out.println(no);
            sc.close();
        }while(true);

    }
}
