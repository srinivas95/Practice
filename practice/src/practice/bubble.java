package practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class bubble {
	static void bubble(int get_b[])
	{
		int l = get_b.length;
		System.out.println("length"+" "+l);
		for (int t=0 ; t<=l ;t++)
		{
			for (int t1 = 0 ;t1<l-1 ; t1++)
			{
				if (get_b[t1]>get_b[t1+1])
				{
					int swaptemp = get_b[t1];
					get_b[t1] = get_b[t1+1];
					get_b[t1+1] = swaptemp;
					
				}
			}
		}
		System.out.println(Arrays.toString(get_b));
	}
	
	
	public static void main(String args[])
	{
		int[] b = {100,99,98,97,96,94,95,93,92,91,90};
		System.out.println(b[4]);
		int [] s = new int[10];
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
			s[i] = i+1;
			
		}
 		System.out.println(Arrays.toString(s));	
 		bubble(b);
 		
	}

}
