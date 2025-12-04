public class ThirdActivity{
	public static void main(String args[]){
		int a = 1;
		for( ;a<=10; ){
			System.out.println(a);
			a++;
		}
		System.out.println("a = "+a);
		
		for(int i=1, j = 2; i<=10 && j<=30; i++, j+=2){
			System.out.println(i + "   " +j);
		} 
	}
}