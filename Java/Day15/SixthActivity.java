class A{
	void sayHello(){
		System.out.println("Hello...A");
	}
}
// overriding through anonymous class
public class SixthActivity{
	public static void main(String args[]){
		A obj = new A(){
			void sayHello(){
				System.out.println("Hello..Again");
			}
		};
		obj.sayHello();
	}
}
