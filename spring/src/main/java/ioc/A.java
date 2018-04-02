package ioc;

public class A {

	private B b;
	
	public A(B b) {
		System.out.println("A(B)");
		this.b = b;
	}

	/**
	 * @param b the b to set
	 */
	public void setB(B b) {
		System.out.println("setB()");
		this.b = b;
	}

	public A(){
		System.out.println("A()");
	}
	
	public void executeA(){
		System.out.println("executeA()");
	}

}
