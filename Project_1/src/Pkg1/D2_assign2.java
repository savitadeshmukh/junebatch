package Pkg1;

public class D2_assign2 {
//(((((10*2)-2)+2)-2)/2)
	
	public int multi (int a, int b) {
		int c ;
		c= a*b;
		System.out.println("multi resut is " +c);
		return c;
	}
	public int sub (int c, int d) {
		int e;
		e=c-d;
		System.out.println("sub result is" +e);
		return e;
	
	}
	public int sum (int e, int f) {
		int g;
		g=e+f;
		System.out.println("sum result is" +g);
		return g;
	}
	public int sub2 (int h, int j) {
		int k ;
		k=h-j;
		System.out.println("sub2 result is "+k);
		return k;		
	}
	public int div (int z, int m) {
		int n;
		n=z/m;
		System.out.println("div result is "+n);
		return n;
	
	}
	public static void main(String[] args) {
		D2_assign2 ref=new D2_assign2();
		int multi=ref.multi(10, 2);
		int sub=ref.sub(multi, 2);
		int sum=ref.sum(sub, 2);
		int sub2=ref.sub2(sum, 2);
		int div =ref.div(sub2, 2);
		
	}
}
