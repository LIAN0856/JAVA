package work;
public class AddClass {
		public double r1=0,r2=0,i1=0,i2=0;
		AddClass(double r1,double i1,double r2,double i2)
		{this.r1=r1;this.r2=r2;this.i1=i1;this.i2=i2;}
		public double add1()
		{return r1+r2;}
		public double add2()
		{return i1+i2;}
		public double add3()
		{return r1-r2;}
		public double add4()
		{return i1-i2;}
		public double add5()
		{return r1*r2-i1*i2;}
		public double add6()
		{return r1*i2+i1*r2;}
		public double add7()
		{return (r1*r2+i1*i2)/(r2*r2+i2*i2);}
		public double add8()
		{return (i1*r2-r1*i2)/(r2*r2+i2*i2);}
}

		
	

