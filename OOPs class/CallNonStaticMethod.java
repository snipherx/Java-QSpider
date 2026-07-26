public class CallNonStaticMethod {
    int k;  //Non Static Variable
    public void sayHello()
    {
        System.out.println("Saying hello....");
        sayBye();
        System.out.println(k); //we can use 'k' in non static method
    }
    public void sayBye()
    {
        System.out.println("Bye...");
        //sayHello();
    }
    public static void main(String[] args) {
        CallNonStaticMethod p=new CallNonStaticMethod();
        p.sayHello();
        System.out.println(p.k);  //In static method we have to use it with the help of object
    }
    
}
