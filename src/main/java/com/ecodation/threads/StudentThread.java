package com.ecodation.threads;

import lombok.extern.java.Log;

@Log
public class StudentThread extends Thread {
	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.print(i + " ");
				Thread.sleep(1 / 24 * 60 * 60);
			}
			System.out.println("bitti");
		} catch (InterruptedException e) {
			e.printStackTrace();
			log.warning("Thread hata meydana geldi");
		}
	}
}

// interface ile thread
@Log
class TeacherThread implements Runnable {
	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.print(i + " ");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
			log.warning("interface Thread hata meydana geldi");
		}
	}
}

// metotla çalışan thread
@Log
class ChieldThread {
	public void anonymousThread() {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					for (int i = 0; i < 10; i++) {
						System.out.print(i + " ");
						Thread.sleep(1000);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
					log.warning("Anonymous Thread hata meydana geldi");
				}
			}
		});
	}
}
