/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import Enums.Transaction_Type;
import com.entity.Account;
import com.entity.Customer;
import com.entity.Process;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Obinna
 */
public class Persist_class {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("BankAccountPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        Account account1 = new Account();
        Account account2 = new Account();
//        Account account3 = new Account();
        Customer customer = new Customer();
        Process transact = new Process();
        
        transact.setDate("22-04-2018");
        transact.setTime("10:00");
        transact.setTra(Transaction_Type.DEPOSIT);
        transact.setAccount(account1);
        
          transact.setDate("13-08-2022");
        transact.setTime("17:00");
        transact.setTra(Transaction_Type.WITHDRAW);
        transact.setAccount(account1);
        
        
        
        
        account1.setAccountnumber("2234");
        account1.setBalance("100,000");
        account1.setCustomer(customer);
        account1.getTransactio().add(transact);
       
        
         
        account2.setAccountnumber("6934");
        account2.setBalance("600,000");
        account2.setCustomer(customer);
        
        
         
//        account3.setAccountnumber("9904");
//        account3.setBalance("300,000");
//        account3.setCustomer(customer);
        
//        customer.setAccounts((List<Account>) account3);
             customer.getAccounts().add(account1);
             customer.getAccounts().add(account2);
             
             
             customer.setFirstName("John");
             customer.setLastName("Doe");
             customer.setPhoneNumber("08024579018");
             
             
             
             em.persist(transact);
             em.persist(customer);
             em.persist(account1);
             em.persist(account2);
//             em.persist(account3);
             
            trans.commit();
            
        
    }
    
}
