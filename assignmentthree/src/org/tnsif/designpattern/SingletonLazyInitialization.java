package org.tnsif.designpattern;

public class SingletonLazyInitialization {
		private static SingletonLazyInitialization INSTANCE=null;
	     private SingletonLazyInitialization() {
	    	 
	     }
	 
		/**
		 * This method has global access to return
		 * Single instance within JVM
		 * @return Singleton Instance
		 */
		public static SingletonLazyInitialization getInstance() {
			//If Instance is null then only instantiate
			if (INSTANCE == null) {
				INSTANCE = new SingletonLazyInitialization();
			}
			return INSTANCE;
	 
		}
		}
