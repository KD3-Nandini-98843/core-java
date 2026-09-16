import java.util.Scanner;
public class q3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        int quantity;
        double total = 0;
        while(true)
        {
            System.out.println("\nFood Menu");
            System.out.println("1. Dosa    - 30");
            System.out.println("2. Samosa  - 40");
            System.out.println("3. Poha    - 50");
            System.out.println("4. Tea     - 10");
            System.out.println("5. Generate Bill");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            if(choice == 5)
            {
                System.out.println("Total Bill = " + total);
                return;
            }
            System.out.print("Enter quantity: ");
            quantity = sc.nextInt();
            switch(choice)
            {
                case 1:
                    total = total + (30 * quantity);
                    break;
                case 2:
                    total = total + (40 * quantity);
                    break;
                case 3:
                    total = total + (50 * quantity);
                    break;
                case 4:
                    total = total + (10 * quantity);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}