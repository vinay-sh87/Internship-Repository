public class FirstActivity{
	public static void main(String args[]){
		byte a =10;
		System.out.println("a = "+a);
		a = 014; // Octal Number
		System.out.println("a = "+a);
		a = 0xA; // Hexadecimal Number
		System.out.println("a = "+a);
		a = 0Xa; 
		System.out.println("a = "+a);

		// long
		// l/L is optional in long but it makes the processing easier for long values
		long b = 12345;
		System.out.println("b = "+b);
		b = 12345l;
		System.out.println("b = "+b);
		b = 12345L;
		System.out.println("b = "+b);

		// floating values 
		float c = 1.23f; // F suffix is mandotory here
		System.out.println("c = "+c);
		c = 1.23e-1f;
		System.out.println("c = "+c);
		c = 1.23E-2F;
		System.out.println("c = "+c);
		
		

	}
}