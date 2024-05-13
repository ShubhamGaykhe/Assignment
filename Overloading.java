package polymorphism;

import java.util.Scanner;

class Bank_ROI
{
	int age,choice,result;
	double amount;
	Scanner input=new Scanner(System.in);
	public void MyAcROI()
	{
		System.out.println("1) RBI\n"
				+ "2) Saving\n"
				+ "30 Current\n"
				+ "Enter choice=");
		choice=input.nextInt();
		switch(choice)
		{
			case 1:
				result=RateOfInterset();
				break;
				
			case 2:
				System.out.println("Enter age=");
				age=input.nextInt();
				result=RateOfInterset(choice,age);
				break;
				
			case 3:
				result=RateOfInterset(choice);
				break;
				
			default:
				System.out.print("Enter valid choice only");
		}
		System.out.println("Enter your amount=");
		amount=input.nextDouble();
		System.out.print("balance="+(amount+((amount/100)*result)));
	}
	public int RateOfInterset()
	{
		System.out.println("8% Rate Of Interest");
		return 8;
	}
	// For current account
	public int RateOfInterset(int ch)
	{
		System.out.println("6% Rate Of interest");
		return 6;
	}
	// For saving account
	public int RateOfInterset(int ch,int age)
	{
		int rate_intrest;
		if(age>=60)
			rate_intrest=5;
		else
			rate_intrest=4;
		return rate_intrest;
	}
}
public class Overloading 
{
	public static void main(String[] args) {
		Bank_ROI obj=new Bank_ROI();
		obj.MyAcROI();
	}

}

