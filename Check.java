package Assignment;
import java.util.Scanner;
public class Check 
{
	public String ABCheck(String str)
	{
		int i,count=0,j;
		str=str.toLowerCase();
		for (i=0;i<str.length();i++) 
		{
			if (str.charAt(i)=='a')
			{
				j=i;
				while(j<str.length() && str.charAt(j)!='b')
				{
					count++;
					j++;
				}
				if(count==3)
					return "True";
			}		
		}
		return "False";
	}
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		String str;
		
		Check obj=new Check();
		System.out.print("Enter string=");
		str=input.next();
		
		System.out.println(obj.ABCheck(str));
		
		input.close();
	}

}
