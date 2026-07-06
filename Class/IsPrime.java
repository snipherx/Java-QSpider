import java.util.Scanner;
public class IsPrime
{
    public static boolean isprime(int i)
    {
        boolean flag=true;
        for(int a=2;a<i/2;a++)
        {
            if(i%a==0)
            {
                flag=false;
                break;
            }
        }
        return flag;
    }
    public static int sumOfPrime(int a,int b)
    {
        int s=0;
        for(int i=a;i<=b;i++)
        {
            if(isprime(i))
            {
                s=s+i;
            }
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a=");
        int a=nextInt();
        int sum=sumOfPrime(a,b);
        System.out.println("Sum of prime no between "+a+" and "+b+"="+sum);
    }
    
}
