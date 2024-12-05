fun main(){
    val a = readln().toInt()
    val b = readln()
    
    val brr = b.map {it.toString().toInt()}
    
    println(a * brr[2])
    println(a * brr[1])
    println(a * brr[0])   
    println(a * b.toInt())   
    
    
}