package  calc
class Calc  {
  public  fun  add(ValueFirst : Double, valueSecond : Double) : Double{
       return  ValueFirst + valueSecond
    }
   public fun subtraction (ValueFirst : Double, valueSecond : Double) : Double{
        return  ValueFirst - valueSecond
    }
   public fun multiplication(ValueFirst : Double,valueSecond :Double) : Double{
       return  ValueFirst * valueSecond
   }
    public fun division(ValueFirst : Double,valueSecond :Double) :String{
        var result : String
        if (valueSecond == 0.0){
            result = "На ноль делить нельзя"
        }
        else {
            result = "Результат: ${ValueFirst / valueSecond}"

        }
        return result
    }
}