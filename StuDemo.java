package class_object;
import java.util.*;
class Student
{
	int rno;
	String sname;
	double per;
	void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter roll,name & per");
		rno=sc.nextInt();
		sname = sc.next();
		per = sc.nextDouble();
	}
	void display()
	{
		System.out.println("Roll no :"+rno);
		System.out.println("Name :"+sname);
		System.out.println("Percentage:"+per);
	}
}
public class StuDemo 
{
	public static void main(String[] args)
	{
	Student s1=new Student();
	s1.accept();
	s1.display();
	Student s2=new Student();
	s2.accept();
	s2.display();
	
	

	}

}
