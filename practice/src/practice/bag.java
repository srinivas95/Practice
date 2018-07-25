package practice;

import java.util.*;

class TwoArray
{
	static void TwoArray()
	{
		int a[]={1,3,3,2,5,3,5,2};
		int b[]={1,2,3,8,5,1,0,7};
		for (int i=0 ; i<a.length-1;i++)
		{
			for (int j=0 ; j<b.length-1; j++)
			{
				if (a[j]<a[j+1])
				{
//					System.out.println(a[j]);
					int templ = a[j+1];
					a[j+1] = a[j];
					a[j] = templ;
					
					int templ2 = b[j+1];
					b[j+1] = b[j];
					b[j] = templ2;
//					System.out.println(a[j]+","+a[j+1]+"--->"+b[j]+b[j+1]);
//					System.out.println(Arrays.toString(a));
//					System.out.println(Arrays.toString(b));
					
				}
				else if(a[j] == a[j+1])
				{
					System.out.println("equals");
					if(b[j]>b[j+1])
					{
						int templ = a[j+1];
						a[j+1] = a[j];
						a[j] = templ;
						
						int templ2 = b[j+1];
						b[j+1] = b[j];
						b[j] = templ2;
						System.out.println(a[j]+","+a[j+1]+"--->"+b[j]+","+b[j+1]);
						System.out.println(Arrays.toString(a));
						System.out.println(Arrays.toString(b));
						
					}
				}
			}
		
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		ArrayList<Integer> finalArray = new ArrayList<Integer>();
		for (int fi = 0 ; fi<a.length;fi++)
		{
			for (int fi2 = 0 ; fi2<a[fi] ; fi2++)
			{
				finalArray.add(b[fi]);
			}
		}
		System.out.println(finalArray);
	}
}


public class bag {
	

	
public static void main(String args[])
{
//	String s = "srinivas";
//	char a[] = s.toCharArray();
//	System.out.println(a[0]);
//	System.out.println(Arrays.toString(a));
//	Scanner sobj = new Scanner(System.in);
//	System.out.println("enter number");
//	String ia = sobj.next();
//	System.out.println(ia);
////	mylist<Integer> ml  = new mylist();
//	ArrayList<Integer> ai = new ArrayList<Integer>();
//	ai.add(1);
//	ai.add(2);
//	ai.add(3);
//	System.out.println(ai);
	TwoArray obj = new TwoArray();
	obj.TwoArray();
	
}
}
