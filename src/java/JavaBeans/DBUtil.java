/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBeans;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author andriy
 */
public class DBUtil {
    private static EntityManagerFactory emf;
    
    public static void createEmFactory() {
        try {
            if (emf == null) {
                emf = Persistence.createEntityManagerFactory("TOBAPU");
            }            
        }
        catch (Exception e) {
            System.out.println(e);
        }        
    }
    
    public static EntityManagerFactory getEmFactory() {
        return emf;
    }
}
