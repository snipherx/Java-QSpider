public class Demo {
    static int sqr;
    static
    {
        sqr=SqrOfNo(4);
    }
    public static int SqrOfNo(int a)
    {
        return a*a;
    }
    public static void main(String[] args) {
        System.out.println(Demo.sqr);
    }
}   

