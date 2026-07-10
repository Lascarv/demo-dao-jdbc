package application;

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
		Department dep = new Department(2, null);
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
	}
}
