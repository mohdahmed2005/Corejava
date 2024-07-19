
public class Example {
   int x;
   int y;
   int z;
   
   public Example() {
	   x=10;
	   z=20;
	   System.out.println("construtor:" +x);
   }
   void m1(){
	  System.out.println("m1");
	  System.out.println(x);
	  System.out.println(z);
   }
   public void m2() {
	   System.out.println("m2");
	   System.out.println(z);
   }
   
	public static void main(String[] args) {
		System.out.println("main");
     Example e1=new Example();
     e1.z=30;
   //System.out.println(z);
e1.m1();
e1.m2();
}
}