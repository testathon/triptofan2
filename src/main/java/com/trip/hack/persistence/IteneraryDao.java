package com.trip.hack.persistence;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.trip.hack.domain.Itenerary;

public class IteneraryDao extends EntityDao<Itenerary>{
	
	@Inject
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public IteneraryDao() {
        super(Itenerary.class);
    }

}
