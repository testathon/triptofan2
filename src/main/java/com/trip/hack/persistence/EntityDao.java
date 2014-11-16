package com.trip.hack.persistence;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Query;

public abstract class EntityDao<E> implements IEntityDao<E> {

	public EntityDao(Class<E> entityClass) {
        this.type = entityClass;
	}

	protected abstract EntityManager getEntityManager();

	protected Class<E> type;
	protected String entity;

	protected <R> R getSingleResultOrNull(final List<R> results) {
		if (results != null && results.size() > 1) {
			throw new NonUniqueResultException();
		}
		return results == null || results.size() == 0 ? null : results
				.iterator().next();
	}

	@Override
	public void delete(final E entity) {
		getEntityManager().remove(
				getEntityManager().contains(entity) ? entity
						: getEntityManager().merge(entity));
	}

	@Override
	public void save(final E entity) {
		getEntityManager().persist(entity);
	}

	@Override
	public E update(final E entity) {
		return getEntityManager().merge(entity);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<E> findAll() {
		Query query = getEntityManager().createQuery(
				"select a from " + getEntityName() + " a");

		return (List<E>) query.getResultList();
	}
	
	@Override
    public E findById(Long id) 
    {
        return (E) getEntityManager().find(type, id);
    }
	
    public String getEntityName() 
    {
        if (entity == null) {
            Entity entityAnn = (Entity) type.getAnnotation(Entity.class);
            
            if (entityAnn != null && !entityAnn.name().equals("")) 
            {
                entity = entityAnn.name();
            } else 
            {
                entity = type.getSimpleName();
            }
        }
        
        return entity;
    }
	
    public Class<E> getType() 
    {
        return type;
    }

    public void setType(Class<E> type) 
    {
        this.type = type;
    }

}
