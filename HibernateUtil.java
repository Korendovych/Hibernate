/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ormnba;

/**
 *
 * @author koren
 */

import org.hibernate.*;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {
    private static final SessionFactory sessionFactory = buildSessionFactory();
    
    
    
    private static SessionFactory buildSessionFactory(){
       try{ 
       return new Configuration().configure().buildSessionFactory(
         new StandardServiceRegistryBuilder().configure().build());
       } catch (Throwable ex){
         System.err.println("Error al iniciar la SessionFactory"+ex);
         throw new ExceptionInInitializerError(ex);
       }
    }
    
    
    
    public static SessionFactory getSesionFactory(){
       return sessionFactory;
    }
}
