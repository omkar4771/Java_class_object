package class_object;
import java.util.Scanner;

class swap
{	int a,b;
	void accept(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	void display()
	{
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("a = "+a);
		System.out.println("b= "+b);
		
		
	}
}
public class Swap_number 
{

	public static void main(String[] args) 
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 number ");
		a=sc.nextInt();
		b=sc.nextInt();
		
		swap s=new swap();
		s.accept(a,b);
		s.display();
		
		
	}

}
