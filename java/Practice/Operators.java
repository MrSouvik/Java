package Practice;

public class Operators {
	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		
		//Arithmetic Operator
		int add = a+b; //Addition
		int sub  = a-b; //Subtraction
		int mul = a*b; // Multiplication
		int div = a/b; //Division
		int mod = a%b; //Modulus
		
		//Assignment Operator
		a = 10; //Assignment
		a += 1; // Addition Assignment
		a -= 1; //Subtraction Assignment
		a *= 2; //Multiplication Assignment
		a /= 3; //Division Assignment
		
		//Unary Operators
		a++; // Post-Increment
		a--; // Post-Decrement
		++b; // Pre-Increment
		--b; // Pre-Decrement
		
		//Bitwise Operator
		int and = a & b; //AND
		int or  = a | b; //OR
		int ex_or = a ^ b;//Ex-OR
		int not = ~a;  //NOT
		
		//Bitwise Operator Assignment
		a &= b; //AND Assignment
		a |= b; // OR Assignment
		a ^= b; //Ex-OR Assignment
		
		//Shift Operator 
		a = a>>1; //Shift Right
		b = a<<1; //Shift left
		
		a >>= 1; //Shift Right Assignment 
		b <<= 2; //Shift Left Assignment
		
		//Relational Operator
		boolean res = a<b; //less than
		res = a>b; //grater than
		res = (a>=b); //grater than equal to
		res = (a<=b); //less than equal to
		res = (a==b); //equal to
		res = (a!=b); // not equal to
		
		//Ternary Operator
		int num = (a>b) ? a : b;
		
		//Logical Operator
		res = (a>b) && (a==b); // Logical AND
		res = (a>b) || (a==b); //Logical OR
		res = !(a<b); //Logical NOT
	}
}
