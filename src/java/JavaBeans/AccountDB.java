/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBeans;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class AccountDB {
    public static void insert(Account account) {
        DBUtil.createEmFactory();
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        
        trans.begin();
        
        try {
            em.persist(account);
            trans.commit();
        }
        catch (Exception e) {
            System.out.println(e);
            trans.rollback();
        }        
        finally {
            em.close();
        }
    } 
}
