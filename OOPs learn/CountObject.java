public class CountObject {
    static int count;
    int a;
    {
        count++;
        a=count;
    }
    public static void main(String[] args) {
        CountObject cnt1=new CountObject();
        CountObject cnt2=new CountObject();
        CountObject cnt3=new CountObject();
        System.out.println("No of object created: "+cnt3.a);
    }
}
