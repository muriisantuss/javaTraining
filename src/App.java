public class App {
    public static void main(String[] args) throws Exception {
        Account c1 = new Account();
        Account c2 = new Account();

        c1.balance = 1000;
        System.out.println();
        System.out.println("    --------YOUR ACCOUNT--------");
        c1.withdraw(0);

        c1.deposit(0);
        
        c1.transfer(c2,1000);

    }
}