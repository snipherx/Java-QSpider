public class Sum_of_digit {
    public static void main(String[] args) {
        int i=123;
        int sum=0;
        do{
            i=i%10;
            sum=sum+i;
            i=i/10;
        }
        while(i>0);
        System.out.println(sum);
    }
    
}
