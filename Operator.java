package polymorphism;

import java.util.Scanner;

class GRT_Condition
{
	Scanner input=new Scanner(System.in);
	public void calaculat()
	{
		int num1,num2;
		System.out.println("We are in Parent class");
		System.out.print("Enter num1 and num2=");
		num1=input.nextInt();
		num2=input.nextInt();
		if(num1>num2)
			System.out.println("Num1 is greater");
		else if(num1<num2)
			System.out.println("Num2 is greater");
		else
			System.out.println("Num1 and num2 are equal");
	}
}

class GRT_Operator extends GRT_Condition
{
	Scanner input=new Scanner(System.in);
	public void calaculat()
	{
		int num1,num2,result;
		System.out.println("We are in Child class");
		System.out.print("Enter num1 and num2=");
		num1=input.nextInt();
		num2=input.nextInt();
		result=num1>num2?num1:num2;
		if(result==num1)
			System.out.println("Num1 is greater");
		else if(result==num2)
			System.out.println("Num2 is greater");
		else
			System.out.println("Num1 and num2 are equal");
	}

}
public class Operator {

	public static void main(String[] args) 
	{
		GRT_Condition obj=new GRT_Condition();
		obj.calaculat();
		GRT_Operator obj1=new GRT_Operator();
		obj1.calaculat();
		
	}

}
