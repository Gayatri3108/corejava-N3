package org.tnsif.enumdemo;
//We can implement interface using enum
public enum EnumClassDemo implements InterfaceCardsDemo{
	HEART,CLUB,DIAMOND,SPADES;

	@Override
	public void print() {
		System.out.println("Selected Shape in the Cards are: "+this);
		
	}

}