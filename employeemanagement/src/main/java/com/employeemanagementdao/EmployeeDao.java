package com.employeemanagementdao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.employeemanagemententity.Employee;
import com.util.HibernateUtil;
// creating a dao class
public class EmployeeDao {

	/**
	 * Save Employeee
	 * 
	 * @param employee
	 */
	// creating a saveEmployee method
	public void saveEmployee(Employee employee) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the employee object
			session.save(employee);
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}// ending method

	/**
	 * Update Employee
	 * 
	 * @param instructor
	 */
	// creating a updateEmployee method
	public void updateEmployee(Employee employee) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the employee object
			session.update(employee);
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}// ending method

	/**
	 * Delete Employee
	 * 
	 * @param id
	 */
	// creating a deleteEmployee method
	public void deleteEmployee(int id) {

		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();

			// Delete a employeee object
			Employee employee = session.get(Employee.class, id);
			if (employee != null) {
				session.delete(employee);
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
	}// ending method

	/**
	 * Get Employee By ID
	 * 
	 * @param id
	 * @return
	 */
	public Employee getEmployee(int id) {

		Transaction transaction = null;
		Employee employee = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// get an employee object
			employee = session.get(Employee.class, id);
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return employee;
	}

	/**
	 * Get all Employee
	 * 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<Employee> getAllEmployee() {

		Transaction transaction = null;
		List<Employee> listOfEmployee = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// get an employee object

			listOfEmployee = session.createQuery("from Employeee").getResultList();

			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return listOfEmployee;
	}
}// ending class
