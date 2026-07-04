package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main (String[] args) {
		
		Department dep = new Department(2, "Eletronics");
		
		
		SellerDao sellerDao = DaoFactory.createSellerDao();		
		
		// testando insert
		Seller newSeller = new Seller(null, "anapaula", "ana@gmail.com", new Date(), 600.0, dep);
		sellerDao.insert(newSeller);
		System.out.println("Inserido! Novo id = " + newSeller.getId());
	}
}
