package in.collections;

import java.util.ArrayList;
import java.util.List;

//public class ListUpdated extends ArrayList<Integer> {
//        @Override
//        public boolean add (Integer a) {
//            System.out.println("Adding element: " + a);
//            return super.add(a);
//        }
//
//};

// making the function dynamic so it accepts all the parameters like String , Integer ETC

public class ListUpdated<T> extends ArrayList<T> {
    @Override
    public boolean add (T a) {
        System.out.println("Adding element: " + a);
        return super.add(a);
    }

};
