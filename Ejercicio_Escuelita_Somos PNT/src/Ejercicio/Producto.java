package Ejercicio;


	 public abstract class Producto implements Comparable<Producto> {
		    protected String nombre;
		    protected double precio;

		    public Producto(String nombre, double precio) {
		        this.nombre = nombre;
		        this.precio = precio;
		    }

		    public double getPrecio() {
		        return precio;
		    }

		    @Override
		    public int compareTo(Producto otroProducto) {
		        return Double.compare(this.precio, otroProducto.getPrecio());
		    }

		    @Override
		    public abstract String toString();
		}
