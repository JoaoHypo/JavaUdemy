package RestrictedGenerics;

import java.util.ArrayList;
import java.util.List;

public class Contravariance {
    public static void main(String[] args) {
        List<Object> myObjs = new ArrayList<Object>();
        myObjs.add("Maria");
        myObjs.add("Alex");
        List<? super Number> myNums = myObjs;
        myNums.add(10);
        myNums.add(3.14);
        Integer x = (Integer) myNums.get(0);
        //only with casting to get the data, but not practical,
        // since we could have multiple typos inside this array

        //get - Error
        //put - Ok
    }
}
