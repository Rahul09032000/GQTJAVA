package com.GQT.Threads;

class Star extends Thread {
	String res1 = "Weapon-1";
	String res2 = "Weapon-2";
	String res3 = "Weapon-3";
	public void run() {
		if (Thread.currentThread().getName().equals("Arjuna")) {
			arjunaAcquired();
		}
		else {
			karnaAcquired();
		}
	}
	public void arjunaAcquired() {
		try {
			synchronized (res1) {//acquired res-1
				System.out.println("Arjuna Acquired : "+res1);
				Thread.sleep(3000);
				synchronized (res2) {//acquired res-1
					System.out.println("Arjuna Acquired : "+res2);
					Thread.sleep(3000);
					synchronized (res3) {//acquired res-1
						System.out.println("Arjuna Acquired : "+res3);
						Thread.sleep(3000);
				}//released res-3
			}//released res-2
		}//released res-1
	}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	public void karnaAcquired() {
		try {
			synchronized (res3) {//acquired res-1
				System.out.println("Karna Acquired : "+res3);
				Thread.sleep(3000);
				synchronized (res2) {//acquired res-1
					System.out.println("Karna Acquired : "+res2);
					Thread.sleep(3000);
					synchronized (res1) {//acquired res-1
						System.out.println("Karna Acquired : "+res1);
						Thread.sleep(3000);
				}//released res-3
			}//released res-2
		}//released res-1
	}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
public class DeadLockState {
	public static void main(String[] args) {
		Star s1 = new Star();
		Star s2 = new Star();
		
		s1.setName("Arjuna");
		s2.setName("Karna");
		
		s1.start();
		s2.start();
	}
}
