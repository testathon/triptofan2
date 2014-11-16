package com.trip.hack.persistence.test;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

import junit.framework.Assert;

import org.junit.Test;

import com.trip.hack.domain.Event;

public class EventDaoTest {

	private EntityManager em;
    private EntityManagerFactory emf;
    
    @PersistenceUnit(unitName = "GREG")
    public void setEmf(EntityManagerFactory emf) {
          this.emf = emf;
          this.em = emf.createEntityManager();
    }

	@Test
	public void testAutoIncrement() {
		setEmf(emf);
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();

		Event object0 = new Event();
		Event object1 = new Event();

		// IDs start as null
		Assert.assertEquals((Long) null, object0.getId());
		Assert.assertEquals((Long) null, object1.getId());

		em.persist(object0);
		em.persist(object1);

		transaction.commit();

		System.out.println("Object 0");
		System.out.println("Generated ID is: " + object0.getId());
		System.out.println("Generated Version is: " + object0.getId());

		System.out.println("Object 1");
		System.out.println("Generated ID is: " + object1.getId());
		System.out.println("Generated Version is: " + object1.getId());

		Assert.assertEquals((Long) 1l, object0.getId());
		Assert.assertEquals((Long) 2l, object1.getId());
	}

}
