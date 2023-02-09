package org.tnsif.finalkeyword;
//child class
public class FinalMethodDemo extends FinalMethod {
          private int price;
          // if any method is declared as parent class and we are going to use that inside the
          //child class we override but we can overload
         //void print() {
        	 
        // }
          final void print(int price) {
        	  System.out.print("the price is:"+price);
          }

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}
              
	}


