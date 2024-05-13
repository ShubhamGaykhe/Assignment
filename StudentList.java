package collection;
import java.util.*;
public class StudentList 
{
	
	LinkedList<String> list=new LinkedList<>();
	
	Scanner input=new Scanner(System.in);
	
	public void EnterStudent()
	{
		String name;
		System.out.print("Enter Student name=");
		name=input.next();
		list.add(name);
	}
	
	public void Deletestudent()
	{
		String name;
		System.out.print("Enter Student name for deleting=");
		name=input.next();
		list.remove(name);
	}
	
	public void ViewStudent()
	{
		if(!list.isEmpty())
		{
			Iterator<String> iterator=list.iterator();
			while(iterator.hasNext())
				System.out.println(iterator.next());
		}
		else
		{
			System.out.println("No student in list");
		}
	}
	
	public void SortStudent()
	{
		Collections.sort(list);
		if(!list.isEmpty())
		{
			Iterator<String> iterator=list.iterator();
			while(iterator.hasNext())
				System.out.println(iterator.next());
		}
		else
		{
			System.out.println("No student in list");
		}
		
	}
	
	public void SearchStudent()
	{
		String name,search;
		System.out.print("Enter Student name for search=");
		name=input.next();
		boolean flag=false;
		if(!list.isEmpty())
		{
			for(int i=0;i<list.size();i++)
			{
				search=list.get(i);
				if(name.equals(search))
				{
					flag=true;
					break;
				}
			}	
			if(flag)
				System.out.println("Student is found");
			else
				System.out.println("Student is not found");
		}
		else
		{
			System.out.println("No student in list");
		}
		
	}
}