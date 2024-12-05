fun main(){
    val (A, B, C) = readln().split(" ").map { it.toInt() }
    println((A+B)%C)
    println(((A%C) + (B%C))%C)
    println((A*B)%C)
    println(((A%C) * (B%C))%C)
}