public class SecondActivity{
	public static void main(String args[]){
		final int a = 34;
		System.out.println("a="+a);
		a = 38; // error : can't assign to final variable
		System.out.println("a="+a);
	}
}