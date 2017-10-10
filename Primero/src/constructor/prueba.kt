package constructor

fun main(args: Array<String>) {
	var pr = Producto(1,"Mouse")
	pr.imprimeDatos()
	
	var pr2 = Producto(2,"Teclado",89.6)
	pr2.imprimeDatos() 
}