public class StaticBlock {
    static int k;
    static{
        System.out.println("Welcome to the class");
    }
    static
    {
        System.out.println("Class is starting");
    }
    public static void main(String[] args) {
        System.out.println(k);
    }
    static
    {
        System.out.println("Value of k is: "+k);
    }
}
