package Ejercicio;

class Bebida extends Producto {
    private double litros;

    public Bebida(String nombre, double litros, double precio) {
        super(nombre, precio);
        this.litros = litros;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " /// Litros: " + litros + " /// Precio: $" + precio;
    }
}

class Shampoo extends Producto {
    private int contenido;

    public Shampoo(String nombre, int contenido, double precio) {
        super(nombre, precio);
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " /// Contenido: " + contenido + "ml /// Precio: $" + precio;
    }
}