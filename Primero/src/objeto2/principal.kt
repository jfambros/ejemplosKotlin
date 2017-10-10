package objeto2

import objetos.Producto

fun main(args: Array<String>) {
	var producto = Producto(1,"Teclado")
	
	producto.imprimeDatos()
	
	println("Id Prod: "+producto.getIdProd())
	
	producto.setNombreProd("Teclado 101");
	producto.imprimeDatos();
	
}
