public class BankAccount {
    String holderName;
    double balance;

    BankAccount(){
        holderName = "unknown";
        balance = 0;
    }
    BankAccount(String holderName){
        this.holderName = holderName;
        balance = 0;
    }
    BankAccount(String holderName , double balance){
        this.holderName = holderName;
        this.balance = balance;
    }
    void display(){
        System.out.println(holderName);
        System.out.println(balance);
    }
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount("Anupam");
        BankAccount b3 = new BankAccount("Rahul",8500);

        b1.display();
        b2.display();
        b3.display();
    }
    
}
