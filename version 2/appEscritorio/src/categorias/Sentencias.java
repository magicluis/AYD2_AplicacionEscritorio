/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package categorias;

/**
 *
 * @author luismiguel
 */
public class Sentencias {
    
    
    public  static String LISTAR = "SELECT * FROM categoria ORDER BY id_categoria";
           
    public static String REGISTRAR = "INSERT INTO categoria(id_categoria,nombre,ruta) "
            + "VALUES(?,?,?)";

    public static String ACTUALIZAR = "UPDATE categoria SET "
            + "nombre=? ,"
            + "ruta=? "
            + "WHERE id_categoria=?";

    public static String ELIMINAR = "DELETE FROM categoria WHERE id_categoria = ?";
    
    
    private int idCategoria;
    private String nombre;
    private String ruta;

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

  
    
    
    
    
    
    
}