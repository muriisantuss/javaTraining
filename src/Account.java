public class Account {
  // Atributos
  byte accountNumber; // Número da conta
  double balance;    // Saldo
  double overdraftLimit; // Limite de cheque especial
  String name;       // Nome do titular

  // Métodos
  public void withdraw(double amount) {
      if (amount <= balance) {
          System.out.println();
          System.out.println("- Withdrawal: Withdrawing R$" + amount + " from " + this.balance);
          balance -= amount;
          System.out.println("- Current balance: R$" + this.balance);
          System.out.println();
      } else {
          System.out.println("Insufficient funds!");
      }
  }

  public void deposit(double amount) {
      balance += amount;
      System.out.println("----------------");
      System.out.println("- Deposit: Deposit amount: R$" + amount);
      System.out.println("- Current balance: R$" + this.balance);
      System.out.println("----------------");
      System.out.println();
  }

  public void transfer(Account destinationAccount, double amount) {
      if (amount <= balance) {
          System.out.println("- Transfer: Transferring R$" + amount + " from " + this.balance);
          balance -= amount;
          System.out.println();
          System.out.println("    ---------TRANSFER TO THE BELOW ACCOUNT -------");
          destinationAccount.deposit(amount);
          System.out.println("- Current balance after transfer: R$" + this.balance);
          System.out.println();
      } else {
          System.out.println("Insufficient funds!");
      }
  }
}
