import java.util.*;
class BankAccount{
    double balance;
    BankAccount(double balance)
    {
        this.balance=balance;
    }
    public boolean deposite(double ammount)
    {
        if (ammount>0) {
            balance+=ammount;
            return true;
        }
        else{
            System.out.println("Invalid ammount for deposite");
            return false;
        }
    }
    public boolean withdraw(double ammount)
    {
        if (ammount>0 && ammount<balance) {
            balance-=ammount;
            return true;
        }
        else{
            System.out.println("Invalid ammount for withdrawal");
            return false;
        }
    }
    public double checkBalance()
    {
        return balance;
    }
}
class ATM{
    BankAccount bankAccount;
    public ATM(BankAccount bankAccount)
    {
        this.bankAccount=bankAccount;
    }
    void deposite(double ammount){
        if (bankAccount.deposite(ammount)) {
            System.out.println("Deposite successful."+"\n Your new balance is:"+bankAccount.checkBalance());
        }
        else{
            System.out.println("Deposite failed");
        }
    }
    void withdraw(double ammount){
        if (bankAccount.withdraw(ammount)) {
            System.out.println("Withdraw successful."+"\n Your new balance is:"+bankAccount.checkBalance());
        }
        else{
            System.out.println("Withdrawal failed");
        }
    }
    void checkBalance(){
            System.out.println(" Your balance is:"+bankAccount.checkBalance());
    }
}
public class ATMMachine {
    public static void main(String[] args) 
    {
        BankAccount bAccount = new BankAccount(1000);
        ATM atm =new ATM(bAccount);
        Scanner scanner= new Scanner(System.in);
        while (true)
       {
            System.out.println("1.Check Balance");
            System.out.println("2.Deposite");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");
            System.out.println("Enter your choice:");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:atm.checkBalance();
                    break;
                case 2: System.out.println("Enter ammount for deposite");
                      double depositeamt = scanner.nextDouble();
                      atm.deposite(depositeamt);
                      break;
                case 3: System.out.println("Enter ammount for withdraw");
                      double withdrawamt = scanner.nextDouble();
                      atm.withdraw(withdrawamt);;
                      break;
                case 4: System.out.println("Thank you for visiting aATM machine."+"\nVisit again \n Have a good day!!");
                      break;
                default:
                    System.out.println("Invalid choice. Please try again");
                    break;
            }
       }
    }
}
