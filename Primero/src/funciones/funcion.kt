package funciones

fun main(args: Array<String>) {
	
	val num1: Int
	val num2: Int
	println("Captura el número 1: ")
	num1 = readLine()!!.toInt()
	println("Captura el número 2: ")
	num2 = readLine()!!.toInt()
	println("El mayor es: "+retornaMayor(num1, num2))
}

fun retornaMayor(num1:Int, num2:Int):Int{
	if (num1>num2)
		return num1
	else
		return num2
}