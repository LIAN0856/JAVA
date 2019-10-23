package homework7;
public class Throw_Exp {
	public static void main(String[] args) {
	try {
		int a=5,b=0,c[]= {1,2,3,4,5};
		if(a>4) 
		{throw(new ArrayIndexOutOfBoundsException());}
		if(b==0) 
		{throw(new ArithmeticException());}	
		System.out.println(a/b);
	}
	catch(ArrayIndexOutOfBoundsException e1) {
		System.out.println("处理数组下标越异常的catch语句块捕获异常了！");
		System.out.println("捕获的异常为"+e1);
	}
	catch(ArithmeticException e2) {
		System.out.println("处理算数异常的catch语句块捕获异常了！");
		System.out.println("捕获的异常为"+e2);
	}
	finally {
		System.out.println("这个程序已经运行完了！");
	}
}}
