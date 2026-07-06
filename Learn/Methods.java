class Methods
{
    public static void square(int a)
    {
        //Method for Q1.
        for(int i=1;i<=10;i++)
        {
            int val=a*i;
            System.out.println("Square of ("+a+"x"+i+")="+val*val);
        }
    }

    public static void alphabet(char ch)
    {
        //Method for Q2.
        if(ch<'Z')
        {
            for(char c=ch;c<='Z';c++)
            {
                System.out.println(c);
            }
        }
        else
        {
            for(char c=ch;c<='z';c++)
            {
                System.out.println(c);
            }
        }
    }

    public static void factors(int a)
    {
        //Method for Q3.
        System.out.print("Factor of "+a+"= ");
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
            {
                System.out.print(i+" ");
            }
        }
    }

    public static int product(int a,int b)
    {
        //Method for Q4.
        return a*b;
    }

    public static int ascii(char ch)
    {
        return ch;
    }
    
    public static void main(String[] args)
    {
        //Non-Pramameterized Method:
        
        //Q1-WAJP to print square of each number in a table of 5.
        //cls
        // square(5);

        //Q2-WAJP to print all the alphabet comes after from the passed alphabet.
        //alphabet('f');

        //Q3-WAJP to print all the factors of given number.
        //factors(24);

        //Parameterized Method:

        //Q4-WAJP to return product of two integer number.
        //int a=3, b=5;
        //System.out.println("Product of "+a+" & "+b+" ="+product(a,b));

        //Q5-WAJP to return ASCII value of character.
        char ch='h';
        System.out.println("ASCII value of "+ch+"="+ascii(ch));


    }
}