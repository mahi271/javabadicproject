package classexample;
import java.util.*;

public class DivideString {
	public static void main(String args[])
	{
		String name="mahiii";
		int len=name.length();
		int n=3;
		int temp=0,chars=len/n;
		String[] equalStr=new String[n];
		
		if(len % n !=0)
		{
			System.out.println("Sorry this string cannot divided in "+n+"equal parts");
		}
		else
		{
			for(int i=0;i<len;i=i+chars)
			{
				String part=name.substring(i,i+chars);
				equalStr[temp]=part;
				temp++;
			}
			System.out.println(n+"equal parts of given string are");
			for(int i=0;i<equalStr.length;i++)
			{
				System.out.println(equalStr[i]);
			}
		}
		
	}

}
