package AccessModifer;

import org.example.ProtectedClass;

import java.util.Scanner;

public class ProtectedAccessModifier extends ProtectedClass {

    protected void display(){
        System.out.println("This is protected function");
    }

    public static void main(String[] args) {
        ProtectedAccessModifier area=new ProtectedAccessModifier();
        System.out.println("Calculate Area of circle");
        Scanner obj=new Scanner(System.in);

            System.out.println("Enter Radius Of circle");
            int rad= obj.nextInt();
            System.out.println("Area of Circle");
            System.out.println(area.calculateArea(rad));
        }
    }


