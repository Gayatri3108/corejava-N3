package org.tnsif.finalkeyword;

public class FinalMethodExcuter {

	public static void main(String[] args) {
		FinalMethodDemo f= new FinalMethodDemo();
		f.flavour="mixedfruit";
		f.print();
		f.setPrice(250);
	    f.print(f.getPrice());
	}
}
