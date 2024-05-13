package collection;

public class StudentInfo extends StudentList
{
	public void choice()
	{
		int choice;
		do
		{

			System.out.print("********* OPERATIONS *********\n"
					+ "1) Insert Student\n"
					+ "2) Delete Student\n"
					+ "3) View Students\n"
					+ "4) Sort Students\n"
					+ "5) Search Student\n"
					+ "6) Exit\n"
					+ "Enter your choice=");
			choice=input.nextInt();
			
			switch(choice)
			{
			case 1:
				EnterStudent();
				break;
				
			case 2:
				Deletestudent();
				break;
				
			case 3:
				ViewStudent();
				break;
				
			case 4:
				SortStudent();
				break;
				
			case 5:
				SearchStudent();
				break;
				
			case 6:
				System.exit(0);
				break;
			}
		}while(true);
	}
}
