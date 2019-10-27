public class Client extends Thread {
    private Account account;
    private int withdrawal;

    public Client(String name, Account account, int withdrawal){
        super(name);
        this.account = account;
        this.withdrawal = withdrawal;
    }

    public void run(){
        while(account.getBalance() > withdrawal){
            account.withdraw(withdrawal);
            System.out.printf("%s withdraws %d dollars. Current balance: %d dollars \n",
                    getName(), withdrawal, account.getBalance());
        }
    }
}
