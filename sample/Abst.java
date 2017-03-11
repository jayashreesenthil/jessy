package sw;
abstract class Electronic
{
	abstract void on();
	abstract void off();
	void charge()
	{
		System.out.println("plugin");
	}
}
public class Abst extends Electronic  {

	@Override
	void on() {
		System.out.println("remote");	
		
	}

	@Override
	void off() {
		System.out.println("remote off");
		
	}
	public static void main(String args[])
	{
	Electronic e=new Abst();
	Abst a=new Abst();
	e.on();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	a.on();
	a.off();
	a.charge();
	}
}
