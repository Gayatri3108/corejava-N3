package org.tnsif.designpattern;

public class ThreadSafe {
		 
		private static ThreadSafe INSTANCE = null;
	 
		private ThreadSafe() {
	 
		}
	 
		public static ThreadSafe getInstance() {
			if (INSTANCE == null) {
				synchronized (Singleton.class) {
					if (INSTANCE == null) {
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						INSTANCE = new ThreadSafe();
					}
				
				}
			}
			return INSTANCE;
	 
		}
	}

