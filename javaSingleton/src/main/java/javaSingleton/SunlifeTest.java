package javaSingleton;

class SunlifeTest_thread implements Runnable {
	private Thread suntest;
	String iName;
		
	SunlifeTest_thread(String name){
		this.iName =name;
	}
	
	public void run() {
	System.out.println("Running currently " + this.iName);	
	sunlife_singleton.getInstance().print_val(this.iName);
	}
	
	public void start() {
		suntest=new Thread (this,this.iName);
		suntest.start();
	}
	
}

public class SunlifeTest{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SunlifeTest_thread st1=new SunlifeTest_thread("First");
		SunlifeTest_thread st2=new SunlifeTest_thread("Second");
		st1.start();
		st2.start();
		
	}

}
