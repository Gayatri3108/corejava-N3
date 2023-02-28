package org.tnsif.client;
import org.tnsif.application.GsNormalAcc;
import org.tnsif.application.GSPrimeAcc;
import org.tnsif.application.GSShopFactory;
import org.tnsif.framework.ShopFactory;

public class Client {

	public static void main(String[] args) {
		ShopFactory f=new GSShopFactory();
		GSPrimeAcc p=new GSPrimeAcc(1234,"gayatri",1050f,true);
		GsNormalAcc n=new GsNormalAcc(1134,"gayu",1050f,60f);
		
		//prime Account
		System.out.println("Prime Acc");
		System.out.println(p);
		p.bookProduct(p.getCharges());
		
		//Normal Account
		System.out.println("Normal Acc");
		System.out.println(n);
		n.bookProduct(n.getCharges());

	}

}