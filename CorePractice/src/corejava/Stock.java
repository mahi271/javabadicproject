package corejava;
class TestStock{
	private long code;
	private int qty;
	private double price;
	private double total;
	private double discount;
	private double NetPrice;
	 TestStock(long n,int q,double p) {
		
		code=n;
		qty=q;
		price=p;
		
		
	}
	public void compute()
	{
		total=qty*price;
		discount=total*0.25;
		NetPrice=total-discount;
	}
	public void display()
	{
		System.out.println("the Stock info");
		System.out.println("the total quantity:"+qty);

		System.out.println("the total:"+total);
		System.out.println("the discount:"+discount);
		System.out.println("the Net Price:"+NetPrice);



	}
	
	
	
	
}

public class Stock {
	public static void main(String args[])
	{
		TestStock test=new TestStock(1,3,300);
		test.compute();
		test.display();
	}

}
