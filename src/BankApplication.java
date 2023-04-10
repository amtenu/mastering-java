import java.util.Scanner;

public class BankApplication
{
  public static void main(String[] args) {
    Scanner myScanner=new Scanner(System.in);
    System.out.println("Enter your'Name' and 'Card no'!");
    String name=myScanner.nextLine();
    String myCardNumber=myScanner.nextLine();
    BankAccount myAccount=new BankAccount(name,myCardNumber);
    myAccount.menu();

  }
}

class BankAccount{
  double balance;
  double previousTransaction;
  String customerName;
  String customerId;

  BankAccount(String customerName,String customerId){
    this.customerName=customerName;
    this.customerId=customerId;
  }

  void deposit(double amount){

    if( amount !=0){
      balance+=amount;
      previousTransaction=amount;
    }

  }
  void withDraw(double amount){
    if(amount!=0 && balance>amount){
      balance-=amount;
      previousTransaction=-amount;
    }
    else if(balance<amount){
      System.out.println("Insufficient balance!");
    }
  }

  void getPreviousTransaction(){
    if(previousTransaction>0){
      System.out.println("Previous Deposit"+ previousTransaction);
    }
    else if(previousTransaction<0){
      System.out.println("Previous Withdrawal "+ Math.abs(previousTransaction));
    } else {
      System.out.println("No Transaction !");
    }
  }

  void menu(){
    char menuOptions;
     
    Scanner sc=new Scanner(System.in);
    System.out.println("Welcome "+customerName);
    System.out.println("Your ID:"+customerId);
    System.out.println("\n");
    System.out.println("a) Check Balance");
    System.out.println("b) Deposit Amount");
    System.out.println("c) Withdraw Amount");
    System.out.println("d) Previous Transaction");
    System.out.println("e) Exit");
    do{
      System.out.println("********************************************");
      System.out.println("Choose an option");
      menuOptions=sc.next().charAt(0);
      System.out.println("\n");

      switch (menuOptions){
        case 'a':
          System.out.println("......................");
          System.out.println("Balance ="+balance);
          System.out.println("......................");
          System.out.println("\n");
          break;
        case 'b':
          System.out.println("......................");
          System.out.println("Enter a amount to deposit :");
          System.out.println("......................");
          double amt=sc.nextDouble();
          deposit(amt);
          System.out.println("\n");
          break;
        case 'c':
          System.out.println("......................");
          System.out.println("Enter a amount to Withdraw :");
          System.out.println("......................");
          double amtW=sc.nextDouble();
          withDraw(amtW);
          System.out.println("\n");
          break;
        case 'd':
          System.out.println("......................");
          System.out.println("Previous Transaction:");
          getPreviousTransaction();
          System.out.println("......................");
          System.out.println("\n");
          break;

        case 'e':
          System.out.println("......................");
          break;
        default:
          System.out.println("Choose a correct option to proceed");
          break;
      }

    }while(menuOptions!='e');
    System.out.println("Thank you for using our banking services");
  }


}




