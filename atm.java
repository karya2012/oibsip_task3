import java.util.Scanner;
class ATM 
{
    public static void main(String[] args)
	{
        int balance = 99999;
        int withdraw = 0; 
        int deposite = 0; 
        int n;
        int pin = 2012;
        int transfer = 0;
	    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pin: ");
	
		
        int flag = sc.nextInt();
	
        if(flag == pin)
        {
        while(true)
        {
           System.out.println(" \n "+ "Welcome to ATM");
           System.out.println("1 for Transaction History");
           System.out.println("2 for Withdraw");
           System.out.println("3 for Deposite");
           System.out.println("4 for Transfer");
           System.out.println("5 for exit");
           System.out.println("Please Enter option: ");
           n = sc.nextInt();
           switch(n)
           {
            case 1:
            System.out.println("\n" + "Transaction History");
            System.out.println("Money withdrawed: " + withdraw);
            System.out.println("Money deposited: " + deposite);
            System.out.println("Money Transfered: " + transfer);
            System.out.println("The current balance is: " + balance);
            System.out.println(" ");
            break;

            case 2:
            System.out.println("Enter the amount to withdraw: ");
            withdraw = sc.nextInt();
            
			if(withdraw > balance)
            {
                System.out.println("Insufficient Balance!");
                System.out.println("Unable to Withdraw.");
				System.out.println(" ");
            }
            else
            {
                balance = balance - withdraw;
                System.out.println("The withdraw amount is: " + withdraw);
                System.out.println("Please collect you Money.");
                System.out.println(" ");
            }
            break;

            case 3:
            System.out.println("Enter amount: ");
            deposite = sc.nextInt();
            System.out.println("Place your money Carefully");
            balance = balance + deposite;
            System.out.println("Money Successfully Deposited!");
            System.out.println(" ");
            break;

            case 4:
            while(true)
            {
            System.out.println("Enter the account number of beneficiary: ");
            int accno = sc.nextInt();
			
            System.out.println("Enter the IFSC Code of beneficiary: ");
            String ifsc = sc.next();
            System.out.println("Entered Account no: " + accno);
            System.out.println("confirm Account Number \n1.Confirm \n2.No");
            int choice = sc.nextInt();
            if(choice == 1)
            {
                System.out.println("Enter amount: ");
                transfer = sc.nextInt();
                balance = balance - transfer; 
                System.out.println("Amount successfully transfered!");
                break;
            }
            else 
            {
                System.out.println("Invalid account number!");
            }
            }
            break;

            case 5:
            System.out.println("Thank you for using ATM");
            System.exit(0);

            default:
            System.out.println("Invalid option");
           }
           
           
        }

    }
    else
    {
        System.out.println("Pin is Invalid!");

    }
}
}