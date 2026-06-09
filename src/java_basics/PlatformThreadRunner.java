package java_basics;

import java.util.concurrent.TimeUnit;

class SleepThread implements Runnable {

	@Override
	public void run() {
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

public class PlatformThreadRunner {

	public static void main(String[] args) {
		for (int i = 0; i < 1_00_000; i++) {
			System.out.println(i);
			// new Thread(new SleepThread()).start();
			// Thread.startVirtualThread(new SleepThread());
			Thread.ofVirtual().start(new SleepThread());
		}

	}

}
