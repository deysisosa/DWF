/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.LineasDeVenta;
import Persistencia.NewHibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author deysi
 */
public class LineaDaoImplement implements LineaDao {

    @Override
    public List<LineasDeVenta> mostrarLineas() {
        Session session = null;
        List<LineasDeVenta> lista = null;
        try{
            session = NewHibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("from lineas_de_venta");
            lista = (List<LineasDeVenta>) query.list();
        }
        catch(HibernateException e){
            System.out.println(e.getMessage());
        }
        finally{
            if(session != null){
                session.close();
            }
        }
        return lista;
    }

    @Override
    public void insertarLineas(LineasDeVenta lineas) {
        Session session = null;
        try{
            session = NewHibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(lineas);
            session.getTransaction().commit();
        }
        catch(HibernateException e){
            System.out.println(e.getMessage());
            session.getTransaction().rollback();
        }
        finally{
            if(session != null){
                session.close();
            }
        }
    }

    @Override
    public void modificarLineas(LineasDeVenta lineas) {
        Session session = null;
        try{
            session = NewHibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(lineas);
            session.getTransaction().commit();
        }
        catch(HibernateException e){
            System.out.println(e.getMessage());
            session.getTransaction().rollback();
        }
        finally{
            if(session != null){
                session.close();
            }
        }
    }

    @Override
    public void eliminarLineas(LineasDeVenta lineas) {
        Session session = null;
        try{
            session = NewHibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(lineas);
            session.getTransaction().commit();
        }
        catch(HibernateException e){
            System.out.println(e.getMessage());
            session.getTransaction().rollback();
        }
        finally{
            if(session != null){
                session.close();
            }
        }
    }
    
}
