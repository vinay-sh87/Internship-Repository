public class FifthActivity{
	public static void main(String args[]){
		byte a = 23;
		int b = a; // System Managed Type conversion || Implicit Type Conversion
		System.out.println("b="+b);
	
		int c = 1000;
		byte d = (byte)c; // User Managed Type conversion || Explicit Type Conversion
		System.out.println("d="+d);

	}
}
