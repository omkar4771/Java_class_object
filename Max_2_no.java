package class_object;
import java.util.*;
class omkar4771
{
	int a,b;
	void accept(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	void display()
	{
		if(a>b)
		{
			System.out.println(a+"is greater number");
		}
		else
		{
			System.out.println(b+"is greater number");
		}
	}
	
}
public class Max_2_no 
{
	public static void main(String[] args)
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st number");
		a=sc.nextInt();
		System.out.println("Enter the 2nd number");
		b=sc.nextInt();
		
		omkar4771 a1=new omkar4771();
		
		a1.accept(a,b);
		a1.display();
		
		
	}

}
