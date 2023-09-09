package classexample;
import java.util.*;

public class PunctuationChar {

	public static void main(String[] args) {

		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String name=sc.nextLine();
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i) ==',' || name.charAt(i)=='!' || name.charAt(i)==';' || name.charAt(i)=='.' ||name.charAt(i)=='?'||name.charAt(i)=='-'||name.charAt(i)==':' ||name.charAt(i)=='"')
			{
				count++;
			}
		}
		System.out.println("punctuations present in the given String:"+count);
	}

}
