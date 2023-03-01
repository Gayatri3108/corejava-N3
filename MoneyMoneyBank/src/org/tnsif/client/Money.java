package org.tnsif.client;

import org.tnsif.application.MMBankFactory;
import org.tnsif.application.MMCurrentAcc;
import org.tnsif.application.MMSavingAcc;
import org.tnsif.framework.BankFactory;
import org.tnsif.framework.CurrentAcc;
import org.tnsif.framework.SavingAcc;

public class Money {

	public static void main(String[] args) {
		BankFactory b=new MMBankFactory();
		SavingAcc s=new MMSavingAcc(1234,"gayatri",45000f,true);
		CurrentAcc c=new MMCurrentAcc(1234,"gayu",45000f,500f);
		System.out.println("Saving account: ");
		System.out.println(s);
		
		System.out.println("\nCurrent account: ");
		System.out.println(c);
		c.withdraw(c.getAccBal());
		
		

	}

}
