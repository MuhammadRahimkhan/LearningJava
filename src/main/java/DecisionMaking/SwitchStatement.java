package DecisionMaking;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter first number : ");
        double num1=obj.nextDouble();
        System.out.println("Enter an operation you want perform '+,-,*,/'");
        String operator= obj.next();
        System.out.println("Enter second number : ");
        double result;
        double num2= obj.nextDouble();
       switch (operator)
       {
           case "+":
               result=num1+num2;
               System.out.println("Result : "+result);
               break;
           case "-":
               result=num1-num2;
               System.out.println("Result : "+result);
               break;
           case "*":
               result=num1*num2;
               System.out.println("Result : "+result);
           case "/":
               if(num2==0)
               {
                   System.out.println("Result is Undefined");
                   break;
               }
               result=num1/num2;
               System.out.println("Result : "+result);
           default:
           System.out.println("Wrong operator");
           break;
       }
    }
}
