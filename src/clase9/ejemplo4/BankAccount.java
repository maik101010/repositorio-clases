package src.clase9.ejemplo4;

/**
 * Created by Michael Garcia on 27/08/24
 */
class BankAccount
{
    private int balance;
    public BankAccount(int balance){
        this.balance = balance;
    }

    public synchronized void withdraw(int amount)
    {
        if (amount<= balance)
        {
            System.out.println(Thread.currentThread().getName() + " va a retirar");
            try
            {
                Thread.sleep(100);
            } catch (InterruptedException e)
            {
                System.out.println(e.getMessage());
            }
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " retiro completado. balance actual: " + balance);
        }
        else
        {
            System.out.println(Thread.currentThread().getName() + " intento retirar pero tiene fondos insuficientes. Balance: " + balance);
        }
    }

    public int getBalance()
    {
        return balance;
    }
}

class WithdrawalTask implements Runnable
{
    public final BankAccount account;
    private final int amount;

    public WithdrawalTask(BankAccount account, int amount)
    {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run()
    {
        account.withdraw(amount);
    }
}

class Main
{
    public static void main(String[] args)
    {
        BankAccount account = new BankAccount(1000);

        Thread thread1 = new Thread(new WithdrawalTask(account, 600));
        Thread thread2 = new Thread(new WithdrawalTask(account, 600));
        Thread thread3 = new Thread(new WithdrawalTask(account, 600));

        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println(account.getBalance());

    }
}

