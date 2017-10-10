package objetos

class Producto(private val idProd:Int, private var nombreProd:String) {
	init{
		println("constructor primario");
	}
	
	fun imprimeDatos(){
		println("Datos capturados: "+idProd+" "+nombreProd)
	}
	
	fun getIdProd():Int{
		return idProd;
	}
	
	
	fun setNombreProd(nombreProd:String){
		println("Capturado el nombre $nombreProd")
		this.nombreProd = nombreProd
	}
	
	
}