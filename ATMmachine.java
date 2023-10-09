import java.util.*;

class ATM{

    float balance;
    int pin=0000;

    public void checkpin(){
        System.out.print("enter pin:");
        Scanner sc = new Scanner(System.in);
        int enteredpin= sc.nextInt();
        if(enteredpin==pin){
            menu();
        }else{
            System.out.println("enter valid pin");
            checkpin();
        }
        
    }
    public void menu(){
        System.out.println("1. Check Balance.");
        System.out.println("2. Cash Withdraw.");
        System.out.println("3. Cash Deposit.");
        System.out.println("4. Exit.");

        Scanner sc =new Scanner(System.in);
        int opt = sc.nextInt();

        if(opt==1){
            checkbalance();
        }
        else if(opt==2){
            withdraw();
        }
        else if(opt==3){
            deposit();
        }
        else if (opt==4){
            exit();
        }
    }
    public void checkbalance(){
        System.out.println("Balance:"+ balance);
        menu();
    }
    public void withdraw(){
        System.out.println("Enter Amount: ");
        Scanner sc = new Scanner(System.in); 
        int amount= sc.nextInt();
        if(amount<=balance){
            System.out.println("withdrawl Successfull");
            balance=balance-amount;

        }
        else{
            System.out.println("Insufficient Balance.");
        }
        menu();
    }
    public void deposit(){
        System.out.println("enter Amount:");
        Scanner sc = new Scanner(System.in);
        int amt=sc.nextInt();
        balance=balance+amt;
        System.out.println("Cash Deposited Sucessfully");
        menu();
    }
    public void exit(){
        return;
    } 

}


public class ATMmachine{
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkpin();
    }
}