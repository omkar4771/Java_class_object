package class_object;
import java.util.*;
class Vowel2
{	
	char ch;
	void accept(char ch)
	{
		this.ch=ch;
	}
	
	String display()
	{	
		char a,e,i,u;
		if(ch=='i'||ch=='a'||ch=='e'||ch=='u')
		{
			return"this is vowel";
		}
		else
		{
			return"this is not vowel";
		}
	}
}
public class Vowel 
{
	public static void main(String[] args) 
	{
		char ch;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the char");
		ch=sc.next().charAt(0);
		Vowel2 v1=new Vowel2();
		
		v1.accept(ch);
		String s1=v1.display();
		System.out.println(" "+s1);
	}

}
