package Java程序设计_翁恺.Class4;

/**
 * @author XIN
 * @create 2022-07-23 15:49
 */
public class homeworks
{
    public static void main(String[]args)
    {
        int count = 0;
        int n = 2;
        while (count < 50)
        {
            int isprime = 1;
            for( int i =2; i <n; i++)
            {
                if(n%i==0)
                {
                    isprime = 0;
                    break;
                }
            }
            if (isprime == 1)
            {
                count++;
                System.out.println("第"+count+"个素数是"+n);
            }
            n++;
        }
    }
}
