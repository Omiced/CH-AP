package org.generation.productos;

public class ProductoRun implements Runnable {
	// Atributos de instancia
	private String idPedido;
	private String nombreProducto;
	private double precio;
	
	// Constructor
	public ProductoRun(String idPedido, String nombreProducto, double precio) {
		this.idPedido = idPedido;
		this.nombreProducto = nombreProducto;
		this.precio = precio;
	}

	// Getters y Setters
	public String getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(String idPedido) {
		this.idPedido = idPedido;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	// toString
	@Override
	public String toString() {
		return "ProductoRun [idPedido=" + idPedido + ", nombreProducto=" + nombreProducto + ", precio=" + precio + "]";
	}

	// Sobreescribir el método run()
	@Override
	public void run() {
		System.out.println("Pedido con id: " + idPedido + ". Producto: " + nombreProducto + ". Precio: $" + precio);
	}
}
