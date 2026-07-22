//package OOPs class;

public class Child 
{
    static int a;
    static{
        a=10;
        a=20;
        a=30;
    }

    public static void main(String[] args) {
        Parent.greet();  //calling static method another class method
        System.out.println("Using another class variable :"+Parent.x); //using another class variable

        System.out.println(a);
    }
    
}
