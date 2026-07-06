public class ForLoop 
{
    public static void main(String[] args)
    {   
        //For Loop:

        //Q1-WAJP to print Square of all digit of given a number.
        /*for(int i=534;i>0;i=i/10)
        {
            int sqr=i%10;
            System.out.println("Square of "+sqr+"="+sqr*sqr);
        }*/

        //Q2-WAJP to print table of number in revrse order.
        /*int n=8;
        for(int i=10;i>0;i--)
        {
            System.out.println(n+"*"+i+"="+n*i);
        }*/

        //Q3-WAJP to calculate  product of natural number till n(Factorial).
        /*int n=8;
        int factorial=1;
        for(int i=1;i<=n;i++)
        {
            factorial=factorial*i;
        }
        System.out.println("Factorial of "+n+" = "+factorial);*/

        //Q4-WAJP to print numbers from 1 to 10.
        /*for(int i=1;i<=10;i++)
        {
            System.out.println(i);
        }*/

        //Q5-WAJP to print number from 10 to 1.
        /*for(int i=10;i>=1;i--)
        {
            System.out.println(i);
        }*/

        //Q6-WAJP to print all even numbers between 1 to 100.
        /*for(int i=1;i<=100;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }*/

        //Q7-WAJP to print all odd numbers between 1 to 100.
        /*for(int i=1;i<=100;i++)
        {
            if(i%2!=0)
            {
                System.out.println(i);
            }
        }*/

        //Q8-WAJP to find sum of the first 10 natural number.
        /*int sum=0;
        for(int i=1;i<=10;i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);*/

        //Q9-WAJP to find the sum of the first N natural number.
        /*int N=11;
        int sum=0;
        for(int i=1;i<=N;i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);*/

        //Q10-WAJP to print the multiplication table of a given number.
        /*int n=8;
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+"x"+i+"=");
        }*/

        //Q11-WAJP to  calculate the factorial of a given number.
        /*int n=5;
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("factorial of "+n+"! is="+fact);*/

        //Q12-WAJP to  print the square of numbers from 1 to 10.
        /*for(int i=1;i<=10;i++)
        {
            System.out.println("Square of "+i+"="+i*i);
        }*/

        //Q13-WAJP to print the cube of number from 1 to 10.
        /*for(int i=1;i<=10;i++)
        {
            System.out.println("Cube of "+i+"="+i*i*i);
        }*/

        //Q14-WAJP to count the numbers divisible by 3 between 1 to 100.
        /*int sum=0;
        for(int i=1;i<=100;i++)
        {
            if(i%3==0)
            {
                sum=sum+1;
            }
           
        }
         System.out.println("Numbers divisible by 3="+sum);*/

        //Q15-WAJP to print all multiples of 5 between 1 to 100.
        /*for(int i=1;i<=100;i++)
        {
            if(i%5==0)
            {
                System.out.println(i);
            }
        }*/

        //Q16-WAJP to generate the Fibonacci series up to N terms.
        /*int N=35;
        int a=0, b=1;
        System.out.print("Fibonacci Series: "+a+", "+b);
        for(int i=1;i<=N;i++)
        {
            int c=a+b;
            System.out.print(", "+c);
            a=b;
            b=c;
        }*/

        //Q17-WAJP to check whether a number is prime or not.
        /*int n=17;
        int a=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                a=a+1;
            }
        }
        if(a>0)
        {
            System.out.println(n+" is not a Prime Number");
        }
        else
        {
            System.out.println(n+" is a Prime Number");
        }*/

        //Q18-WAJP to find the sum of digits of a number.
        /*int sum=0;
        int n=128;
        for(int i=n;i>0;i=i/10)
        {
            sum=sum+(i%10);
        }
        System.out.println("Sum of digits of the number "+n+ " is="+sum);*/

        //Q19-WAJP to reverse a number.
        /*int n=129;
        int rev=0;
        for(int i=n;i>0;i=i/10)
        {
            rev=rev*10+(i%10);
        }
        System.out.println("Reverse of "+n+" = "+rev);*/

        //Q20-WAJP to  check whether a number is a Palindrome.
        /*int n=121;
        int rev=0;
        for(int i=n;i>0;i=i/10)
        {
            rev=rev*10+(i%10);
        }
        if(n==rev)
        {
            System.out.println(n+" is Palindrome");
        }
        else
        {
            System.out.println(n+" is not a Palindrome");
        }*/

        //Q21-WAJP to count the number of digits in a number.
        /*int n=15484428;
        int count=0;
        for(int i=n;i>0;i=i/10)
        {
            count=count+1;
        }
        System.out.println("Number of digits is "+count);*/

        //Q22-WAJP to find the largest digit in a number.
        /*int n=128;
        int a=0;
        int larg=0;
        for(int i=n;i>0;i=i/10)
        {
            a=i%10;
            if(a>larg)
            {
                larg=a;
            }
        }
        System.out.println("largest digit is "+larg);*/

        //Q23-WAJP to find smallest digit in a number.
        /*int n=4628;
        int a=n%10;
        int larg=n%10;
        for(int i=n;i>0;i=i/10)
        {
            a=i%10;
            if(a<larg)
            {
                larg=a;
            }
        }
        System.out.println("Smallest digit is "+larg);*/






    }
    
    
}
