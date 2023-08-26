/*
 * write a program to input string and display count
 * of all permutations of strings without using any
 * built in function 
 * 
 * input: abc
 * output:6(3!)
 * 
 * if(aab) input
 * output: 3!/2!=3
 * 
 */


package accenture;
import java.util.*;
public class stringPermutation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int res=permutation(str);
		System.out.print(res);

	}
	public static int permutation(String str)
	{
		char s[]=str.toCharArray();
		int count[]= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		for(int i=0;i<str.length();i++)
		{	
			count[(int)s[i]-(int)'a']++;
		}
		int res=fact(s.length);
		for(int i=0;i<26;i++)
		{
			if(count[i]>1)
			{
				res=res/fact(count[i]);
			}
		}
		return res;
		
	}
	public static int fact(int a)
	{
		System.out.println(a);
		for(int i=a-1;i>=1;i--)
		{
			a=a*i;
			//System.out.println(a);
		}
		System.out.println(a);
		return a;
	}

}
