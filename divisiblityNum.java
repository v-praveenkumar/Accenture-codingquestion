/*
 * the function accepts three aruguments n,num1,num2
 * respectively we have to return true if n is divisible
 * by both num1 and num2 and return false its not 
 * divisible by both 
 * 
 * input: 8,2,-4
 * output: true
 */


package accenture;
import java.util.*;
public class divisiblityNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		if(check(num1,n) && check(num2,n))
		{
			System.out.print(true);
		}
		else
		{
			System.out.print(false);
		}
	}
	public static boolean check(int num, int n)
	{
		if(num>n)
		{
			if(num%n==0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			if(n%num==0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	}

}
