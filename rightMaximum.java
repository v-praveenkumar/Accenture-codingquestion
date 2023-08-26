/*
 * input: a[]={52,66,64,36,45,24,32}
 * output: 32+45+64+66=207
 */
package accenture;
import java.util.*;
public class rightMaximum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int sum=arr[n-1];
		for(int i=n-2;i>=0;i--)
		{
			if(check(i,arr))
			{
				sum=sum+arr[i];
			}
		}
		System.out.print(sum);

	}
	public static Boolean check(int n,int arr[])
	{ 
		int max=arr[n]; 
		for(int i=n+1;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				return false;
			}
		}
		return true;
		
	}

}
