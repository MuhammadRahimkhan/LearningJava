package org.example;

public class ProtectedClass {
    protected double calculateArea(int r){
        return Math.PI*r*r;
    }

    void displayDefaultAccessModifier(){
        System.out.println("This Function is default");
    }
}