package com.example.jpabook2.dummies;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class DummyRepository {

    @PersistenceContext
    private EntityManager em;

    public void save(DummyTable dummyTable) {
        em.persist(dummyTable);
    }

    public DummyTable findOne(Long id){
        return em.find(DummyTable.class, id);
    }

}
