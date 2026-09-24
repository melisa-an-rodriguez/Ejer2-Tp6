package detodosa;

import java.util.ArrayList;
import java.util.TreeSet;

public class GestionDeProductos {

    TreeSet<Producto> setDeProductos;

    
    // AGREGACIÓN: GestionDeProductos ◇──────> Producto
    public GestionDeProductos() {
        this.setDeProductos = new TreeSet<>();
    }

    public TreeSet<Producto> getSetDeProductos() {
        return setDeProductos;
    }

    public void setSetDeProductos(TreeSet<Producto> setDeProductos) {
        this.setDeProductos = setDeProductos;          
    }

    @Override
    public String toString() {
        return "GestionDeProductos{" + "setDeProductos=" + setDeProductos + '}';
    }

    
    
    // ABM (Agregar, Borrar, Modificar)
    public boolean agregarProducto(Producto p){
        
        if (setDeProductos.add(p)) {    
            return true;
            
        } else {            
            return false;
        }
        
    } 
       
    public boolean borrarProducto(Producto p){
        
        return setDeProductos.remove(p); 
        
        /*
        Es lo mismo que hacer:
        
        if (setDeProductos.contains(p)) {
            setDeProductos.remove(p);
            return true;
        }

        return false;
        */
        
    }
    
    // Método para el botón Actualizar:
    public boolean modificarProducto(int codigo, String descripcion, double precio, int stock, Categoria rubro){
    
        Producto producto = buscarPorCodigo(codigo);
        
        if (producto == null) {
            
            System.out.println("Producto inexistente.");
            return false;
        }
        
        
        setDeProductos.remove(producto);
          
        producto.setDescripcion(descripcion);
        producto.setPrecio(precio);
        producto.setStock(stock);
        producto.setRubro(rubro);
        
        setDeProductos.add(producto);

        return true;
        
        // El TreeSet no se reordena automáticamente si se modifica un atributo
        // que participa en el ordenamiento mientras el objeto ya está almacenado.
        // Por este motivo, dejo al int codigo como un atributo fijo.
        
    }    
        
    
     // CONSULTAS
    
        public ArrayList<Producto> listarTodos() {

        ArrayList<Producto> productos = new ArrayList<>();

        for (Producto p : setDeProductos) {

            productos.add(p);
        }

        return productos;
    }
    
    public Producto buscarPorCodigo(int codigo) {

        for (Producto p : setDeProductos) {
            if (p.getCodigo() == codigo) {
                return p;
            }
        }

        return null;
    }
    
    
     public ArrayList<Producto> buscarPorNombre(String descripcion){
        
        ArrayList<Producto> productosEncontrados = new ArrayList<>();

        for (Producto p : setDeProductos) {
            
            if (p.getDescripcion().trim().equalsIgnoreCase(descripcion.trim())) {
                
                productosEncontrados.add(p);
            }
        }

        return productosEncontrados;

    }
    
    
    public ArrayList<Producto> buscarPorPrecio(double min, double max) {

        ArrayList<Producto> productosEncontrados = new ArrayList<>();

        for (Producto p : setDeProductos) {
            
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                
                productosEncontrados.add(p);
            }
        }

        return productosEncontrados;
    }
    
    
    public ArrayList<Producto> buscarPorRubro(Categoria cat) {

        ArrayList<Producto> productosEncontrados = new ArrayList<>();

        for (Producto p : setDeProductos) {
            
            if (p.getRubro() == cat) {
                
                productosEncontrados.add(p);
            }
        }

        return productosEncontrados;
    }
       
    
}
