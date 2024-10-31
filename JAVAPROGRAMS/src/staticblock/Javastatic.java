package staticblock;

public class Javastatic {
	static{
		System.out.println("iam static block");
	}
	{
		System.out.println("iam non static block");
	}

	public static void main(String[] args) {
		System.out.println("static understand"); 
		Javastatic s=new Javastatic();

	}

}
