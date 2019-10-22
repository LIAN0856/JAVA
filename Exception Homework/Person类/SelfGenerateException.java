package homework8;
import java.util.Scanner;
public class SelfGenerateException{
	public static void main(String args[]){
		class Person1 extends Person{
			String man;String female;
			public Person1(String Name, String Gender, int Age)throws SelfGenerateException1,SelfGenerateException2{
				super(Name, Gender, Age);
				System.out.println("请依次输入Person1的姓名、性别、年龄：");
				Scanner input1=new Scanner(System.in);
				String Name1=input1.nextLine();
				Scanner input2=new Scanner(System.in);
				String Gender1=input2.nextLine();
				Scanner input3=new Scanner(System.in);
				int Age1=input3.nextInt();
				try
				{
				if ((Gender1!="man")||(Gender1!="female")) 
				{throw new SelfGenerateException1 ("输入的性别有误，请重新输入!");}
				if((Age1<0)||(Age1>120)) 
				{throw new SelfGenerateException2 ("输入的年龄范围有误，请重新输入!");}
				System.out.println("Person1 的信息为："+Name1+Gender1+Age1);
			    }
				catch(SelfGenerateException1 e) {
					System.out.println("这是关于性别的异常！");
				}
				catch(SelfGenerateException2 e) {
					System.out.println("这是关于年龄的异常！");
				}
		}
	}
			class Person2 extends Person{
				String man;String female;
				public Person2(String Name, String Gender, int Age)throws SelfGenerateException1,SelfGenerateException2{
					super(Name, Gender, Age);
					System.out.println("请依次输入Person2的姓名、性别、年龄：");
					Scanner input1=new Scanner(System.in);
					String Name1=input1.nextLine();
					Scanner input2=new Scanner(System.in);
					String Gender1=input2.nextLine();
					Scanner input3=new Scanner(System.in);
					int Age1=input3.nextInt();
					try
					{
					if ((Gender1!="man")||(Gender1!="female")) 
					{throw new SelfGenerateException1 ("输入的性别有误，请重新输入!");}
					if((Age1<0)||(Age1>120)) 
					{throw new SelfGenerateException2 ("输入的年龄范围有误，请重新输入!");}
					System.out.println("Person2的信息为："+Name1+Gender1+Age1);
				    }
					catch(SelfGenerateException1 e) {
						System.out.println("这是关于性别的异常！");
					}
					catch(SelfGenerateException2 e) {
						System.out.println("这是关于年龄的异常！");
					}
			}
    }
  }
}