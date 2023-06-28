package Pkg1;

public class constructor1 {
	int a,b,c,d;
	
	public constructor1(int a1, int a2, int a3, int a4)
	{
		a=a1;
		b=a2;
		c=a3;
		d=a4;
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		constructor1 ref=new constructor1(12, 78, 55, 67);
		
		System.out.println(ref.a);
		System.out.println(ref.b);
		System.out.println(ref.c);
		System.out.println(ref.d);
	}

}
