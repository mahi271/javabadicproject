package grade3;

import java.util.Scanner;

public class Vowels {
	public static void main(String[] args) {
		int Ccount = 0;
		int Vcount=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String name=sc.nextLine();
		
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)== 'a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u')
			{
				Vcount++;
			}
			else if(name.charAt(i)>='a')
			{
				Ccount++;
			}

		}


		System.out.println("the number of vowels:"+Vcount);
		System.out.println("the number of Constants:"+Ccount);


	}


}
