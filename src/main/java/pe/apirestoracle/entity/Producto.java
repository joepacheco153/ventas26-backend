package pe.apirestoracle.entity;

public class Producto {
	private int idproducto;
	private String nomprod;
	private int precio;
	private int stock;
	public Producto() {
	}
	public Producto(int idproducto, String nomprod, int precio, int stock) {
		
		this.idproducto = idproducto;
		this.nomprod = nomprod;
		this.precio = precio;
		this.stock = stock;
	}
	public int getIdproducto() {
		return idproducto;
	}
	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}
	public String getNomprod() {
		return nomprod;
	}
	public void setNomprod(String nomprod) {
		this.nomprod = nomprod;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	

}
