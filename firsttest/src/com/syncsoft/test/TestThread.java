/**
 * 
 */
package com.syncsoft.test;

import java.util.concurrent.Semaphore;

/**
 * @author suyongsheng
 * @date 2020年6月26日 下午3:44:58
 */
public class TestThread {
	class ByTicketThread extends Thread {
	    private final Semaphore semaphore;
	    public ByTicketThread(String threadName, Semaphore semaphore) {
	        this.setName(threadName);
	        this.semaphore = semaphore;
	    }
	    @Override
	    public void run() {
	        try {
	            semaphore.acquire();
	            System.out.println(this.getName() + "正在买票。");
	            Thread.sleep(1000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        } finally {
	            semaphore.release();
	            System.out.println(this.getName() + "买票完成。");
	            try {
					sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        }
	 
	    }
	}
	public  void testSync1() {
	    Semaphore semaphore = new Semaphore(2);
        for (int i = 1; i <= 6; i++) {
            new ByTicketThread("客户" + i, semaphore).start();
        }
	}

	public static void main(String[] args) {
		TestThread testThread=new TestThread();
		testThread.testSync1();;
		// testSync2();
	}

	/**
	 * 
	 */
	private static void testSync2() {
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("thread1执行");
			}
		});
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					thread1.join();
					System.out.println("thread2执行");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		Thread thread3 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					thread2.join();
					System.out.println("thread3执行");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
