package homework6;

import java.util.Scanner;

public class SelfGenerateException extends Exception{
	SelfGenerateException(String msg){
		super(msg);}
	public static void throwOne() throws SelfGenerateException{
			System.out.println("������������ֵ��");
			Scanner input=new Scanner(System.in);
			float a=input.nextFloat();
			Scanner input1=new Scanner(System.in);
			float b=input.nextFloat();
			Scanner input2=new Scanner(System.in);
			float c=input.nextFloat();
			if(((a+b)>c)&&((a+c)>b)&&((b+c)>a)) {
				float C=a+b+c;
				float p=(a+b+c)/2;
				double S=Math.sqrt(p*(p-a)*(p-b)*(p-c));
				System.out.println("�������ε��ܳ���"+C);
				System.out.println("�������ε������"+S);}
			else {throw new SelfGenerateException("��������ֵ���ܹ���һ�������Σ�");}
	}
	public static void main(String args[]) {
		try
		{throwOne();}
		catch(SelfGenerateException e)
		{e.printStackTrace();}
	}
}
