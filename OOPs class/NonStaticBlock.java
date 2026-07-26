public class NonStaticBlock {
    int k=10;
    //we will create a non static block
    {
        System.out.println("It's a non static block");
        System.out.println("initially value of k= "+k);
        k=20;
        System.out.println("After re-initializing k= "+k);
    }
    public static void main(String[] args) {
        NonStaticBlock b=new NonStaticBlock();
        System.out.println("call k in main method= "+b.k);
    }
    
}
