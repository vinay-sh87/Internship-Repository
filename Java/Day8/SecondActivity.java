public class SecondActivity{
	public static void main(String args[]){
		int value = Integer.parseInt(args[0]);
		int first = 0, second = 1, result = 0;
		System.out.println(first);
		System.out.println(second);
		value -= 2;
		for(int i =1; i<= value;i++){
			result = first + second;
			first = second;
			second = result;
			System.out.println(result);
		}
	}
}