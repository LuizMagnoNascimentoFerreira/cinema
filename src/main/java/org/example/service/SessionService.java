package org.example.service;

import org.example.model.entity.Session;
import org.example.repository.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;

@Service
public class SessionService {
    @Autowired
    EntityManagerFactory entityManagerFactory;
    @Autowired
    private SessionRepository sessionRepository;
    @Transactional
    public Session save(Session session){
        return sessionRepository.save(session);
    }
    public void delete(Session session){
        sessionRepository.delete(session);
    }
    @Transactional
    public List<Session> sessionJoin(){
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createQuery("SELECT m.title,r.id,s.dubbedOrSubtitled, s.dimension, s.dateTime FROM Session s INNER JOIN Movie m ON s.movie = m INNER JOIN Room r ON s.room = r");
        return (List<Session>)query.getResultList();
    }
}
