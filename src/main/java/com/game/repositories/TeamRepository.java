package com.game.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.game.dto.TeamDto;
import com.game.entities.TeamEntity;

@Repository
@Transactional
public class TeamRepository {

	private EntityManager entityManager;

	public void save(TeamEntity entity) {
		entityManager.persist(entity);

	}

	public TeamEntity senddata(TeamEntity tentity) {
		return entityManager.merge(tentity);
	}

	public TeamEntity getbyId(Integer id) {
		return entityManager.find(TeamEntity.class, id);
	}

	public List<TeamEntity> getAllTeam() {
		Query query = entityManager.createQuery("from TeamEntity");
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
