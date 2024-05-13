package class_object;
import java.util.*;
class prime2
{
	int n,div=0,i;
	
	void accept(int n)
	{
		this.n=n;
		
	}
	String Display()
	{
		for(int i=2;i<=n/2;++i)
		{
			if(n%i==0)
			{
				div=1;
				break;
			}
		}
			if(div==0)
			{
				return("Prime");
			}
			else
			{
				return("not prime");
			}
		}	
}
public class prime 
{
	public static void main(String[] args) 
	{
		int n;
		//String s1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		n=sc.nextInt();
		prime2 p1=new prime2();
		p1.accept(n);
		String s1=p1.Display();
		System.out.println(" "+s1);
	}
}
