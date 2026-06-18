public class Table {
    public static void main(String[] args) {
        int a=4;
        int i=1;
        do
        {
            if(a%2==0)
            {
                System.out.println(a+"*"+i+"="+a*i);
            }
            else
            {
                System.out.println(a);
            }
            i++;
        }
        while(i<=10);
    }
    
}
