
package detodosa;


public class Producto implements Comparable<Producto>{
    
    private final int codigo;
    private String descripcion;
    private double precio;
    private int stock;
    private Categoria rubro;

    public Producto(int codigo, String descripcion, double precio, int stock, Categoria rubro) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.rubro = rubro;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Categoria getRubro() {
        return rubro;
    }

    public void setRubro(Categoria rubro) {
        this.rubro = rubro;
    }
    
    @Override
    public int compareTo(Producto t) {
        if(codigo== t.codigo) {
            return 0;
        } else if (codigo> t.codigo) {
            return 1;
            
        } else{
            return -1;
        }       
    }   
    /* Posible simplificación:  
    @Override
    public int compareTo(Producto p) {      
          return Integer.compare(this.id, p.id);       
    }    
    */

    @Override
    public String toString() {
        
        return "ID: " +codigo+ ", " +descripcion+ ", " +precio+ ", stock:" +stock+ ", " +rubro;
    }
    
    
    
    
}
