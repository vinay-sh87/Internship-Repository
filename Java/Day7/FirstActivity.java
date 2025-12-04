// Fall through : avoidance of break statement cuases multiple cases to execute this is called fall through in Java

public class FirstActivity{
	public static void main(String args[]){
		int value = Integer.parseInt(args[0]);
		switch(value){
			case 1:
				System.out.println("First Division");
				//break;
			case 2: 
				System.out.println("Second Division");
				//break;
			case 3: 	
				System.out.println("Third Division");
				//break;
			default: 
				System.out.println("Failed");
		}
	}
}