package tipos

fun main(args: Array<String>) {
/*
 val: es inmutable
 var: mutable
 */
	//con tipo de dato:
	val numero:Int = 1000
	//sin tipo, se infiere:
	val numNoTipo = 2000
	val palabra = "valor inmutable"
	
	var numMutable:Int? = 50;
	var numDouble = 30.16;
	
	println("Número con tipo: $numero, sin tipo: $numNoTipo")
	println("Palabra: $palabra")

	println("Captura una palabra: ")
	var temp = readLine()
	println("La palabra es: $temp")
	
	println("Captura el nuevo valor para el número mutable $numMutable: ")
	numMutable = readLine()!!.toInt();
	println("Nuevo valor: $numMutable")
	println("Valor double mutable: $numDouble")
	
		

	
}