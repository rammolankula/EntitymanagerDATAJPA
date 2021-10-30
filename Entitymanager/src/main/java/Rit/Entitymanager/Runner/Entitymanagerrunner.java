package Rit.Entitymanager.Runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import Rit.Entitymanager.domain.Manager;
//@Component
public class Entitymanagerrunner implements CommandLineRunner {
	
	/*Here iam creating entitymanagerFactory for creating entity manager*/
	@Autowired
	EntityManagerFactory emf;
	
	@Override
	public void run(String... args) throws Exception {
		
		/*spring DataJPA can support the backward technologies compatiability
		 * it is supporting new hibernate with datajpa f/w 5.x from spring boot 2.x 
		 * By using the concept of Entitymanager (or) EntitymanagerFACTORY  WE CAN PURE DATA JPA CODE
		 * SPRING DATA JPA=HIBERNATE RUNTIME+JPA(API)+PROXY DESIGN+ CUSTOM QUERIES
		 * DATA JPA SUPPORTS LESS LINES OF CODE AND BETTER PERFORMENCE*/
		
		/*creating and implementation of Entitymanager and setting the data saving deleting and savinng the data*/
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		
		
	    Manager m1=new Manager(1,"Ram",9.0);
	    Manager m2=new Manager(1,"Ram",9.0);
	    
	    em.persist(m1);
	    em.persist(m2); //two different data
		
	    Manager m3=em.find(Manager.class,9.0);
	    System.out.println(m3);
	    
	    m1.setManageId(13);
	    
	    em.merge(m1);
	    
	    em.remove(m2);

	     ((EntityTransaction) em).commit();// here commit is saving the changes 
	    
	}

}
