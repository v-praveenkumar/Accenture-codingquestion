/*
 * the function acceptes two integers n,m as arguments.
 * find the sum of all numbers in range from 1 to m(
 * both inclusive )that are not divisiblle by n. return difference between
 * sum of integer not divisible by n with sum of number
 * divible by n
 * 
 * input:n=2 m=4
 * output:2
 */

package accenture;
import java.util.*;
public class divisibleDif {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int sum=0,nsum=0;
		for(int i=1;i<=m;i++)
		{
			if(i%n!=0)
			{
				nsum=i+nsum;
			}
			else
			{
				sum=sum+i;
			}
		}
		System.out.print(Math.abs(sum-nsum));

	}

}
