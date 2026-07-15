package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	
	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		
		// teste inserir
		System.out.println("Inserir novo departamento:");
		Department newDepartment = new Department(null,"Food");
		departmentDao.insert(newDepartment);
	}

}
