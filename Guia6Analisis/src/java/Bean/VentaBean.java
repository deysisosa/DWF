/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import DAO.VentaDao;
import DAO.VentaDaoImplement;
import Model.Ventas;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.faces.bean.ManagedBean;;

/**
 *
 * @author deysi
 */
@ManagedBean
@ViewScoped
public class VentaBean {

    private Ventas venta;
    private List<Ventas> Ventas;

    public VentaBean() {
        venta = new Ventas();
    }
    
    public void insertar(){
        
        VentaDao linkDao = new VentaDaoImplement();
        linkDao.insertarVentas(getVenta());
        setVenta(new Ventas());   
    }
    
        public void modificar(){
        
        VentaDao linkDao = new VentaDaoImplement();
        linkDao.modificarVentas(getVenta());
        setVenta(new Ventas());   
    }
    
        public void eliminar(){
        
        VentaDao linkDao = new VentaDaoImplement();
        linkDao.eliminarVentas(getVenta());
        setVenta(new Ventas());   
    }
    

    /**
     * @return the venta
     */
    public Ventas getVenta() {
        VentaDao linkDao = new VentaDaoImplement();
        setVentas(linkDao.mostrarVentas());
        return venta;
    }

    /**
     * @param venta the venta to set
     */
    public void setVenta(Ventas venta) {
        this.venta = venta;
    }

    /**
     * @return the Ventas
     */
    public List<Ventas> getVentas() {
        return Ventas;
    }

    /**
     * @param Ventas the Ventas to set
     */
    public void setVentas(List<Ventas> Ventas) {
        this.Ventas = Ventas;
    }
    
 
}
