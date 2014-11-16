package com.trip.hack.persistence;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.trip.hack.domain.Location;

public class LocationDao extends EntityDao<Location>{
	
	@Inject
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LocationDao() {
        super(Location.class);
    }

}
