package sw;

public class Abst2 extends Electronic{

	@Override
	void on() {
		System.out.println("in");
		
	}

	@Override
	void off() {
		System.out.println("out");
		
	}
	public static void main(String[] args) {
		Abst2 a=new Abst2();
		a.on();
		a.off();

	}

}
