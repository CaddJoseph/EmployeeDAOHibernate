package edu.madisoncollege.enterprisejava.persistence;

import edu.madisoncollege.enterprisejava.entity.Employee;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Joseph Cadd
 * @version 1.0 10/20/15.
 */
public class EmployeeDao {

    public List getAllEmployees() {
        List<Employee> employees = new ArrayList<>();

        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Employee.class);
        try {
            employees = criteria.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return employees;
    }


    /*
    public Employee getEmployee(int employeeId) throws SQLException {
        Connection connection = Database.getInstance().getConnection();

        String sql = "select * from employees where emp_id='" + employeeId + "'";

        Statement selectStatement = connection.createStatement();
        ResultSet results = selectStatement.executeQuery(sql);
        Employee employee = null;

        while (results.next()) {
            employee = createEmployeeFromResults(results);
        }

        selectStatement.close();

        return employee;

    }

    public void updateEmployee(Employee employee)throws SQLException {
        Connection connection = Database.getInstance().getConnection();
        PreparedStatement ps = null;

        String sql = "UPDATE employees set first_name = ?, last_name = ?, "
                + " ssn = ?, dept = ?, room = ?, phone = ? "
                + " Where emp_id = ? ";
        System.out.println(sql);

        connection.setAutoCommit(false);
        ps = connection.prepareStatement(sql);

        ps.setString(1, employee.getFirstName());
        ps.setString(2, employee.getLastName());
        ps.setString(3, employee.getSocialSecurityNumber());
        ps.setString(4, employee.getDepartment());
        ps.setString(5, employee.getRoom());
        ps.setString(6, employee.getPhone());
        ps.setInt(7, employee.getEmployeeId());

        ps.executeUpdate();
        connection.commit();
        ps.close();

    }


    public void insertEmployee(Employee employee)throws SQLException {
        Connection connection = Database.getInstance().getConnection();
        PreparedStatement ps = null;

        String sql = "INSERT INTO employees (first_name, last_name, ssn, dept) "
                    + "VALUES (?, ?, ?, ?)";

        connection.setAutoCommit(false);
        ps = connection.prepareStatement(sql);

        ps.setString(1, employee.getFirstName());
        ps.setString(2, employee.getLastName());
        ps.setString(3, employee.getSocialSecurityNumber());
        ps.setString(4, employee.getDepartment());
        ps.execute();
        connection.commit();
        ps.close();
    }


    public void deleteEmployeeById(int id) throws SQLException {
        Connection connection = Database.getInstance().getConnection();

        PreparedStatement ps = null;

        String deleteString = "DELETE FROM employees WHERE emp_id = ?";

        connection.setAutoCommit(false);
        ps = connection.prepareStatement(deleteString);

        ps.setInt(1, id);

        ps.executeUpdate();
        connection.commit();
        ps.close();
    }

    private Employee createEmployeeFromResults(ResultSet results) throws SQLException {
        Employee employee;
        int employeeId = results.getInt("emp_id");
        String firstName = results.getString("first_name");
        String lastName = results.getString("last_name");
        String socialSecurityNumber = results.getString("ssn");
        String department = results.getString("dept");
        String room = results.getString("room");
        String phone = results.getString("phone");

        employee = new Employee(employeeId, firstName, lastName, socialSecurityNumber, department, room, phone);
        return employee;
    }
    */
}
