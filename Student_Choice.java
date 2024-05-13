package collection;

public class Student_Choice extends StudentInfoQueue
{
	int choice;
	public void choice()
	{
		do
		{
			System.out.print("\n******** MENU ********\n"
					+ "1) Add Element\n"
					+ "2) Add First\n"
					+ "3) Add Last\n"
					+ "4) Remove First\n"
					+ "5) Remove Last\n"
					+ "6) Check is empty\n"
					+ "7) Display\n"
					+ "8) Exit\n"
					+ "Enter your choice=");
			choice=input.nextInt();
			
			switch(choice)
			{
			case 1:
				AddData();
				break;
				
			case 2:
				AddFirst();
				break;
				
			case 3:
				AddLast();
				break;
				
			case 4:
				RemoveFirst();
				break;
				
			case 5:
				RemoveLast();
				break;
				
			case 6:
				IsEmpty();
				break;
				
			case 7:
				Display();
				break;
				
			case 8:
				System.exit(0);
				break;
				
			default:
				System.out.println("Enter valid choice only");
			}
		}while(true);
		
	}
}
