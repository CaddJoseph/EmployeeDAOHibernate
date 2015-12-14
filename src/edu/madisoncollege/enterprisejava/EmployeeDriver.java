package edu.madisoncollege.enterprisejava;

import edu.madisoncollege.enterprisejava.entity.Employee;
import edu.madisoncollege.enterprisejava.persistence.EmployeeDao;

import java.sql.SQLException;

/**
 * @author paulawaite
 * @version 1.0 10/20/15.
 */
public class EmployeeDriver {
    /** The main method is used to run the various
     *   Dao methods.
     *
     * @param args args
     */
    public static void main(String[] args) {
        EmployeeDao dao = new EmployeeDao();

        System.out.println(dao.getAllEmployees());
        /*
        System.out.println(dao.getEmployee(108));

        System.out.println();
        System.out.println("Before the delete");

        dao.deleteEmployeeById(116);
        System.out.println(dao.getAllEmployees());

        Employee insertEmployee = new Employee(106,"First","last","395","324","testRoom","testPhone");
        dao.insertEmployee(insertEmployee);

        System.out.println();
        System.out.println("After the insert");
        System.out.println(dao.getAllEmployees());

        Employee updateEmployee = new Employee(106,"First","last","395","324","testRoom","testPhone");
        dao.updateEmployee(updateEmployee);
        System.out.println();
        System.out.println("After the update");
        System.out.println(dao.getAllEmployees());
        */
    }

}
