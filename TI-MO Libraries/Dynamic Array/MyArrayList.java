import java.util.*;
public class MyArrayList {

    private static final int SIZE_FACTOR=10;
    private Object data[];
    private int index;
    private int size;
    public MyArrayList(){
        this.data=new Object[SIZE_FACTOR];
        this.size=SIZE_FACTOR;
    }
    public void add(Object obj) {
//add your code
//        for(int i = 0; i < size; i++){
//            if(data == this.size){
//                continue;
//            }else
//                size[i] = data[i];
//        }


//        if (data.length == size) {
//            Object[] newl = new Object[size + 1];
//            for (int i = 0; i < size; i++) {
//                data[i] = newl[i];
//            }
//            System.out.println(data);
//        }
//        return obj;
if(this.data.length == index){//if the length of the data object is equal to the index of the obj, then execute the next command.
    extend();//call the method "extend"
}
this.data[index] = obj;//else the index will keep on adding one at a time until it reaches the condition where the both index and the data object are equal.
    index++;
    }
    public Object get(int i) throws Exception{
    return this.data[index];//this will return the index of data object.
//add your code
    }
    public void remove(int i) throws Exception{
//            if(size == 0){
//                i = 0;
//            }else{
//                i--;
//            }

   if(index ==-0){//if the index is 0 then it'll return the alue 0 ias index.
       index = 0;
   }else {
       index --;//or else the index will be decreased by one every loop
       this.data[index] = this.data[index];
   }

    }
public void extend(){//this is the extend method, which will be called upon the add method.
        int newL = data.length + this.size;//there will be a new variable newL (integer) which will get teh data length and the size.
        Object[] newS = new Object[newL];//object array newS will be created which will have all the elements of newL inside the array.
        for(int i = 0; i < data.length; i++){//it'll copy the data object indexes to the newS array obj.
            newS[i] = data[i];
        }
}
//add your code

    public static void main(String[] args) throws Exception {
        MyArrayList mal = new MyArrayList();
        mal.add("zero");
        mal.add("one");
        mal.add("two");
        mal.add("three");
        mal.add("four");
        mal.add("five");
        mal.add("six");
        mal.add("seven");
        mal.add("eight");
        mal.add("nine");
        mal.remove(6);//this will remove the 6th element of newS


        System.out.println(mal.get(8));//this will get the 8th element of the array newS
    }
}




