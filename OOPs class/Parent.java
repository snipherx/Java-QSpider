//package OOPs class;

public class Parent
{
    static boolean x;    //static global variable

    public static void greet()
    {
        System.out.println("Welcome");
    }
    public static void main(String[] args) {
        System.out.println("Using method calling way-1");
        greet();                                   //direct calling of static method
        System.out.println("Using method calling way-2");
        Parent.greet();                           //call using access operator " . " of static method

        System.out.println("Method-1 :"+x);   //Method-1 of using global variable
        System.out.println("Method-2 :"+Parent.x);     //Method-2 of using global variable

    }
    
}
