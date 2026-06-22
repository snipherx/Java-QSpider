public class WhileLoop 
{
    public static void main(String[] args) 
    {
        //While Loop:-

        //Q1-WAJP to print first 10 natural number.
        /*int a=1;
        while(a<=10)
        {
            System.out.println(a);
            a++;
        }*/

        //Q2-WAJP to print all alphabet and their ASCII Value.
        /*char a='A';
        char b='a';
        while(a<='Z' && b<='z')
        {
            System.out.println("ASCII Value of "+a+"="+(int)a);
            System.out.println("ASCII Value of "+b+"="+(int)b);
            a++;
            b++;
        }*/

        //Q3-WAJP to print all the Odd number between 50 to 100.
        /*int a=50;
        while(a<=100)
        {
            if(a%2!=0)
            {
                System.out.println(a);
            }
            a++;
        }*/
       //--------------------------------------------------------------------------------------------------------------------------

       //Do While Loop:-

       //Q1-WAJP to print even number between 1 to 20.
       /*int i=1;
       do
       {
        if(i%2==0)
        {
            System.out.println(i);
        }
        i++;
       }
       while(i<=20);*/

    

    //Q2-WAJP to print all the alphabet in reverse order.
    /*char x='z';
    do
    {
        System.out.println(a);
        x--;
    }
    while(x>='a');*/

    //Q3-WAJP to print table of a given number if the number is even else we just print the number.
    /*int n=4,i=1;
    do
    {
        System.out.println(n*i);
        i++;
    }
    while(n%2==0 && i<=10);*/

    //Q4-WAJP to print sum of each number of digit
    /*int n=324;
    int sum=0;
    do
    {
        int mod=n%10;
        sum=sum+mod;
        n=n/10;
    }
    while(n>0);
    System.out.println(sum);*/

   
    }

}
