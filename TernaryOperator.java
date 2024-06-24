import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks");
        int marks = sc.nextInt();

        String result = marks > 33 ? "PASS" : "FAIL";
        System.out.println(result);
        sc.close();
    }
}
