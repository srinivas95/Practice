package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class functionsClass
{
	public String reverse(String get_input)
	{
		System.out.println(get_input);
		if (get_input.isEmpty()||get_input == null)
		{
			System.out.println("empty");
			return get_input;
		}
		
		char [] gia = get_input.toCharArray();
		System.out.println(Arrays.toString(gia));
		//now input string in char-array
		for (int i=0,j = gia.length-1;i<j;i++,j--)
		{
			char temp = gia[j];
			gia[j] = gia[i];
			gia[i] = temp;		
		}
		return new String(gia);
		
	}
}

public class stringreverse {

	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter String:");
		String get_input = br.readLine();
		functionsClass obj  = new functionsClass();
		String output_reverse = obj.reverse(get_input);
		System.out.println(output_reverse);
		br.close();
	}
	
	
	
}
