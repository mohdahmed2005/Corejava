
public class Test1 {
   int m1() {
	   System.out.println("m1");
	   return 5;
   }
   int m2() {
	   System.out.println("m2");
	   return 10;
   }
   int m3() {
	   System.out.println("m4");
	   return m2();
   }
	public static void main(String[] args) {
		Test1 t =new Test1();
		t.m1();
		t.m2();
		t.m3();
	}
}
