package class_object;
import java.util.*;

class omkar
{	int n,n1,sum=0;
	void accept(int n)
	{
		this.n=n;
	}
	void Display()
	{
		while(n>0)
		{
			n1=n%10;
			n=n/10;
			
			sum=sum+n1;
			
		}
		
		System.out.println("sum ="+sum);
	}
	
}
public class Sum_digits 
{

	public static void main(String[] args) 
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number = ");
		n=sc.nextInt();
		
		omkar a1=new omkar();
		
		a1.accept(n);
		a1.Display();
		
		
	}

}
