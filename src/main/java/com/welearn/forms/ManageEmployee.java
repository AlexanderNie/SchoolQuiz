/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.welearn.forms;

import com.welearn.domain.entities.Admins;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Alexander
 */
public class ManageEmployee {
    private static SessionFactory factory; 
    
     public static void main(String[] args) {
      
      try {
         factory = new Configuration().configure().buildSessionFactory();
      } catch (Throwable ex) { 
         System.err.println("Failed to create sessionFactory object." + ex);
         throw new ExceptionInInitializerError(ex); 
      }
      
      ManageEmployee ME = new ManageEmployee();

      /* Add few employee records in database */
      ME.listEmployees();

   }
     
     /* Method to CREATE an employee in the database */
   public Integer addEmployee(String username, String password, Date lastLogin){
      Session session = factory.openSession();
      Transaction tx = null;
      Integer employeeID = null;
      
      try {
         tx = session.beginTransaction();
         Admins employee = new Admins(username, password, lastLogin);
         employeeID = (Integer) session.save(employee); 
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
      return employeeID;
   }
   
   /* Method to  READ all the employees */
   public void listEmployees( ){
      Session session = factory.openSession();
      Transaction tx = null;
      
      try {
         tx = session.beginTransaction();
         List employees = session.createQuery("FROM Admins").list(); 
         for (Iterator iterator = employees.iterator(); iterator.hasNext();){
            Admins employee = (Admins) iterator.next(); 
            System.out.print("Username: " + employee.getUsername()); 
            System.out.print("  Password: " + employee.getPassword()); 
            System.out.println();
         }
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
   }
}
