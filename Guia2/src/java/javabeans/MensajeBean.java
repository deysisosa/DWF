/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabeans;

/**
 *
 * @author usuario
 */
public class MensajeBean {
    
    private String remite;
    private String destino;
    private String texto;

    public MensajeBean(){ }     

    public MensajeBean(String remite, String destino, String texto) {                              
            this.remite = remite;
            this.destino = destino;
            this.texto = texto;
    }
    /**
     * @return the remite
     */
    public String getRemite() {
        return remite;
    }

    /**
     * @param remite the remite to set
     */
    public void setRemite(String remite) {
        this.remite = remite;
    }

    /**
     * @return the destino
     */
    public String getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * @return the texto
     */
    public String getTexto() {
        return texto;
    }

    /**
     * @param texto the texto to set
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }
    
}
