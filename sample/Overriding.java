package sw;

class Base
{
	private void printt()
	{
		System.out.println("In base");
	}
}

public class Overriding // extends Base{
{	
public void print()
	{
		System.out.println("in child");
	}
	public static void main(String ar[])
	{	
		Base b=new Base();
	Overriding o=new Overriding();
	o.print();

}
}
