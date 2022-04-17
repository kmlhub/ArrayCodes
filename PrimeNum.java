class PrimeNum
{

    public static boolean isPrime(int num)
    {
        int c=0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                c++;
            }
        }
        if(c==2)
        return true;
        else
        return false;
    }
    public static void main(String[] args) {
        for(int i=1;i<=100;i++)
        {
            boolean b=isPrime(i);
            if(b)
            {
                System.out.println(i);
            }
        }
    }
}