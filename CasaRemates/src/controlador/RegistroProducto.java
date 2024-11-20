package controlador;

import bd.Conexion;
import modelo.Producto;
import java.sql.*;
import java.util.ArrayList;

public class RegistroProducto 
{
    public boolean validarCodigo(String codigo)
    {
        try 
        {
            Connection conexion = Conexion.getConexion();

            String query = "SELECT CODIGO FROM PRODUCTO WHERE CODIGO=?";

            PreparedStatement sel = conexion.prepareStatement(query);
            
            sel.setString(1, codigo);
            
            if (sel.executeUpdate()>0)
                return true;
        } 
        catch (Exception e) 
        {
            System.out.println("Ya existe ese codigo registrado: "+e.getMessage());
        }
        return false;
    }
    
    public boolean agregarProducto(Producto producto)
    {
        try 
        {
            if (!validarCodigo(producto.getCodigo()))
                    return false;
            
            Connection conexion = Conexion.getConexion();
            
            // Todos los elemetos
            String query = "INSERT INTO PRODUCTO"
                    + "(codigo, nombreProducto, descripcionProducto, valorUnitario, oferta, stock, descontinuado)"
                    + "VALUES(?, ?, ?, ?, ?, ?, ?)";
            
            PreparedStatement ins = conexion.prepareStatement(query);
            
            ins.setString(1, producto.getCodigo());
            ins.setString(2, producto.getNombreProducto());
            ins.setString(3, producto.getDescripcionProducto());
            ins.setInt(4, producto.getValorUnitario());
            ins.setBoolean(5, producto.isOferta());
            ins.setInt(6, producto.getStock());
            ins.setBoolean(7, producto.isDescontinuado());
            

            if (ins.executeUpdate()>0)
                return true;
        } 
        catch (Exception e) 
        {
            System.out.println("Error al agregar el producto: "+e.getMessage());
        }
        
        return false;
    }
    
    public ArrayList<Producto> buscarPorTipoProducto(String nombre)
    {
        ArrayList<Producto> lista = new ArrayList<>();
        
        try 
        {
            Connection conexion = Conexion.getConexion();

            String query = "SELECT * FROM PRODUCTO WHERE nombreProducto=?";

            PreparedStatement sel = conexion.prepareStatement(query);
            
            sel.setString(1, nombre);
            
            ResultSet rs = sel.executeQuery();
            
            while(rs.next())
            {
                Producto prod = new Producto();
                
                prod.setCodigo(rs.getString("codigo"));
                prod.setNombreProducto(rs.getString("nombreProducto"));
                prod.setDescripcionProducto(rs.getString("descripcionProducto"));
                prod.setValorUnitario(rs.getInt("valorUnitario"));
                prod.setOferta(rs.getBoolean("oferta"));
                prod.setStock(rs.getInt("stock"));
                prod.setDescontinuado(rs.getBoolean("descontinuado"));
                
                lista.add(prod);
            }
        } 
        catch (Exception e) 
        {
            System.out.println("Error al buscar por tipo: "+e.getMessage());
        }
        return lista;
    }
}
