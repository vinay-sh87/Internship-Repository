public class SecondActivity{
	public static void main(String args[]){
		int a = 100, b=13;
		String result = (a>b)?"A is Greater":"B is Greater";
		System.out.println(result);
		
		String proof = true?"U have written true":"U have written false";
		System.out.println(proof);

		boolean isLoggedIn = true;
		boolean isAdmin = true;
		String role = isLoggedIn ? (isAdmin ? "Welcome to the Admin panel" : "Welcome!") : "Please log in first";
		System.out.println(role); 
		
	}
}