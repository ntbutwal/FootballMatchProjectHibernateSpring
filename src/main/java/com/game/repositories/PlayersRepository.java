package com.game.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.game.entities.PlayersEntity;

@Repository
@Transactional
public class PlayersRepository {
	private EntityManager entityManager;

	public PlayersEntity save(PlayersEntity playersEntity) {
		return entityManager.merge(playersEntity);

	}
	
	public List<PlayersEntity> getAllPlayer(){
		Query query= entityManager.createQuery("From PlayersEntity");
		return query.getResultList();
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	

}
