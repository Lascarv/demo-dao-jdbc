package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	
	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		//Department dep = new Department();
		
		// teste inserir
		System.out.println("Teste: inserir novo departamento");
		Department newDepartment = new Department(null,"Food");
	//	departmentDao.insert(newDepartment);
		
		System.out.println();
		
		// teste findById
		System.out.println("Teste: findById");
		Department dep = departmentDao.findById(2);
		System.out.println(dep);
		
		System.out.println();
		
		// teste update
		System.out.println("Teste: update");
		dep = departmentDao.findById(1);
		dep.setName("Eletronics");
		departmentDao.update(dep);
		
		// teste findAll
		System.out.println("Teste findAll");
		List<Department> list = departmentDao.findAll();
		for( Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("Teste delete");
		dep = departmentDao.findById(2);
		departmentDao.deleteById(dep);
	}

}
