package class_object;
import java.util.Scanner;

class factor
{  int n;
	void accept(int n)
	{
		this.n=n;
	}
	void display()
	{	int i=0,f1=1;
		for(i=1;i<=n;i++)
		{
			f1=f1*i;
			
		}
		System.out.println(" factorial = "+f1);
	}
	
}
public class factorial 
{

	public static void main(String[] args) 
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number = ");
		n=sc.nextInt();
		
		factor f1=new factor();
		
		f1.accept(n);
		f1.display();
		

	}

}
