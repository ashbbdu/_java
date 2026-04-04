package in.collections;

import java.util.Collection;

public class Utility {
//    <T> is called as generic
    public static<T> void print (Collection<T> collection) {
        for (T coll : collection) {
            System.out.print(coll.toString() + " ");
        }
    }
}
