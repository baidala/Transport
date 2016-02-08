/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transport;

import java.io.File;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 *
 * @author Student
 */
public class HibernateUtil {
    private static final SessionFactory sessionFactory = buildSessionFactory();
    
    private static SessionFactory buildSessionFactory() {
        try {       
        return new Configuration().configure(new File("hibernate.cfg.xml")).buildSessionFactory();
         } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
      }
    }
    
    
     public static SessionFactory getSessionFactory() {
      return sessionFactory;
    }
     
     
     public void shutdown() {
         getSessionFactory().close();
     } 
    
    
}
