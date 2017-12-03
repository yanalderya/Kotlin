import java.util.*

fun main(args:Array<String>) {

    val intArray=Array(5,{i -> i*i  })
    val stringArray= arrayOf("1","2","3")
    val stringArray1= arrayOf<Int>(1,2,3)
    val doubleArray= arrayOfNulls<Double>(10)


  //  for(index in intArray.indices){

  //      println(intArray[index])
  //  }

    println(Arrays.toString(intArray))

}