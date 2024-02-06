public class Relational_Operator {

	public static void main(String[] args) {
		int x=6;
		int y=5;
//		boolean result= x<y;
//		boolean result= x>y;
//		boolean result= x>=y;
//		boolean result= x<=y;
//		boolean result= x!=y;
		boolean result= x==y;
		System.out.println(result);
		
		double a=8.8;
		double b=9.8;
//		boolean res = a<=b;		
		boolean res = a>=b;
	
		System.out.println(res);
	}

}

/*
 * Relational operators serve the purpose of comparing values in programming. This includes using operators such as less than, greater than, and equality checks between two values. 
 * In Java, the assignment operator (=) assigns values, as demonstrated in the example "x=5," where the value 5 is assigned to the variable x.

To compare values, the double equal to (==) operator is utilized. Conversely, the not equal to operator (!=) is employed when checking for inequality between two values.

The set of relational operators comprises:

Less than
Greater than
Equal to (for comparison)
Not equal to
Less than or equal to
Greater than or equal to
It is essential to note that relational operators yield a boolean result, indicating either true or false based on the outcome of the comparison. 
They find frequent application in loops and conditional statements within programming logic.
 */