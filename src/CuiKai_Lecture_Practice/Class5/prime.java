package CuiKai_Lecture_Practice.Class5;

import java.util.Scanner;

/**
 * @author XIN
 * @create 2022-07-23 16:23
 */
public class prime {
    public static void main(String[]args)
    {
    Scanner scan = new Scanner(System.in);
//  设置计数器
    int NO = 0;
//  设置要测试的数
    int x = 2;
//  输入要求素数的数量
    System.out.print("请输入要求的素数的个数：");
    int account = scan.nextInt();
//  设置数组
    int []prime = new int[account];
//    第一层循环，用于积累一定数量的质数
    do
    {
        int isprime = 1;
//        判断 测试数 是不是2或者3
        if (x == 2 || x == 3) {
        }
//  判断 测试数 是不是偶数
        else if (x % 2 == 0)
        {
            isprime = 0;
        } else
        {
//        第二次循环，用3到平方根的数去逐个整除测试数
            for(int i = 3; i <= Math.sqrt(x); i+=2)
            {
//        判断能不能整除
            if (x % i ==0)
                {
                    isprime = 0;
                    break;
                }
            }
        }
//        判断是不是质数
        if (isprime == 1)
        {
            prime[NO] = x;
            NO++;
            System.out.println("第"+NO+"个素数是"+x);
        }
        x++;
    }
    while (NO < account);
//输出数组中特定序列的值
    int number1 = 0;
    System.out.print("第");
    number1 =scan.nextInt();
    System.out.print("位素数是："+prime[number1-1]);

    }
}
