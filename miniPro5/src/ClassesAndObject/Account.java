package ClassesAndObject;

public class Account {
    private int account;
    private String name;
    private float amount;
    public void insert(int n, String m, float amt){
        this.account = n;
        this.name = m;
        this.amount = amt;
    }
    public  void deposit(float amt){
        this.amount = this.amount + amt;
        System.out.println(amt + "deposited ");

    }

    public void withdraw( float amt ){
          if(amount<amt) {
              System.out.println("Insufficient Balance");
          } else {
              this.amount = this.amount - amt;
              System.out.println(amt+ "Withdarw");
          }
    }

    public void checkBalance(){
        System.out.println(" Balance = "+this.amount);


    }

    @Override
    public String toString() {
        return "Account{" + "account=" + account +  ", name='" + name + '\'' + ", amount=" + amount + '}';
    }
}
