package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();

		// teste findById
		System.out.println("Teste: findByID");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		System.out.println();

		// teste FindByDepartment
		System.out.println("Teste: findByDepartment");
		Department dep = new Department(3, null);
		List<Seller> list = sellerDao.findByDepartment(dep);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println();

		// teste findAll
		System.out.println("Teste: findAll");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println();
		
		// teste insert
		System.out.println("Teste: insert");
		Seller newSeller = new Seller(null, "Amanda", "amanda@gmail.com", new Date(), 5000.0, dep);
		sellerDao.insert(newSeller);
		System.out.println("Inserido: novo Id = " + newSeller.getId());
		
		System.out.println();
		
		// teste update
		System.out.println("Teste: update");
		seller = sellerDao.findById(3);
		seller.setName("Gabriel");
		seller.setEmail("gabriel@gmail.com");
		sellerDao.update(seller);
		
	}
}
