package Pkg1;

public class prac2 {

	//(((((10*2)-2)+2)-2)/2)
	
	public int mult(int a, int b) 
	{
		int c;
		c= a*b;
		System.out.println("mult result is" +c);
		return c;
		
	}
	public int sub(int c, int d) 
	{
		int e;
		e= c-d;
		System.out.println("sub result is" +e);
		return e;
	}
	public int sum(int e, int f) 
	{
		int g;
		g= e+f;
		System.out.println("sum result is" +g);
		return g;
	}
	public int sub2(int g, int h) 
	{
		int i;
		i= g-h;
		System.out.println("sub2 result is" +i);
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
		prac2 ref=new prac2();
		int mult=ref.mult(10, 2);
		int sub=ref.sub(mult, 2);
		int sum=ref.sum(sub, 2);
		int sub2=ref.sub2(sum, 2);
		int div=ref.div(sub2, 2);
				
		
		
	}
}
