package homework4;
import java.util.Random;
public class combination {
	public static void main(String[] args) {
		String a[]= {"blue","white","pink","yellow"};
		String b[]= {"sky","tree","house","flower"};
		String c[]= {"triangle","circular","square"};
		Random random=new Random();
		int x=(int)(Math.random()*a.length+0);
		int y=(int)(Math.random()*b.length+0);
		int z=(int)(Math.random()*c.length+0);
		System.out.println(a[x]);
		System.out.println(b[y]);
		System.out.println(c[z]);
	}
}
