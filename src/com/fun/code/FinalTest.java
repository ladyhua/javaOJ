package com.fun.code;
class  A
{
 int  a=1;
 double  d=2.0;
 void  show( )
    {
        System.out.println("Class A:a=" + a + "    d=" +d);
    }
}
class  B  extends  A
{
    float  a=3.0f;                
    String  d="Java program.";  
  void  show( )                 
  { 
        super.show( );      
        System.out.println("Class B:a=" + a + "    d=" +d);
  }
}

public class FinalTest {
	public static void main(String args[]) {
		A a = new A();
		a.show();
		A b=new B();
		b.show();
	}
}
