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
		System.out.println("���������±�Խ�쳣��catch���鲶���쳣�ˣ�");
		System.out.println("������쳣Ϊ"+e1);
	}
	catch(ArithmeticException e2) {
		System.out.println("���������쳣��catch���鲶���쳣�ˣ�");
		System.out.println("������쳣Ϊ"+e2);
	}
	finally {
		System.out.println("��������Ѿ��������ˣ�");
	}
}}
