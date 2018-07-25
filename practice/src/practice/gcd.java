package practice;

class gcdFunction
{
	static int gcdfunction(int n1,int n2)
	{
		int result_1 = n1%n2;
		while (result_1 != 0 )
		{
			n2 = result_1;
			result_1 = n2%result_1;
		}
		return n2;
	}
	static int get_input(int get_value[])
	{
		int result = get_value[0];
		for (int i=1 ; i<get_value.length;i++)
		{
			result = gcdfunction(result,get_value[i]);
			
		}
				
		
		return result;
		
	}
}



public class gcd {
public static void main(String abcd[])
{
//	int get_value=gcdFunction.gcdfunction(16,4,8);
//	System.out.println(get_value);
	int input_gcd [] ={11,21,44};
	int get_gcd_result = gcdFunction.get_input(input_gcd);
	System.out.println(get_gcd_result);
	
	
	
}
}
