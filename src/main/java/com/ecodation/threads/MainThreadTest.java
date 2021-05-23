package com.ecodation.threads;

public class MainThreadTest {
	
	public static void main(String[] args) throws InterruptedException {
		// extends böyle çağırıyoruz.
		StudentThread studentThread = new StudentThread();
		StudentThread studentThread2 = new StudentThread();
		
		// interface çağırmak
		Thread thread = new Thread(new TeacherThread());
		
		System.out.println(studentThread.getName());
		System.out.println(studentThread2.getName());
		
		studentThread2.start();
		studentThread.start();
		
		System.out.println(studentThread.isAlive());
		
		// studentThread.destroy();
		studentThread.setName("1.Th");
		studentThread2.setName("2.Th");
		
		System.out.println(studentThread.getName());
		System.out.println(studentThread2.getName());
		
		// studentThread.destroy();
		System.out.println(studentThread.isAlive());
		studentThread.wait();
		studentThread.notify();
		System.out.println(studentThread.isAlive());
		
	}
	
}
