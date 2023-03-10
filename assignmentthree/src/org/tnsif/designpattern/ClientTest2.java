package org.tnsif.designpattern;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClientTest2 {
		 
		public static void main(String[] args) {
			
			ExecutorService executorService = null;
			MyThread myThread = new MyThread();
			try {
				 executorService = Executors.newFixedThreadPool(5);
				 executorService.execute(myThread);
				 executorService.execute(myThread);
				 executorService.execute(myThread);
				 executorService.execute(myThread);
				 executorService.execute(myThread);
				 executorService.execute(myThread);
				 
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				if(executorService != null)
					executorService.shutdown();
			}
			
		}
	 
	}

