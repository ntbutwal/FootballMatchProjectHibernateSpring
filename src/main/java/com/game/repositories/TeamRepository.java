package com.game.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.game.entities.TeamEntity;

@Repository
@Transactional
public class TeamRepository {

	private EntityManager entityManager;

	public void save(TeamEntity entity) {
		entityManager.persist(entity);

	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}
