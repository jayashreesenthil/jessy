package sw;

public class Demo {

	int studentid;
	String Name;
	int dob;
	public Demo()
	{
		System.out.println("hii");
	}
	public Demo(int a)
	{
		System.out.println("cons invoked"+a);
	}
	
	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentidd) {
		studentid = studentidd;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getDob() {
		return dob;
	}

	public void setDob(int dob) {
		this.dob = dob;
	}

	public static void main(String[] args) {
	Demo s=new Demo();
	Demo d=new Demo(10);
	d.setStudentid(12);
	d.setName("swetha");
	d.setDob(15);
	System.out.println(d.getDob());
	System.out.println(d.getName());
	System.out.println(d.getStudentid());

	}

}
