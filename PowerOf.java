package Assignment;

import java.util.Scanner;

public class PowerOf 
{
	public String PowerOfTwo(int num)
	{
		int q,rem;
		if(num==2)
		{
			return "True";
		}
		else
		{
			while(num>0)	
			{
				q=num/2;
				rem=num%2;
				if(q==2 && rem==0)
					return "True";
				else
					num=q;
			}
			return "False";
		}
	}
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int num;
		
		PowerOf obj=new PowerOf();
		System.out.print("Enter number=");
		num=input.nextInt();
		
		System.out.println(obj.PowerOfTwo(num));
		
		input.close();
	}
}