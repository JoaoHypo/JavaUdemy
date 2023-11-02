package GetPut;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Program {
    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<Object> myObjs = new ArrayList<Object>();
        copy(myInts, myObjs);
        printList(myObjs);
        copy(myDoubles, myObjs);
        printList(myObjs);

        //trying to understand the specific typo for myObjs after the copy process.
        Class<?> objectClass = myObjs.getClass();
        System.out.println("The object's class is: " + objectClass.getName());

    }

    public static void copy(List<? extends Number> source, List<? super Number> destiny) {
        for(Number number : source) {
            destiny.add(number);
        }
    }

    //Contravariance super "get" limitation only persists within the method running,
    // afterward it will be a super+ instance
    public static void printList(List<?> list) {
        for (int i = 0 ; i < list.size();i++) {
            //Integer o = list.get(i); error
            //Number o = list.get(i); error
            Object o = list.get(i);
            System.out.println(o);
        }
        System.out.println();
    }
}
