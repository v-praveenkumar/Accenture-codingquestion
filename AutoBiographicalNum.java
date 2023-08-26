/*
 * autobiographical number
 * input:n="1210"
 * output:3
 * 
 */

package accenture;
import java.util.*;

public class AutoBiographicalNum {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int res=AutoBio(str);
		System.out.print(res);
	}
	public static int AutoBio(String str)
	{
		int count=0;
		char s[]=str.toCharArray();
		int arr[]= {0,0,0,0,0,0,0,0,0,0};
		for(int i=0;i<s.length;i++)
		{
			
			arr[Character.getNumericValue(s[i])]++;
		}
		for(int i=0;i<str.length();i++)
		{
			if(arr[i]!=Character.getNumericValue(s[i]))
			{
				return 0;
			}
		}
		for(int i=0;i<s.length;i++)
		{
			if(arr[i]>0)
			{
				count++;
			}
		}
		return count;
	}
}
