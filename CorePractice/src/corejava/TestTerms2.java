package corejava;
import java.util.*;

public class TestTerms2 {
	public static int power(int n,int p)
	{
		int r=1;
		for(int i=0;i<p;i++)
		{
			r=r*n;
		}
		return r;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no.");
		int terms=sc.nextInt();
		int series;
		int sum=0;
		for(int i=0; i<terms;i++)
		{
			//series=(int)(i+Math.pow(2, i));
			series=i+power(2,i);
			System.out.println(series+",");
			sum=sum+series;

		}
		System.out.println("\n"+sum);
		
	}

}
