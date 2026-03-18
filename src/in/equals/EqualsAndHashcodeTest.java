package in.equals;

public class EqualsAndHashcodeTest {
    public static void main(String[] args) {
        Person p1 = new Person("Ash" , 21 , "1");
        Person p2 =  new Person("Ash" , 21 , "1");

//        this will return NE because this will compare the address in the heap memory
        if(p1 == p2) {
            System.out.println("Equals");
        } else {
            System.out.println("NE");
        }

        System.out.println(p2.equals(p1));

    }
}
