
public class MethodDemo {
	static void m1() {
		System.out.println("inside m1");
		return;
	}

	static int m2() {
		System.out.println("inside m2");
		m1();
		return 5;
	}
	static int m3(int x) {
		System.out.println("--------------------------");
		m2();
		System.out.println("----------------------------");
		System.out.println("m3");
		return 10;
	}
	public static void main(String[] args) {
		//MethodDemo t1 = new MethodDemo();
		//t1.m1();
		//t1.m2();
		//System.out.println(t1.m2());
     //  m1();
     //  m2();
     m3(m2());
    //   System.out.println(m3(m2()));
		
		
	}

}
