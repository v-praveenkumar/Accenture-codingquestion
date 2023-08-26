/*
 * n=5
 * n is odd n-1
 * n is even n/2;
 * 
 * count step until 0
 */

package accenture;
import java.util.*;
public class stepCalculate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		while(n>0)
		{
			if(n%2==0)
			{
				count++;
				n/=2;
			}
			else
			{
				count++;
				n--;
			}
		}
		System.out.print(count);

	}

}
