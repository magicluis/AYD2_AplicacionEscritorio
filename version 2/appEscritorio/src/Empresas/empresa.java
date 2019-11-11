/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresas;

/**
 *
 * @author luismiguel
 */
public class empresa {
    
    private int idEmpresa;
    private int nit;
    private String nombre;
    private String direccion;
    private String telefono;
    private int zona;
    private double latitud;
    private double longitud;
    private int id_municipio;
    private String email;
    private String password;
    
    public empresa(int idEmpresa,String nombre){
        this.idEmpresa = idEmpresa;
        this.nombre = nombre;
    }

    public empresa(int idEmpresa, int nit, String nombre, String direccion, String telefono, int zona, double latitud, double longitud, int id_municipio, String email, String password) {
        this.idEmpresa = idEmpresa;
        this.nit = nit;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.zona = zona;
        this.latitud = latitud;
        this.longitud = longitud;
        this.id_municipio = id_municipio;
        this.email = email;
        this.password = password;
    }
    

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public int getId_municipio() {
        return id_municipio;
    }

    public void setId_municipio(int id_municipio) {
        this.id_municipio = id_municipio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    @Override
    public String toString(){
        return this.nombre;
    }
    
    
    
}