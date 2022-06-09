package com.GQT.Threads;

class Producer extends Thread {
	Queue a;
	public Producer(Queue q) {
		a=q;
	}
	public void run() {
		int i=0;
		while (true) {
			a.put(i++);
		}
	}
}
class Queue {
	int x;
	boolean value_in_x = false;
	synchronized void put(int i) {
		try {
			if (value_in_x==false) {
				x=i;
				System.out.println("The value in"+i+"has been put into x by the Producer");
				value_in_x=true;
				notify();
			}
			else {
				wait();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	synchronized void get() {
		try {
			if(value_in_x==true) {
				System.out.println("The value in"+x+"has been taken by the Consumer");
				value_in_x=false;
				notify();
			}
			else {
				wait();
			}
		}
			catch (Exception e) {
				e.printStackTrace();
			}
	  }
}
class Consumer extends Thread {
	Queue b;
	public Consumer(Queue q) {
		b=q;
	}
	public void run() {
		while(true) {
			b.get();
		}
	}
}

public class LaunchProducerConsumer {
	public static void main(String[] args) {
		Queue q = new Queue();
		Producer p = new Producer(q);
		Consumer c = new Consumer(q);
		
		p.start();
		c.start();
		
		
	}
}
