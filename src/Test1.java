public class Test1 {

	public static void main(String[] args) {
		SampleThread1 s1 = new SampleThread1();
		SampleThread1 s2 = new SampleThread1();
		SampleThread1 s3 = new SampleThread1();
		Thread t1 = new Thread(s1);
		t1.setName("T1");
		t1.setPriority(1);
		Thread t2 = new Thread(s2);
		t2.setName("T2");
		t2.setPriority(2);
		Thread t3 = new Thread(s3);
		t3.setName("T3");
		t3.setPriority(3);
		try {
		t1.start();
		t1.yield();
		t2.start();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}


class SampleThread1 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+"-"+ i);
		}
	}
}