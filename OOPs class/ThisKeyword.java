public class ThisKeyword {
    int k=10;
    public void keywordThis()
    {
        int k=20;
        System.out.println("Local variable value ="+k);
        System.out.println("Non static variable value ="+this.k);  //we can access non-static variable inside non-static context(only)
    }
    public static void main(String[] args) {
        ThisKeyword a=new ThisKeyword();
        a.keywordThis();
    }
    
}
