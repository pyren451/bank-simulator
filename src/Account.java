public class Account {

    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public synchronized void withdraw(int amount){
        if (balance >= amount) { //(1)
            try {
                Thread.sleep(new java.util.Random().nextInt(500)+1000); //(2)
            } catch (InterruptedException ex) {
            }
            balance = balance - amount; //(3)
        }
    }

    public int getBalance() {
        return balance;
    }
}
