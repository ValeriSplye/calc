import kotlin.reflect.jvm.internal.ReflectProperties.Val

data  class Calcul(var C : Int) {

      fun  add( ValueFirst: Double,  ValueSecond: Double) : Double{
        return  ValueFirst + ValueSecond
    }
     fun subtraction ( ValueFirst: Double, ValueSecond: Double) : Double{
        return  ValueFirst - ValueSecond
    }
     fun multiplication( ValueFirst: Double,  ValueSecond: Double) : Double{
        return  ValueFirst * ValueSecond
    }
    fun division( ValueFirst: Double,  ValueSecond: Double) :String{
        var result : String
        if (ValueSecond == 0.0){
            result = "На ноль делить нельзя"
        }
        else {
            result = "Результат: ${ValueFirst / ValueSecond}"

        }
        return result
    }
    fun Pow( ValueFirst: Int, ValueSecond: Int): Double {
        if(ValueSecond ==0) {return 1.0}
        if(ValueSecond > 0){
            return Pow(ValueFirst,ValueSecond -1) * ValueFirst}
        return  1.0 / Pow(ValueFirst,-ValueSecond)
    }
    fun SqrtPow(ValueFirst: Double, ValueSecond: Byte, E : Double) : Double{
        var xO =ValueFirst/ValueSecond
        var x = ((ValueSecond -1) * xO + ValueFirst/Math.pow(xO,(ValueSecond -1).toDouble()))/ValueSecond
        while (Math.abs(xO - x) >= E){
             xO =x
            x = ((ValueSecond -1) * xO + ValueFirst/Math.pow(xO,(ValueSecond -1).toDouble()))/ValueSecond
        }
        return x
    }
}
