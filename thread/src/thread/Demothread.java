package thread;

public class Demothread {

	public static void main(String[] args) {
		Thread1 th = new Thread1();
		th.start();
		
		Thread2 th2 = new Thread2();
		Thread th1 = new Thread(th2);
		th1.start();
	}

}
