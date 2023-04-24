/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Model.LineasDeVenta;
import java.util.List;

/**
 *
 * @author deysi
 */
public interface LineaDao {
    
    
    public List<LineasDeVenta> mostrarLineas();
    public void insertarLineas(LineasDeVenta lineas);
    public void modificarLineas(LineasDeVenta lineas);
    public void eliminarLineas(LineasDeVenta lineas);
    
}
