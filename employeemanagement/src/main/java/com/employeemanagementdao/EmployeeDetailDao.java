package com.employeemanagementdao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.employeemanagemententity.EmployeeDetail;
import com.util.HibernateUtil;
// creating a dao class
public class EmployeeDetailDao {
	
	//// creating EmployeeDetail method
	public EmployeeDetail getEmployeeDetail(int id) {

		Transaction transaction = null;
		EmployeeDetail employee = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// get an employee object
			employee = session.get(EmployeeDetail.class, id);
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return employee;
	}// end method

	// creating updateEmployeeDetail method 
	public void updateEmployeeDetail(EmployeeDetail employeeDetail) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the employee object
			session.update(employeeDetail);
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}// end method


	
	// creating saveEmployeeDetail method 
		public void saveEmployeeDetail(EmployeeDetail employeeDetail) {
			Transaction transaction = null;
			try (Session session = HibernateUtil.getSessionFactory().openSession()) {
				// start a transaction
				transaction = session.beginTransaction();
				// save the employee object
				session.save(employeeDetail);
				// commit transaction
				transaction.commit();
			} catch (Exception e) {
				if (transaction != null) {
					transaction.rollback();
				}
				e.printStackTrace();
			}
		}// end method

	//creating deleteEmployeeDetail method
	public void deleteEmployeeDetail(int id) {

		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();

			// Delete a instructor object
			EmployeeDetail employeedetail = session.get(EmployeeDetail.class, id);
			if (employeedetail != null) {
				session.delete(employeedetail);
				System.out.println("employee is deleted");
			}

			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}// end method

	//creating incrementEmployeeSalary method
	public double incrementEmployeeSalary(int id, double percent) {

		Transaction transaction = null;

		EmployeeDetail employee = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// get an employee object
			employee = session.get(EmployeeDetail.class, id);

			employee.setSalary(employee.getSalary() + (employee.getSalary() * percent / 100));

			session.update(employee);
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return employee.getSalary();
	}// end method

}// ending a dao class
