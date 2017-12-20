import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Couple {
    public static void main(String args []) {
        //String [] couples = {"x1","y1","x2","y2","x3","y3","x4","y4","x5","y5"};
       // System.out.println(couples[0]);

        ArrayList arr = new ArrayList(); // this is an import array list which allows me to use the add. function to add lists manually inside the empy array list.

        arr.add("x1");
        arr.add("y1");
        arr.add("x2");
        arr.add("y2");
        arr.add("x3");
        arr.add("y3");
        arr.add("x4");
        arr.add("y4");
        arr.add("x5");
        arr.add("y5");
                    //this will add an object inside the array
        System.out.println(arr);

        for(int i = 0; i < 10; i++) {
            Collections.shuffle(arr);
           // System.out.println(couples);
        }

            ArrayList couples = new ArrayList (arr);


            System.out.println(couples.get(0) + " is buying for " + couples.get(2));
            System.out.println(couples.get(4) + " is buying for " + couples.get(6));
            System.out.println(couples.get(8) + " is buying for " + couples.get(9));
    }


}
