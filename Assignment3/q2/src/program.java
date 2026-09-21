import java.util.Scanner;
public class program
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int accountNumber;
        int beginningBalance;
        int charges;
        int credits;
        int creditLimit;
        int newBalance;
        System.out.print("Enter account number: ");
        accountNumber = sc.nextInt();
        System.out.print("Enter beginning balance: ");
        beginningBalance = sc.nextInt();
        System.out.print("Enter total charges: ");
        charges = sc.nextInt();
        System.out.print("Enter total credits: ");
        credits = sc.nextInt();
        System.out.print("Enter credit limit: ");
        creditLimit = sc.nextInt();
        newBalance = beginningBalance + charges - credits;
        System.out.println("Account Number: " + accountNumber);
        System.out.println("New Balance: " + newBalance);
        if (newBalance > creditLimit)
        {
            System.out.println("Credit limit exceeded");
        }
        else
        {
            System.out.println("Credit limit not exceeded");
        }
        sc.close();
    }
}
