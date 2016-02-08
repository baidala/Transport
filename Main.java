/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transport;

import org.hibernate.Session;

/**
 *
 * @author Student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Route route = new Route();
        route.setNumber(25);
        route.setFromPoint("Khreschatik");
        route.setToPoint("Zulyany");
        route.setPrice(5);
        session.save(route);
        session.getTransaction().commit();
        HibernateUtil.shutdown();
        
        
        
    }
    
}
