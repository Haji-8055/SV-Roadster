package com.xworkz.orm.repository;

import com.xworkz.orm.entity.TraineeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.Collections;
import java.util.List;

@Repository
public class TraineeRepositoryImpl implements TraineeRepository {

    @Autowired
    EntityManagerFactory entityManagerFactory;

    @Override
    public boolean saveTrainee(TraineeEntity traineeEntity) {

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.persist(traineeEntity);
            transaction.commit();

        } catch (Exception e) {
            return false;
        } finally {

            entityManager.close();

        }
        return true;
    }

    @Override
    public List<TraineeEntity> readTrainees() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            Query query = entityManager.createNamedQuery("findAll");
            List<TraineeEntity> resultList = query.getResultList();
            return resultList;
        } catch (Exception e) {
            return Collections.emptyList();
        } finally {
            entityManager.close();
        }


    }

    @Override
    public TraineeEntity findTraineeByName(String traineeName) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            Query query = entityManager.createNamedQuery("findTraineeByName");
            query.setParameter("var", traineeName);
            Object object = query.getSingleResult();
            TraineeEntity traineeEntity = (TraineeEntity) object;
            return traineeEntity;
        } catch (Exception e) {
            System.err.println("got some error while fetching trainee dto");
            return null;
        } finally {
            entityManager.close();
        }


    }

    @Override
    public String updateTrainee(TraineeEntity traineeEntity) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.merge(traineeEntity);
            transaction.commit();
        } catch (Exception e) {
            System.out.println("got error......");

        } finally {
            entityManager.close();
        }
        return "";
    }

    @Override
    public boolean deleteTrainee(String traineeName) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {

            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            Query query = entityManager.createNamedQuery("deleteTraineeByName");
            query.setParameter("name", traineeName);
            query.executeUpdate();
            transaction.commit();
        } catch (IllegalArgumentException e) {
            System.out.println("getting some errors : " + e.getStackTrace());

        } finally {
            entityManager.close();
        }
        return true;
    }
}
