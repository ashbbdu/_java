public class Operators {
    public static void main(String[] args) {

//        create a program to swap two numbers
        int a = 1;
        int b = 2;

        System.out.println(a);
        System.out.println(b);

        int temp = a;
        a = b ;
        b = temp;
        System.out.println("After swapping");
        System.out.println(a);
        System.out.println(b);


        System.out.println("Operator Priority");
        System.out.println(8-(3*3));
    }
}
