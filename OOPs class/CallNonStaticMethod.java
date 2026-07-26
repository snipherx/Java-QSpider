public class CallNonStaticMethod {
    public void sayHello()
    {
        System.out.println("Saying hello....");
        sayBye();
    }
    public void sayBye()
    {
        System.out.println("Bye...");
        //sayHello();
    }
    public static void main(String[] args) {
        CallNonStaticMethod p=new CallNonStaticMethod();
        p.sayHello();
    }
    
}
