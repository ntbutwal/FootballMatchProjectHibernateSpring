package com.game.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.game.entities.MatcheEntity;

@Repository
@Transactional
public class MatchRepository {
	private EntityManager entityManager;

	public MatcheEntity saveMatches(MatcheEntity match) {
		return entityManager.merge(match);
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}
