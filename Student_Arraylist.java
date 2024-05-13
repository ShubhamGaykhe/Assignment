package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Student_Arraylist 
{
	ArrayList<String> list1=new ArrayList<>();
	ArrayList<String> list2=new ArrayList<>();
	ArrayList<String> list3=new ArrayList<>();
	Scanner input=new Scanner(System.in);
	int num,i;
	String name,email,address;
	public void accept()
	{
		System.out.print("How many student you have=");
		num=input.nextInt();
		for(i=0;i<num;i++)
		{
			System.out.println();
			System.out.print("Enter name=");
			name=input.next();
			list1.add(name);
			
			System.out.print("Enter Email=");
			email=input.next();
			list2.add(email);
			
			System.out.print("Enter address=");
			address=input.next();
			list3.add(address);
		}
		display();
	}
	
	public void display()
	{
		Iterator<String> name=list1.iterator();
		Iterator<String> email=list2.iterator();
		Iterator<String> address=list3.iterator();
		System.out.println("Name of student \tEmail Address \t\tStudent Address");
		while(name.hasNext()||email.hasNext()||address.hasNext())
		{
			System.out.println(name.next()+"\t\t\t"+email.next()+"\t\t"+address.next());
		}
	}
	public static void main(String[] args) 
	{
		Student_Arraylist obj=new Student_Arraylist();
		obj.accept();
	}
}