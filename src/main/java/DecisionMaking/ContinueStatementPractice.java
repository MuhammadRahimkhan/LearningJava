package DecisionMaking;

import java.util.Scanner;

public class ContinueStatementPractice {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number to where you find even numbers");
        int num=obj.nextInt();
        for (int i = 0; i < num; i++) {

            if (i % 2 == 0)
                continue;

            System.out.print(i + " ");
        }

    }
}
