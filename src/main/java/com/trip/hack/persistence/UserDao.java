package com.trip.hack.persistence;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.trip.hack.domain.User;

public class UserDao extends EntityDao<User>{
	
	@Inject
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UserDao() {
        super(User.class);
    }

}
