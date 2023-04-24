/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import DAO.LineaDao;
import DAO.LineaDaoImplement;
import Model.LineasDeVenta;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author deysi
 */
@ManagedBean
@ViewScoped
public class LineaBean {
            
    LineasDeVenta lineas;
    List<LineasDeVenta> lista;

    public LineaBean() {
        lineas = new LineasDeVenta();
    }
    
    public void insertar(){
        
        LineaDao linkDao = new LineaDaoImplement();
        linkDao.insertarLineas(getLineas());
        setLineas(new LineasDeVenta());   
    }
    
        public void modificar(){
        
        LineaDao linkDao = new LineaDaoImplement();
        linkDao.modificarLineas(getLineas());
        setLineas(new LineasDeVenta());   
    }
    
        public void eliminar(){
        
        LineaDao linkDao = new LineaDaoImplement();
        linkDao.eliminarLineas(getLineas());
        setLineas(new LineasDeVenta());   
    }
    
    
        

    /**
     * @return the lista
     */
    public List<LineasDeVenta> getLista() {
        LineaDao linkDao = new LineaDaoImplement();
        setLista(linkDao.mostrarLineas());
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(List<LineasDeVenta> lista) {
        this.lista = lista;
    }

    /**
     * @return the lineas
     */
    public LineasDeVenta getLineas() {
        return lineas;
    }

    /**
     * @param lineas the lineas to set
     */
    public void setLineas(LineasDeVenta lineas) {
        this.lineas = lineas;
    }
 
}
