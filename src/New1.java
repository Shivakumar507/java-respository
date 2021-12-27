
public class New1 {

	public static void main(String[] args) {
		long a,b;
		String name;
		char c; 
		
		System.out.println("enter your name:");
		name= ob.readLine();
		System.out.println("enter the character value:");
		c=(char)ob.read();
		System.out.println(name);
		System.out.println("enter the value of a: ");
		a=Long.parseLong( ob.readline());
		System.out.println("enter the value of b: ");
		b=Long.parseLong(ob.read());
		
		System.out.println("Sum="+ (a+b));
		
		
	}

}
