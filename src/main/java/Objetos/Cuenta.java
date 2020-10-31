/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author james
 */
public class Cuenta {
    private String codigo;
    private String codCliente;
    private String creada;
    private double credito;

    /**
     * Constructor de Cuenta
     * @param codigo
     * @param codCliente
     * @param creada
     * @param credito 
     */
    public Cuenta(String codigo, String codCliente, String creada, double credito) {
        this.codigo = codigo;
        this.codCliente = codCliente;
        this.creada = creada;
        this.credito = credito;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }

    public String getCreada() {
        return creada;
    }

    public void setCreada(String creada) {
        this.creada = creada;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
    
    
    
}
