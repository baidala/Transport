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
              
        return new Configuration().configure(new File("src\\transport\\hibernate.cfg.xml")).buildSessionFactory();
         
    }
    
    
     public static SessionFactory getSessionFactory() {
      return sessionFactory;
    }
     
     
     public static void shutdown() {
         getSessionFactory().close();
     } 
    
    
}
