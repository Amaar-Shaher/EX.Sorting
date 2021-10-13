fun main(){
  //  var A =1 in 3 downTo 1
  //  println(A)

//var result = "result" in ("num1..num3")
//println(result)


    var num1 = 9
    var num2 = 1
    var num3 = 6

    println("please enter the 1st valu:")
    num1 = readLine()!!.toInt()
    println("please enter the 2nd valu:")
    num2 = readLine()!!.toInt()
    println("please enter the 3rd valu:")
    num3 = readLine()!!.toInt()
     var small = num1
    if (small >= num2) {
        small = num2
    }
   if (small >= num3) {
       small = num3
   }
    var big = num1
    if (big <= num2) {
        big = num2
    }
    if (big <= num3) {
        big = num3
    }

    var mid =0
    if ((num1 < num2 && num1  > num3) || (num1 > num2 && num1 < num3)) {
        mid = num1
    }

    if ((num2 < num1 && num2  > num3) || (num2 > num1 && num2 < num3)){
        mid = num2

    }
    if ((num3 < num1 && num3 > num2 ) || (num3 > num1 && num3 < num2)){
        mid = num3
    }
     println("$small\n$mid\nS$big")
}