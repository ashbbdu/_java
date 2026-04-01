package in.ExceptionalAndFileHandling;

public class IllegalArgument {

    public static void printName (String name) throws IllegalArgumentException {
       if(name.contains("_")) {
           throw new IllegalArgumentException("Name contains -");
        }
    }

    public static void main(String[] args) {
        printName("Ashish_srivastava");
    }
}
