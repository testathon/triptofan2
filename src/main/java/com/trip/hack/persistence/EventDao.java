package com.trip.hack.persistence;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.trip.hack.domain.Event;

public class EventDao extends EntityDao<Event>{
	
	@Inject
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EventDao() {
        super(Event.class);
    }

}
