package homework8;
import java.util.Scanner;
public class SelfGenerateException{
	public static void main(String args[]){
		class Person1 extends Person{
			String man;String female;
			public Person1(String Name, String Gender, int Age)throws SelfGenerateException1,SelfGenerateException2{
				super(Name, Gender, Age);
				System.out.println("����������Person1���������Ա����䣺");
				Scanner input1=new Scanner(System.in);
				String Name1=input1.nextLine();
				Scanner input2=new Scanner(System.in);
				String Gender1=input2.nextLine();
				Scanner input3=new Scanner(System.in);
				int Age1=input3.nextInt();
				try
				{
				if ((Gender1!="man")||(Gender1!="female")) 
				{throw new SelfGenerateException1 ("������Ա���������������!");}
				if((Age1<0)||(Age1>120)) 
				{throw new SelfGenerateException2 ("��������䷶Χ��������������!");}
				System.out.println("Person1 ����ϢΪ��"+Name1+Gender1+Age1);
			    }
				catch(SelfGenerateException1 e) {
					System.out.println("���ǹ����Ա���쳣��");
				}
				catch(SelfGenerateException2 e) {
					System.out.println("���ǹ���������쳣��");
				}
		}
	}
			class Person2 extends Person{
				String man;String female;
				public Person2(String Name, String Gender, int Age)throws SelfGenerateException1,SelfGenerateException2{
					super(Name, Gender, Age);
					System.out.println("����������Person2���������Ա����䣺");
					Scanner input1=new Scanner(System.in);
					String Name1=input1.nextLine();
					Scanner input2=new Scanner(System.in);
					String Gender1=input2.nextLine();
					Scanner input3=new Scanner(System.in);
					int Age1=input3.nextInt();
					try
					{
					if ((Gender1!="man")||(Gender1!="female")) 
					{throw new SelfGenerateException1 ("������Ա���������������!");}
					if((Age1<0)||(Age1>120)) 
					{throw new SelfGenerateException2 ("��������䷶Χ��������������!");}
					System.out.println("Person2����ϢΪ��"+Name1+Gender1+Age1);
				    }
					catch(SelfGenerateException1 e) {
						System.out.println("���ǹ����Ա���쳣��");
					}
					catch(SelfGenerateException2 e) {
						System.out.println("���ǹ���������쳣��");
					}
			}
    }
  }
}