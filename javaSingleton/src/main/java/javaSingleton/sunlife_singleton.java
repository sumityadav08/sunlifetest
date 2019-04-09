package javaSingleton;

public class sunlife_singleton {

	private static sunlife_singleton instance;
	
	private sunlife_singleton() {
		
	}
	
	public static synchronized sunlife_singleton getInstance() {
		instance=new sunlife_singleton();
		return instance;
	}
	
	public void print_val(String thread_name) {
		System.out.println("Printing value for thread " + thread_name);
	}
}
