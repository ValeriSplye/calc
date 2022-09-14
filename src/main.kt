import calc.*
fun main(){
    var  ValueFirst : Double
    var ValueSecond : Double
    var action : String
    val calc  = Calc()

    println("Введите первое число")
    ValueFirst = readLine()!!.toDouble()
    println("Введите второе число")
    ValueSecond = readLine()!!.toDouble()
    println("Выберите действие \n1-сложение \n2-вычитание")
    action = readLine().toString()

    when(action){
        "1"->
        {
          println("Результат: ${calc.add(ValueFirst,ValueSecond)}" )
        }
        "2"->
        {
            println("Результат: ${calc.subtraction(ValueFirst,ValueSecond)}" )
        }
        else -> println("Не правильно выбранно действие")
    }


}