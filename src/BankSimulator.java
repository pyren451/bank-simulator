public class BankSimulator {
    public static void main(String[] args) {
        Account account = new Account(1000);
        Client c1 = new Client("Graham", account, 50);
        Client c2 = new Client("John", account, 150);
        Client c3 = new Client("Terry", account, 250);
        c1.start();
        c2.start();
        c3.start();
    }
}
