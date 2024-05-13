package collection;

import java.util.*;

public class StudentInfoQueue 
{
	String Student_Name;
	
	Scanner input=new Scanner(System.in);
	Deque<String> queue=new ArrayDeque<>();
	
	public void AddData()
	{
		System.out.print("Enter name=");
		Student_Name=input.next();
		queue.add(Student_Name);
	}
	
	public void AddFirst()
	{
		System.out.print("Enter name=");
		Student_Name=input.next();
		queue.addFirst(Student_Name);
	}
	
	public void AddLast()
	{
		System.out.print("Enter name=");
		Student_Name=input.next();
		queue.addLast(Student_Name);
	}
	
	public void RemoveFirst()
	{
		queue.removeFirst();
	}
	
	public void RemoveLast()
	{
		queue.removeLast();
	}
	
	public void IsEmpty()
	{
		if(queue.isEmpty())
			System.out.println("Queue is empty");
		else
			System.out.println("Queue is not empty");
	}
	
	public void Display()
	{
		System.out.println(queue);
	}
}
