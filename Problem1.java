import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        if(n>=1 && n<=100){
            if(n%2!=0)
                System.out.println("Weird");
            else{
                if(n>=2 && n<=5)
                    System.out.println("Not Weird");
                else if(n>=6 && n<=20)
                    System.out.println("Weird");
                else
                    System.out.println("Not Weird");
            }
        }
        obj.close();
    }

}
