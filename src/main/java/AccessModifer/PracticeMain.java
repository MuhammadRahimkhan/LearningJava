package AccessModifer;

import org.example.ProtectedClass;

import java.util.Scanner;

public class PracticeMain {
    public static void main(String[] args) {

        //Implementation of public access modifier
        PublicAccessModifier area=new PublicAccessModifier();
        System.out.println("Calculate Area of Triangle");
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Length");
        int length= obj.nextInt();
        System.out.println("Enter Width");
        int width = obj.nextInt();
        System.out.println("Area of rectangle");
        System.out.println(area.calculateArea(length,width));


        //Protected
        //Protected Access Modifier from different package can not be access without having inheritance
        ProtectedClass pro=new ProtectedClass();

        //Display function is access-able as it is in same package
        ProtectedAccessModifier protect=new ProtectedAccessModifier();
        protect.display();



        //Private
        //Display function is not access-able as it is private
        PrivateAccessModifier pri=new PrivateAccessModifier();



        //Default
        //Access-able with in package
        DefaultAccessModifier defMod=new DefaultAccessModifier();
        defMod.displayDefaultAccessModifier();

        //Not access-able in other package
        ProtectedAccessModifier Def1=new ProtectedAccessModifier();
        //Def1.displayDefaultAccessModifier();

    }
}
