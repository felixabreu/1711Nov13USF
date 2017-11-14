package Day2;

public class operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * A Java operator is a special symbol that can be applied to a set
		 * of variables,values, or literals-referred to as operands
		 * -and that returns a result. There are three types available in Java
		 * unary - requires 1 operand
		 * binary - requires 2 operands
		 * ternary-3
		 * must be carried out in the following order
		 */
		//post unary operators
		int x = 10;
		x++;
		System.out.println(x);
		x--;
		System.out.println(x);
		
		//pre unary operators
		++x;
		System.out.println(x);
		--x;
		System.out.println(x);
		//other uary operators ~,+,-,!
		int y = -x;
		y = +x;
		int z=~4;
		System.out.println(z);
		
		//first order of binary operators from left to right -> *,/,%
		int test = 100/10%2*5;
		System.out.println(test);
		//addition and subtraction
		int sum = 2+3;
		//shift operators  <<,>>,>>>
		int shift = 1<<2;
		System.out.println(shift);
		//relational operators <,>,<=,>=,instanceof
		// equals ==,!=
		// logical operator &,|,^
		// short circuit &&,||
		int tern = shift < 1?5:2;

		System.out.println(tern);
		//assignment operators
		//=,+=,-=,*=,/=,%=,&=,|=,^=<<=,>>=,>>>=
		shift >>>=5;
		System.out.println(shift);
		
		}	
}
