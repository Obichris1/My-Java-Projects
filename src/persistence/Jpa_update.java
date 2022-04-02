/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import com.entity.Process;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Obinna
 */
public class Jpa_update {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("BankAccountPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
       // Account account = em.find(Account.class,3L);
        trans.begin();
        //account.setBalance("80000"); 
       // Customer customer =  em.find(Customer.class,2L);
       Process process = em.find(Process.class,101L);
//       em.remove(process);

        
       System.out.println(process.toString());
        
        
     //   em.remove(customer);
        
        trans.commit();
        
    }
    
}
