public class Assignment_operator {
    public static void main(String[] args) {

        	
        int num1=7;
        int num2=5;
        int result=num1+num2;
        System.out.println(result);
        
                
       
        // int num1=7;
        // int num2=5;
        // int result=num1-num2;
        // System.out.println(result);

                
       		
        // int num1=7;
        // int num2=5;
        // int result=num1*num2;
        // System.out.println(result);

                
       
        // int num1=7;
        // int num2=5;
        // int result=num1/num2;
        // System.out.println(result);

                
        
        // int num1=7;
        // int num2=5;
        // int result=num1%num2;
        // System.out.println(result);

                
        // int num=7;
        // num=num+2;
        // num+=2;
        // num*=2;
        
        // num++;    //post increment
        // ++num;    //pre increment
        // num--;    //post decrement
        // --num;	  //pre decrement
        // System.out.println(num);
        
        // int result=num++; //fetch the value and then increment
        // System.out.println(result);		
            
            }
}

/*
 1)Assignment operator 
 a) = is used to assign a value to a variable
 b) += is used to assign a value to a variable by adding it to the existing value
 c) -= is used to assign a value to a variable by subtracting it from the existing value

 -- there are many but in this lecture we discussing only some 

 e.g of =
        int num1=11;
        int num2=12;
        int result = num1 + num2;
        int result1=num1-num2;
        int result2=num1*num2;
        int result3=num1/num2;
e.g of +=
int num=1;
num +=1; =  num = num+1;
num +=5; = num = num+5;

e.g of -=
int num2=2;
num -=1; num =num-1;
num -=5; num =num-5;

2)increment and decrement operator
 -- there are two type of increment and decrement operator
 a) pre 
 b) post

-- post increment and decrement operator
 int num=1;
 num++; 
 System.out.println(num); // 2
 -- this operator is known as post increment operator

 num--;
 System.out.println(num); //1
 -- this operator is know  as post decrement operator 

-- pre increment and decrement operator
 int num=2;
 ++num; 
 System.out.println(num);//3

 --num;
 System.out.println(num);//2

Difference between pre and post operator
e.g for that we take one example
int num=5;
System.out.println(num++); // 5 is print on console

int  num1=5;
System.out.println(++num); //6 is printed on screen 

in post 
first assignment and then increment
e.g int num=5; int copy;
copy=num++; in this case first num=5 assign to copy then increment the num
copy value is 5;

in pre 
first increment then assignment
e.g int num=5;
int copy;
copy = ++num;

in this case first increment num value from 5 to 6 then assign to copy.
copy value is 6;
 */
