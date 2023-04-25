//"welcome to java";
// emoclew ot avaj
package com.pack1;

public class Test1 
{
	public static void main(String[] args)
	{
		String s1 = "welcome to java";
	
		String[] s2 = s1.split(" ");
		
		String s3 = "";
		
		for(int i=0; i<=s2.length-1; i++)
		{
			String s = s2[i];
			String rev = "";
			for(int j=s.length()-1; j>=0; j--)
			{
				char ch = s.charAt(j);
				rev = rev+ch;
			}
			s3 = s3+rev+" ";
		}
		System.out.println("The reverse Word is : "+s3);
		
	}
}
