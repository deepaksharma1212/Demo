public class Censhare {

	public static void main(String[] args) {
		SampleThread s1 = new SampleThread();
		SampleThread s2 = new SampleThread();
		SampleThread s3 = new SampleThread();
		Thread t1 = new Thread(s1);
		t1.setName("T1");
		Thread t2 = new Thread(s2);
		t2.setName("T2");
		Thread t3 = new Thread(s3);
		t3.setName("T3");
		t1.start();
		t2.start();
		t3.start();
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}


class SampleThread extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+"-"+ i);
		}
	}
}