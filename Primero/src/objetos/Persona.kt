package objetos

class Persona(private var nombre:String, private var apellidos:String, private var edad:Int) {
	
	fun getNombre1():String{
		return nombre
	}
	
	fun getApellidos1() = apellidos
	
	fun getEdad1():Int{
		return edad
	}
}