package constructor

class Producto(private val idProd:Int, private var nombreProd:String, private var precioProd:Double) {
	
	constructor(idProd:Int, nombreProd:String):this(idProd,nombreProd,0.0){
		
	}
	
	fun imprimeDatos(){
		println("Datos: $idProd, $nombreProd, $precioProd")
	}
	
}