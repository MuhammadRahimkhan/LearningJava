package DecisionMaking;

import java.util.ArrayList;
import java.util.List;

public class NestedIf_Practice {
    public static void main(String[] args) {
        List<Integer> number=new ArrayList<>();
        List<Integer>UpgradedNumber=new ArrayList<>();
        number.add(73);
        number.add(67);
        number.add(38);
        number.add(33);
        number.add(40);
        System.out.println("Marks Obtains by student :");
        System.out.println(number);
        int size= number.size();
        for(int i=0;i<size;i++) {

            int value=number.get(i);
            int add = value%5;
            if ( value>= 38 && value % 5 >= 3) {
                if (add == 3) {
                    value = value+ 2;
                }
                if (add == 4) {
                    value = value + 1;
                }
            }
            UpgradedNumber.add(value);
        }
        System.out.println("Up graded marks of Student");
        System.out.println(UpgradedNumber);
        for(int k=0;k<UpgradedNumber.size();k++) {
            if (UpgradedNumber.get(k)>39){
                System.out.println("This Student is Pass with total marks : "+UpgradedNumber.get(k));
            }else {
                System.out.println("This Student is fail with marks : " + UpgradedNumber.get(k));
            }
        }
    }
}
