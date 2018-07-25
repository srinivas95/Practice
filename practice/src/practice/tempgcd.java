package practice;

//Java program to find GCD of two or
//more numbers

public class tempgcd {
 // Function to return gcd of a and b
 static int gcd(int a, int b)
 {
     if (a == 0)
         return b;
     System.out.println(a+","+b);
     return gcd(b % a, a);
 }

 // Function to find gcd of array of
 // numbers
 static int findGCD(int arr[], int n)
 {
     int result = arr[0];
     for (int i = 1; i < n; i++)
         result = gcd(arr[i], result);
     	System.out.println(result);

     return result;
 }

 public static void main(String[] args)
 {
//	 System.out.println(21%11);
     int arr[] = { 11,21,44 };
     int n = arr.length;
     System.out.println(findGCD(arr, n));
 }
}
