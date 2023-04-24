/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Model.Ventas;
import java.util.List;

/**
 *
 * @author deysi
 */
public interface VentaDao {
    
    
    public List<Ventas> mostrarVentas();
    public void insertarVentas(Ventas ventas);
    public void modificarVentas(Ventas ventas);
    public void eliminarVentas(Ventas ventas);
    
}