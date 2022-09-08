package Java程序设计_翁恺.Class8;

/**
 * @author XIN
 * @create 2022-09-02 23:06
 */
public class vendingMachine {
    int price = 80;
    int balance;
    int total;

    void showPrompt()
    {
        System.out.println("Welcome");
    }

    void insertMoney(int amount)
    {
        balance = balance + amount;
    }

    void showBalance()
    {
        System.out.println(balance);
    }

    void getFood()
    {
        if (balance >= price)
        {
            System.out.println();
            balance = balance - price;
            total = total + price;
        }
    }

    public static void main(String[] args) {

        vendingMachine vm1 = new vendingMachine();
        vm1.showBalance();
    }
}
