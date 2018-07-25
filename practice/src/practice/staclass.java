package practice;


class check
{
	int cv = 5;
	static int cv2 = 5;
	public void method1(int get_a)
	{
		cv = get_a+cv;
		System.out.println(cv);
	}
	public static void method2(int get_b)
	{
		cv2 = get_b+cv2;
		System.out.println(cv2);
	}
}



public class staclass {
	public static void main(String args[])
	{
		check.method2(1);
		check.method2(1);
		check obj = new check();
		obj.method1(1);
		check obj2 =new check();
		obj2.method1(1);
		obj2.method1(1);
	}
	

}
