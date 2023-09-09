package classexample;
import java.util.*;

public class CountString {
	public static void main(String args[])
	{
		
		int count=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String name=sc.nextLine();
		
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)!=' ')
				count++;
			
		}
		System.out.println("the characters present in the name are:"+count);

	}

}
