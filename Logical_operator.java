public class Logical_operator {
    public static void main(String[] args) {
		int x=7;
		int y=5;
		int a=5;
		int b=9;
		
//		boolean result= x>y && a<b ;
//		boolean result= x>y || a<b ;
//		boolean result= x>y && a>b ;
//		boolean result= x>y || a>b ;
//		boolean result= x<y && a<b ;
//		boolean result= x<y || a<b ;
//		boolean result= x<y || a<b || a>1 ;
		
//		System.out.println(result);
		
		boolean result= a>b ;
		System.out.println(!result);
		
	}
    
}

/*
 
Logical operators are used to combine the results of two or more relational operators in programming. There are three main logical operators: AND (&&), OR (||), and NOT (!).

AND Operator (&&):

If both conditions are true, the result is true.
If one condition is true and the other is false, the result is false.
If one condition is false and the other is true, the result is false.
If both conditions are false, the result is false.
The AND operator is known for short-circuit evaluation. If the first condition is false, it won't check the second one, optimizing execution time.
OR Operator (||):

If both conditions are true, the result is true.
If one condition is true and the other is false, the result is true.
If one condition is false and the other is true, the result is true.
If both conditions are false, the result is false.
Similar to the AND operator, the OR operator also uses short-circuit evaluation. If the first condition is true, it won't check the second one, optimizing execution time.
NOT Operator (!):

The NOT operator is used to reverse the result of a condition.
If the result is false, NOT makes it true.
If the result is true, NOT makes it false.
It essentially negates the outcome of the condition.
Logical operators are fundamental in controlling the flow of programs and making decisions based on multiple conditions.

 */
