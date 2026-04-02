package in.collections;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListCollection {
    public static void main(String[] args) {
        List<Integer> l = new ListUpdated<>();
        l.add(1);
        l.add(2);
        System.out.println(l);


        List<String> s = new ListUpdated<>();
        s.add("Ashish");
        s.add("Madhur");

        System.out.println(s);

//        List

        List <Integer> nc = new ArrayList<>();
        nc.add(1);
        System.out.println(nc);
        nc.add(0 , 10);
        System.out.println(nc);
        System.out.println(nc.size());


        for(Integer i : nc) {
            System.out.println(i);
        }
    }
}