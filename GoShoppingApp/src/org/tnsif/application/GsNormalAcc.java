package org.tnsif.application;

import org.tnsif.framework.NormalAcc;

public class GsNormalAcc extends NormalAcc{

	public GsNormalAcc(int accno, String accnm, float charges, float deliveryCharges) {
		super(accno, accnm, charges, deliveryCharges);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "GSNormalAcc [toString()=" + super.toString() + "]";
	}
}
	

	