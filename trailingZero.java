/*
 * trailing zeroes 
 * input: 5
 * output:1
 * 
 * explanation 5!=120
 *  trailing zero is 1;
 */

package accenture;
import java.util.*;
public class trailingZero {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int res=trailing(n);
		System.out.print(res);
	}
	public static int trailing(int n)
	{
		int res=0;
		if(n>=5)
		{
			while(n>=5)
			{
				res=res+(n/5);
				n/=5;
			}
		}
		return res;
	}
}
