package DecisionMaking;

import java.util.Scanner;

public class ifStatementPractice {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the marks of student to check the grades");
        int marks=obj.nextInt();
        if(marks>100){
            System.out.println("You Enter wrongs marks");
        }
        if(marks>=91 && marks <=100)
        {
            System.out.println("This Student total marks is "+marks+" and grade : A+ ");
        }
        if(marks>=81 && marks <=90)
        {
            System.out.println("This Student total marks is "+marks+" and grade : A ");
        }
        if(marks>=71 && marks <=80)
        {
            System.out.println("This Student total marks is "+marks+" and grade : B+ ");
        }
        if(marks>=61 && marks <=70)
        {
            System.out.println("This Student total marks is "+marks+" and grade : B ");
        }
        if(marks>=51 && marks <=60)
        {
            System.out.println("This Student total marks is "+marks+" and grade : C+ ");
        }
        if(marks>=41 && marks <=50)
        {
            System.out.println("This Student total marks is "+marks+" and grade : C ");
        }
        if(marks <=40)
        {
            System.out.println("This Student total marks is "+marks+" and grade : D ");
        }


    }

}
