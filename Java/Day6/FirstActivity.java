public class FirstActivity{
	public static void main(String args[]){
		int value = Integer.parseInt(args[0]);
		// if-else
		if(value % 2 == 0){
			System.out.println(value + " is an Even number");
		}else{
			System.out.println(value + " is an Odd number");
		}
	}
}