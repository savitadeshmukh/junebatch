package Pkg1;

public class practise1 {

	//((((10+2)+2)-2)*2)/2)
	
	public int sum(int a, int b) 
	{
		int c;
		c= a+b;
		System.out.println("sum result is" +c);
		return c;
				
	}
	public int sum2(int c, int d) 
	{
		int e;
		e= c+d;
		System.out.println("sum2 result is" +e);
		return e;
	}
	public int sub(int e , int f) 
	{
		int g;
		g= e-f;
		System.out.println("sub result is"+g);
		return g;
	}
	public int mult(int g, int h) 
	{
		int i;
		i= g*h;
		System.out.println("mult result is" +i);
		return i;
	}
	public int div(int i, int j) 
	{
		int k;
		k= i/j;
		System.out.println("div result is" +k);
		return k;

	}
	public static void main(String[] args) 
	{
		practise1 ref=new practise1();
		int sum= ref.sum(10, 2);
		int sum2= ref.sum2(sum,2);
		int sub=ref.sub(sum2,2);
		int mult= ref.mult(sub,2);
		int div= ref.div(mult,2);
		
		
	}
}
