package com.trip.hack.persistence;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.trip.hack.domain.Tag;

public class TagDao extends EntityDao<Tag>{
	
	@Inject
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TagDao() {
        super(Tag.class);
    }

}
