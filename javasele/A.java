package javasele;

public class A {
	 
	int x;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		A a1=new A();
		A a2=new A(4646);
		System.out.println(a1.x);

		
	}
	

	public A() {
		System.out.println("c1");
	}
	public A(int z) {
		System.out.println("c2");
	}

}
