package singleton;

public class TesteSingleton {

	public static void main(String[] args) {
		Monitor m1 = Monitor.getInstance();
		Monitor m2 = Monitor.getInstance();
		
		System.out.println(m1);
		System.out.println(m2);
	}
	
}
