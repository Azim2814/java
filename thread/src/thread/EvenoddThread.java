package thread;

public class EvenoddThread extends Thread{
	@Override
	public void run() {
		for(int i=0;i<=20;i++) {
			if(i%2==0) {
			System.out.println("even"+i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		}
	}
}
