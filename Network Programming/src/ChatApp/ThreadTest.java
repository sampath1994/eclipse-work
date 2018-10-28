package ChatApp;

public class ThreadTest {

	public static void main(String[] args) {
		
		th1 thread1 = new th1();
		th2 thread2 = new th2();
		
		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);

		t1.start();
		t2.start();
	}

}

class th1 implements Runnable {
	
	public th1()
	{
		
	}
	
	public void run() {
	
		for(int i=0;i<1000;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}


class th2 implements Runnable {
	
	public th2()
	{
		
	}
	
	public void run() {
	
		for(int i=0;i<100000;i+=1000)
		{
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}