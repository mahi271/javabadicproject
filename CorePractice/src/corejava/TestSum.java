package corejava;
import java.util.*;

public class TestSum {
	public static int factorial(int n)
	{
		int f=1;
		for(int i=1;i<=n;i++)
		{
			f=f*i;
		}
		return f;
	}

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no:");
		int terms=sc.nextInt();
		int sum=0;
		
		for(int i=1;i<terms;i++)
		{
			sum=sum+factorial(i+1)/i;
			System.out.println("series is:!"+factorial(i+1)/i);
			
		}
		System.out.println("sum is :"+sum);

		
		

	}

}
