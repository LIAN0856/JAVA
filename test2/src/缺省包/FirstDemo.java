package È±Ê¡°ü;

import Test.Animal.Animals;
import Test.Animal.Bird;
import Test.Animal.Tiger;

public class FirstDemo {
	public static void main(String[] args) {
		Animals[] Arrzoo=new Animals[3];
		Arrzoo[0]=new Bird();
		Arrzoo[1]=new Tiger();
		Arrzoo[2]=new Bird();
		for(int i=0;i<3;i++)
		{
			System.out.println("***************");
			Arrzoo[i].run();
		}
		for (Animals a:Arrzoo)
		{
			System.out.println("---------------");
			a.eat();
		}
	}
}
