// One programming language has the following keywords that cannot be used as 
// identifiers:
// break, case, continue, default, defer, else, for, func, goto, if, map, range, return, 
// struct, type, var
// Write a program to find if the given word is a keyword or not

import java.util.Scanner;

public class Keyword {
    public static void main(String[] args) {
        String str[] = { "break", "case", "continue", "default", "defer", "else", "for", "func", "goto", "if", "map",
                "range", "return", "struct", "type", "var" };

                int flag = 0;
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter keywords: ");
                String input = sc.nextLine();

        for (int i = 0; i <= str.length; i++) {
            if ((str[i]).equals(input)) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println(input + " is a reserved keyword");
        } else {
            System.out.println(input + " is not a reserved keyword");
        }
        sc.close();
    }
}
