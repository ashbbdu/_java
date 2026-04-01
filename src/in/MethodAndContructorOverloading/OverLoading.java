package in.MethodAndContructorOverloading;

public class OverLoading {

    public int a;
    public int b;
//    Constructor overloading

    OverLoading () {
        System.out.println("default constructor called");
    }

    OverLoading (int a) {
        this.a = a;
    }

    OverLoading (int a , int b) {
            this.a = a;
            this.b = b;
    }


    public int add (int a , int b) {
        return a + b;
    }

    public int add (int a , int b , int c) {
        return a + b + c;
    }

    public String add (String a , String b) {
        return a + b;
    }




    public static void main(String[] args) {
        OverLoading o = new OverLoading();
        System.out.println(o.add(1 , 2));
        System.out.println(o.add(1,2,3));
        System.out.println(o.add("Ashish " , "Srivastava"));


        OverLoading o1 = new OverLoading(10);

        OverLoading o2 = new OverLoading(10 , 20);


//        OverLoading o3 = new OverLoading(10 , 20 , 30);
    }
}
