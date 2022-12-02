package CuiKai_Lecture_Practice.Class4;

/**
 * @author XIN
 * @create 2022-07-23 15:26
 */
public class prime
{
    public static void main(String[]args)
    {
        System.out.println("100之内的素数有");

        for (int n = 2; n<100; n++)
        {
            int isprime = 1;
            for (int i=2; i<n; i++)
            {
                if (n%i == 0)
                {
                    isprime = 0;
                    break;
                }
            }
            if (isprime == 1)
            {
                System.out.println(n+"是素数");
            }
            else
            {
                System.out.println(n+"不是素数");
            }
        }
    }
}
