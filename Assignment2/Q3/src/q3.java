import java.util.Scanner;
class Date
{
	private int date;
	private int month;
	private int year;
	Date()
	{}
	Date(int date, int month, int year)
	{
		this.date = date;
		this.month = month;
		this.year = year;
	}
	public void acceptRecord()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a date: ");
		date = sc.nextInt();
		System.out.println("enter a month: ");
		month = sc.nextInt();
		System.out.println("enter a year: ");
		year = sc.nextInt();
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void displayRecord()
	{
		System.out.println(date + " / " + month + " / " + year);
	}	
}
class q3
{
	public static void main(String[] args)
	{
		Date dt = new Date();
		dt.acceptRecord();
		dt.displayRecord();
	}
}