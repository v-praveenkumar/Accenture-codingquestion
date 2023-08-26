/*
 * input1:3
 * input2:{1,2,3}
 * 
 * output:2
 * 
 * explanation: 2-1=1 3-2=1 sum=2
 */

package accenture;
import java.util.*;
public class penality {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int arr[]=new int[100];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=1;i<n;i++)
		{
			sum=Math.abs(arr[i]-arr[i-1])+sum;
		}
		System.out.print(sum);

	}

}
