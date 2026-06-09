package java_basics.threadsAndConcurrency.multithreading.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterUsingLock {
	private int i;
	private int j;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getJ() {
		return j;
	}

	Lock lockForI = new ReentrantLock();
	Lock lockForJ = new ReentrantLock();

	public void incrementI() {
		lockForI.lock();
		i++;
		lockForI.unlock();
	}

	public void incrementJ() {
		lockForJ.lock();
		j++;
		lockForJ.unlock();
	}

}
