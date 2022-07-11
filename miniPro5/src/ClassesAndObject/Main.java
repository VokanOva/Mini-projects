package ClassesAndObject;

public class Main {
    public static void main(String args[]){
            // A small project to find out the value
            // of insert and deposit from a personal account.

        Account a1 = new Account(), a2 = new Account(),a3 = new Account();
                a1.insert(4451238,"Muhammed",1000);
                a1.deposit(12000);
                a1.withdraw(2000);
                a1.checkBalance();
                a1.toString();

                a2.insert(55000,"Belal",1000);
                a2.deposit(5000);
                a2.withdraw(2000);
                a2.checkBalance();
                a2.toString();

                a3.insert(10004,"Mike",700);
                a3.deposit(500);
                a3.withdraw(600);
                a3.checkBalance();
                a3.toString();

    }

}
