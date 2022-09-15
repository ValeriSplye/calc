import calc.*
import Calcul as Calcul1

fun main(){
    var  ValueFirst : Double
    var ValueSecond : Double
    var action : String
    var ActionProgram = 0

    while (ActionProgram != 1){

        println("Чтобы выйти с калькулятора введите 1")
        ActionProgram = readLine()!!.toInt()

        println("Выберите действие \n1-сложение \n2-вычитание\n3-умножение \n4-деление \n5-возведение в степень\n6- корень n -й степени")
        action = readLine().toString()
        when(action){
            "1"->
            {   println("Введите первое число")
                ValueFirst = readLine()!!.toDouble()
                println("Введите второе число")
                ValueSecond = readLine()!!.toDouble()
                println("Результат: ${Calcul1(1).add(ValueFirst, ValueSecond)}" )
            }
            "2"->
            {   println("Введите первое число")
                ValueFirst = readLine()!!.toDouble()
                println("Введите второе число")
                ValueSecond = readLine()!!.toDouble()
                println("Результат: ${Calcul1(1).subtraction(ValueFirst, ValueSecond)}" )
            }
            "3"->
            {  println("Введите первое число")
                ValueFirst = readLine()!!.toDouble()
                println("Введите второе число")
                ValueSecond = readLine()!!.toDouble()
                println("Результат: ${Calcul1(1).multiplication(ValueFirst, ValueSecond)}" )
            }
            "4"->
            {   println("Введите первое число")
                ValueFirst = readLine()!!.toDouble()
                println("Введите второе число")
                ValueSecond = readLine()!!.toDouble()
                println( Calcul1(1).division(ValueFirst, ValueSecond))
            }
            "5" ->
            {   println("Введите  число (целого типа)")
                 var ValueFirst1 = readLine()!!.toInt()
                println("Введите степень (целого типа)")
                var ValueSecond1 = readLine()!!.toInt()
                println( Calcul1(1).Pow(ValueFirst1,ValueSecond1))

            }
            "6"-> {
                println("Введите число их которого нужно достать корень ")
                var  ValueFirst1 = readLine()!!.toDouble()
                println("Введите степень (целого типа)")
                var  ValueSecond1 = readLine()!!.toByte()
                println("Введите точность ")
                var E = readLine()!!.toDouble()
                println( Calcul1(1).SqrtPow(ValueFirst1, ValueSecond1,E))
            }
            else -> println("Не правильно выбранно действие")
        }

    }





}