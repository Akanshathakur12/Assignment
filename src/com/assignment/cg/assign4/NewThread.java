package com.assignment.cg.assign4;

public class NewThread implements Runnable{
	
	Thread t;
	String threadName;
	
	NewThread(String threadName){
		
		this.threadName = threadName;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println(threadName+" is running...");
		try {
			Thread.sleep(500);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println(threadName+" has been terminated");
	}
		
	
	public void go() {
		t = new Thread(this,threadName);
		t.start();
	}
	
	

}
