package work;
import java.util.Scanner;

public class RunAddClass {
		private static Scanner input;
		public static void main(String[] args){
			    input=new Scanner(System.in);
				double r1=input.nextDouble();
				double i1=input.nextDouble();
				double r2=input.nextDouble();
				double i2=input.nextDouble();
				AddClass p1=new AddClass(r1,i1,r2,i2);
				System.out.println(p1.add1()+"+"+"("+p1.add2()+")"+"i");
				System.out.println(p1.add3()+"+"+"("+p1.add4()+")"+"i");
				System.out.println(p1.add5()+"+"+"("+p1.add6()+")"+"i");
				System.out.println(p1.add7()+"+"+"("+p1.add8()+")"+"i");
			}
}


