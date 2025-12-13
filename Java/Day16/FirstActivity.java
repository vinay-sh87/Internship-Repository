class A{
	void sayHello(){
		System.out.println("Hello....A");
	}
}
public class FirstActivity{
	public static void main(String args[]){
		A obj = new A(){
			void sayHello(){
				System.out.println("Hello...again");
			}
		};
		obj.sayHello();
		(new A(){
			void sayHello(){
				System.out.println("Hello...once again");
			}
		}).sayHello();
	}
}