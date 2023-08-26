/*
 * input: 8 4 5 3 2 6 9 1
 * output: 189 129 90 45 15 9 0 0
 * 
 * 8->4+5+3+2+6+1=21 21*9=189
 */

package accenture;
import java.util.*;
public class accentpra {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(toprint(i,arr));
		}
	}
	public static int toprint(int i,int arr[])
	{
		int minsum=0,maxsum=0;
		if(i!=arr.length-1 && i!=arr.length-2)
		{
		for(int j=i+1;j<arr.length;i++)
		{
			if(arr[i]<arr[j])
			{
				minsum=minsum+arr[j];
			}
			else 
			{
				maxsum=maxsum+arr[j];
			}
		}
		}
		return minsum*maxsum;
	}

}
