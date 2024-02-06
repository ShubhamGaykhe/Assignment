package Assignment;

import java.util.Scanner;

public class Changes 
{
	public String ChangesCharacter(String str)
	{
		char chars=' ';
		int i;
		for(i=0;i<str.length();i++)
		{
			chars=str.charAt(i);
			
			if(chars=='a'||chars=='e'||chars=='i'||chars=='o'||chars=='u')
			{
				chars=str.charAt(i);
				str=str.replace(chars, (char)(chars-33));
			}
			if(chars=='z')
			{
				str=str.replace('z', 'a');
			}
			else
			{
				chars=str.charAt(i);
				str=str.replace(chars, (char)(chars+1));
			}
		}
		return str;
	}
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		String str;
		
		Changes obj=new Changes();
		
		System.out.println("Enter String=");
		str=input.next();
		
		System.out.println(obj.ChangesCharacter(str));
		
		input.close();
	}

}
