import java.awt.*;
import java.util.ArrayList;
import java.util.List;
//import java.util.*;

public class MyHashMap {

    private Container c;//a container c will provide me to use it to place and remove elements in the list
    private List<Container> recordList;//this is a list container called record list which allows me to use the

    public MyHashMap() {
        this.recordList = new ArrayList<Container>();
    }//this is applying the insatnce variable recordlist to the new arraylist

    public void put(Object k, Object v) {
// add code to put element in ‘MyHashMap
        c = new Container();//have to make another c container to initialise it inside the method
        this.c.insert(k, v);//this will insert the variables k and v inside the c container so i cacn use it in the future
//

        if (this.recordList.size() == 0) {//if the record list is empty the add the container c or else have a for each container in record list
            this.recordList.add(c);
        } else {

            for (Container ContainerT : this.recordList) {//if the container is is applied to k then add the value as well
                if(ContainerT.key == k){
                    ContainerT.value = v;
                }

            }
            this.recordList.add(c);// this will return container regardless of any other conditions
        }
    }


//}

    public boolean remove(Object k) {
// add code to remove element of which the key is k


        for (Container ContainerT : this.recordList) {//this is the similar approach to putting but i am removing k from the element list
            if (ContainerT.key == k) {
                this.recordList.remove(ContainerT);
                return true;//this is true at the moment
            }

        }
    return false;//then it will return false due to container being removed at this state.
    }
    public String toString() {
// add code to reflect the correct output.
        return "" +this.recordList +"";
    }
    public void printMyHashMap() {
// code the print MyHashMap
        System.out.println(toString());
    }
    public Object get(Object k){
// add code get a value of the key k
        for(Container ContainerT : this.recordList){
            if(ContainerT.key == k){
                return ContainerT.value;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();
        map.put("aaa", 10);
        map.put("bbb", 20);
        map.put("ccc", 30);
        map.put("ddd", 40);
        System.out.println(map.get("ccc"));
        map.put("ccc", 50);
        map.remove("aaa");
        System.out.println(map.get("aaa"));
        System.out.println(map.get("bbb"));
        System.out.println(map.get("eee"));
        map.printMyHashMap();
    }

}
