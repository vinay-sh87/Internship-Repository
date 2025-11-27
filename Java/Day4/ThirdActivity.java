// Logical Operators
// 1. Logical AND -- && -- true only if both the conditions are true
// true		true		true
// false 	true 		false
// false 	true 		false
// false 	false 		false

// 2. Logical OR -- || -- true if any of the condition is true
// false 	false 		false
// true 	false 		true
// false 	true 		true
// true 	true 		true

// 3. Equality Operator -- == checks the equality of both the operands 

public class ThirdActivity{
	public static void main(String args[]){
		int a = 10, b = 20, c = 39;
		System.out.println((b>a) && (c>b));
		System.out.println((a>b) && (c>b));
		System.out.println((a>b) && (b>c));

		System.out.println((c>b) || (b>a));
		System.out.println((c<b) || (b>a));
		System.out.println((c>b) || (b<a));
		System.out.println((c<b) || (b<a));

		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		System.out.println(n1==n2);
	}
}