package com.trip.hack.persistence;

import java.util.List;

public interface IEntityDao<E> {

	void delete(E Entity);

	void save(E Entity);

	E update(E Entity);

	List<E> findAll();

	E findById(Long id);

}
