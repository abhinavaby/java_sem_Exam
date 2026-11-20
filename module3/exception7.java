package module3;

// Custom Exception
class InsufficientBalanceException extends Exception {

    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class Bank {

    double balance = 5000;

    void withdraw(double amount) throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance!");
        }
        else {
            balance = balance - amount;
            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance = " + balance);
        }
    }
}

public class exception7 {

    public static void main(String[] args) {

        Bank b = new Bank();

        try {
            b.withdraw(7000);
        }
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Transaction Completed.");
        }
    }
}