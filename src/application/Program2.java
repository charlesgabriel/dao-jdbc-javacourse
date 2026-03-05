package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DepartmentDao depDao = DaoFactory.createDepartmentDao();

		System.out.println("= = = = = TEST 1: Department -> findById = = = = =");
		Department dep = depDao.findById(1);
		System.out.println(dep);

		System.out.println("\n= = = = = TEST 2: Department -> findAll = = = = =");
		List<Department> list = depDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}

		System.out.println("\n= = = = = TEST 3: Department -> insert = = = = =");
		Department newDep = new Department(null, "Music");
		depDao.insert(newDep);
		System.out.println("Inserted! New id: " + newDep.getId());

		sc.close();
	}
}
