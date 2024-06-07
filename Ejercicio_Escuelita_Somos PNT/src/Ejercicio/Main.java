package Ejercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		 List<Producto> productos = cargarProductos();

	        for (Producto producto : productos) {
	            System.out.println(producto.toString());
	        }

	        System.out.println("=============================");
  // llamar a los métodos Collections.max y Collections.min de la implementacion Comparable en producto
	        Producto productoMasCaro = Collections.max(productos);
	        Producto productoMasBarato = Collections.min(productos);

	        System.out.println("Producto más caro: " + productoMasCaro.nombre);
	        System.out.println("Producto más barato: " + productoMasBarato.nombre);
	    }
	
	
	
//carga de productos sin depender de la cantidad o tipo de productos.
	    private static List<Producto> cargarProductos() {
	        List<Producto> productos = new ArrayList<>();
	        productos.add(new Bebida("Coca-Cola Zero", 1.5, 20));
	        productos.add(new Bebida("Coca-Cola", 1.5, 18));
	        productos.add(new Shampoo("Shampoo Sedal", 500, 19));
	        productos.add(new Fruta("Frutillas", 64, "kilo"));
	        return productos;
	}

}
