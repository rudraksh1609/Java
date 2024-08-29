package Java;
class parent
{
	int num;
	parent()
	{
		num=100;
	}
	parent(int num)
	{
		this.num=num;
	}
	void display()
	{
		System.out.println("Value of num in parent class:"+ num);
	}
}
class child extends parent
{
	int num;
	child()
	{
		super();
		num=200;
	}
	child(int num1,int num2)
	{
		super(num1);
		this.num=num2;
	}
	void display()
	{
		super.display();
		System.out.println("Value of num in child class:"+ num);
	}
}
public class SUPER 
{
	public static void main(String[]args)
	{
		child c1=new child();
		c1.display();
		System.out.println();
		child c2=new child(300,400);
		c2.display();
	}
}
