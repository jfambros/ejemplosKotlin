package condicionciclo

fun main(args: Array<String>) {
	val num1 = 10
	val num2 = 20
	
	if (num1>num2)
		println("Mayor número 1: $num1")
	else
		println("Mayor número 2:$num2")
	
	//en lugar de case, se utiliza when
	
	println("Captura un número entre 1 y 5:")
	val num3 = readLine()!!.toInt()
	
	when (num3){
		1 -> println("Es el 1")
		2 -> println("Es el 2")
		in 3..5 -> println("Es entre 3 y 5")
		else -> {
			println("Era entre 1 y 5!")
		}
	}
	
	println("Ciclo for sencillo:")
	for (i in 1..10){
		print("$i ")
	}
	println("")
	println("Ciclo do-while")
	var x = 0;
	do{
		print("$x ");
		x++
	}while(x<10)
}
