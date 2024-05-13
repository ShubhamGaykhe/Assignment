package polymorphism;
class SumOfNumber
{
	public void accept()
	{
		System.out.println("Hiiiiii");
	}
}

class AddOfNumber extends SumOfNumber
{
	@Override
	public void accept()
	{
		System.out.println("Byyyyy");
	}
}
public class Overriding 
{
	public static void main(String[] args) 
	{
		SumOfNumber obj=new AddOfNumber();
		obj.accept();
				
	}

}
