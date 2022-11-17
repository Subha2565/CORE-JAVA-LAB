package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.Flightdetail;
import com.utill.HibernateUtil;


public class FlightDetailDao {
    public void saveFlightdetail( Flightdetail  Flightdetail) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            
            session.save(Flightdetail);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

 

    public void updateFlightdetail(Flightdetail Flightdetail) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            
            session.update(Flightdetail);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

 

    public Flightdetail getFlightdetail(int id) {

 

        Transaction transaction = null;
        Flightdetail Flight = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // get an Flight object
            Flight = session.get(Flightdetail.class, id);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return Flight;
    }
}