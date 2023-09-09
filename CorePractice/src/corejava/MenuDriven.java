package corejava;
import java.util.*;

public class MenuDriven {
	int countdigit(int no)
	{
	int cnt=0;
	while(no>0)
	{
		cnt++;
		no=no/10;
	}
	
	return cnt;
	}
	
	int power(int pno, int po)
	{
		int product=1;
		for(int i=1;i<=po;i++)
		{
			product=product*pno;
		}
		return product;
	}
	int findfactorial(int fno)
	{
		int fact=1;
		for(int i=1;i<=fno;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	
	public static void main(String args[])
	{
		MenuDriven count=new MenuDriven();
		
		Scanner sc=new Scanner(System.in);
		
		
		
		String str=null;
		do {
			System.out.println("1.count how many no. in a digit");
			System.out.println("2.calculate power of no.");
			System.out.println("3.factoral of the no.");
			System.out.println("enter your choice");
			int choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				
				System.out.println("enter the no.");
				int no=sc.nextInt();
				int di=count.countdigit(no);
				System.out.println("no. of digits in num"  +di);
				break;
				
			case 2:
				
				System.out.println("enter the no. to calculate power ");
				int pno=sc.nextInt();
				System.out.println("enter the power");
				int po=sc.nextInt();
				int Power=count.power(pno,po);
				System.out.println("the power of given no"+Power);
				break;
				
			case 3:

				System.out.println("enter the no. to get factorial");
				int fno=sc.nextInt();
				int factorial=count.findfactorial(fno);
				System.out.println("factorial of given no."+factorial);
				break;
				
				default:
					System.out.println("enter valid choice");
					break;
				
				
			
				}
			System.out.println("do you want to continue if yes");
			str= sc.next();

		}while(str.equals("yes"));
		
		
	}
	

}
