package Pkg1;

import com.sun.tools.javac.launcher.Main;

public class D2_assign1 
{
	public int sum (int a, int b) 
	{ 
		int c;
		c=a+b;
		System.out.println("sum result is "+c);
		return c;
	}
	public int sum2 (int c, int d)
			{ 
		int e;
		e=c+d;
		System.out.println("sum2 result is" +e);
		return e;
			}
	public int sub(int e, int f) 
	{
		int g;
		g=e-f;
		System.out.println("sub result is"+g);
		return g;
	}
public int multi (int g, int h)
{
	int k;
	k=g*h;
	System.out.println("multi result is" +k);
	return k;
}
public int div (int l, int m) 
{
	int n;
	n=l/m;
	System.out.println("div result is" +n);
	return n;
}
public static void main(String[] args)
{
	D2_assign1 ref=new D2_assign1();
	int sum=ref.sum(10,2);
	int sum2=ref.sum2(sum,2);
	int sub=ref.sub(sum2,2);
	int multi=ref.multi(sub,2);
	int div=ref.div(multi,2);
}
}
