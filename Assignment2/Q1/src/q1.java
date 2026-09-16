import java.util.Scanner;
class invoice
{
	private String  part_Number;
	private String part_Description;
	private int quantity;
	private double price;
	invoice()
	{}
	invoice(String part_Number, String part_Description, int quantity, double price)
	{
		this. part_Number =  part_Number;
		this.part_Description = part_Description;
		setquantity(quantity);
		setprice(price);
		
	}
	public void acceptRecord()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a part_Number: ");
		part_Number = sc.nextLine();
		System.out.println("Enter a part_Description : ");
		part_Description = sc.nextLine();
		System.out.println("Enter a quantity:");
		setquantity(sc.nextInt());
		System.out.println("Enter a price :");
		setprice(sc.nextDouble());
	}
	public void setpart_Number(String num)
	{
		this. part_Number =  num;
	}
	public void setpart_Description(String des)
	{
		this. part_Description =  des;
	}
	public void setquantity(int count)
	{
		if(count > 0)
		{
			quantity = count;
		}
		else
		{
			count = 0;
		}
	}
	public void setprice(double p)
	{
		if(p > 0)
		{
			price = p;
		}
		else
		{
			p =0.0;
		}
	}
	public String getpart_Number()
	{
		return part_Number;
	}
	public String getpart_Description()
	{
		return part_Description;
	}
	public int getquantity()
	{
		return quantity;
	}
	public double getprice()
	{
		return price;
	}
	public double getcalculateAmmount()
	{
		return this.quantity * this.price; 
	}
	public void displayRecord()
	{
		System.out.println("enter a part_Number: "+ this.part_Number);
		System.out.println("Enter a part_Description : " + this.part_Description);
		System.out.println("Enter a quantity:"+ this.quantity);
		System.out.println("Enter a price :" + this.price);
	}
}
public class q1 
{
	public static void main(String[] args)
	{
		invoice i = new invoice();
		i.acceptRecord();
		i.displayRecord();
		System.out.println("Total invoice amount: " + i.getcalculateAmmount());
	}
}
