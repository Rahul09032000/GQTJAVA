package com.GQT.Threads;

class Hero extends Thread {
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
				}
			}
		}
	}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	public void karnaAcquired() {
		try {
			synchronized (res1) {//acquired res-1
				System.out.println("Karna Acquired : "+res1);
				Thread.sleep(3000);
				synchronized (res2) {//acquired res-1
					System.out.println("Karna Acquired : "+res2);
					Thread.sleep(3000);
					synchronized (res3) {//acquired res-1
						System.out.println("Karna Acquired : "+res3);
						Thread.sleep(3000);
				}
			}
		}
	}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
public class StatesOfThreads {
	public static void main(String[] args) {
		Hero h1 = new Hero();
		Hero h2 = new Hero();
		
		h1.setName("Arjuna");
		h2.setName("Karna");
		
		h1.start();
		h2.start();
	}
}
