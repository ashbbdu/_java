package in.ExceptionalAndFileHandling;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number !");
        System.out.println("Enter second number !");



        int a = sc.nextInt();
        int b = sc.nextInt();

        try {

            int [] arr = new int[5];
//            int c = a / b;
            arr[6] = 10;
            System.out.println(arr[6]);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
