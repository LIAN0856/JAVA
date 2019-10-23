package homework6;

import java.util.Scanner;

public class SelfGenerateException extends Exception{
	SelfGenerateException(String msg){
		super(msg);}
	public static void throwOne() throws SelfGenerateException{
			System.out.println("请输入三个数值：");
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
				System.out.println("该三角形的周长是"+C);
				System.out.println("该三角形的面积是"+S);}
			else {throw new SelfGenerateException("该三个数值不能构成一个三角形！");}
	}
	public static void main(String args[]) {
		try
		{throwOne();}
		catch(SelfGenerateException e)
		{e.printStackTrace();}
	}
}
