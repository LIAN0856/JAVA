package homework8;
import java.util.Scanner;
public class Person {
	String Name1;
	String Gender1;
	String Age1;
	public static void main(String args[]) {
			class SelfGenerateException extends Exception{
				public SelfGenerateException (String msg) {
				super(msg);
				}
			public void doPerson()throws SelfGenerateException{
				String man;String female;
				System.out.println("����������Person1��person2���������Ա����䣺");
				Scanner input=new Scanner(System.in);
				String Name1=input.nextLine();
				String Gender1=input.nextLine();
				int Age1=input.nextInt();
				Person P1=new Person();
				String Name2=input.nextLine();
				String Gender2=input.nextLine();
				int Age2=input.nextInt();
				Person P2=new Person();
				try {
				if ((Gender1!="man")||(Gender1!="female")||(Gender2!="man")||(Gender2!="female")) 
				{throw new SelfGenerateException ("������Ա����Ϊman����female������������!");}
				if((Age1<0)||(Age1>120)||(Age2<0)||(Age2>120)) 
				{throw new SelfGenerateException ("��������䷶Χ��������������!");}
				System.out.println("Person1 ����ϢΪ��"+Name1+Gender1+Age1);
				System.out.println("Person2 ����ϢΪ��"+Name2+Gender2+Age2);
				}
		    	catch(SelfGenerateException e) {
					System.out.println("����һ�������쳣��");
				}
	      }	
	 }
   }
}
