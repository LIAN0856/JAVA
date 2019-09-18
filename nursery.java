package homework3;

public class nursery {
	public static void main(String[] args) {
		String s1=" bottles of beer on the wall,";
		String s2=" bottles of beer.";
		String s3="Take one down. Pass it around.";
		String s4=" bottles of beer on the wall.";
		String s5="No more bottles of beer on the wall.";
		String s6=" bottle of beer on the wall,";
		String s7=" bottle of beer.";
		String s8=" bottle of beer on the wall.";
	for(int N=99;N>=0;N--) {
		if(N==1)
			{
			System.out.println(N+s6);
			System.out.println(N+s7);
			System.out.println(s3);
			System.out.println(N+s8);
			}
			else if(N==0)
				{System.out.println(s5);}
			else
				{
				System.out.println(N+s1);
				System.out.println(N+s2);
				System.out.println(s3);
				System.out.println(N+s4);
				}	
		}
	}
}
