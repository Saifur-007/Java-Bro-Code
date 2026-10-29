public class Main {
    public static void main(String[] args){

    // Variables

    // Primitive = stored directly in the memory (Stack).
    // Reference = memory address (Stack) that points to the (Heap).

    // Primitive Data types

    // int
    // double
    // char
    // boolean

    // Reference Data types

    // String
    // Aray
    // Object

    int myAge = 25;
    double userAge = 21;
    String name = "Saif";
    boolean isStudent = false;
    boolean isSale = false;

    char grade = 'A';
    char currency = '$';

    if(!isStudent){
        System.out.println("You are not a Student.");
    }else {
        System.out.println("You are a Student.");
    }

    System.out.print("My age is " + myAge+".");
    }
}
