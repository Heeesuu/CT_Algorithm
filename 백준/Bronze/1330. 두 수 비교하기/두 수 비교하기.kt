fun main(){
    val (a, b) = readln().split(" ").map { it.toInt() }
    
    if (a > b) {
        println(">")
    } else if(a < b) {
        println("<") 
    } else {
        println("==")
    }
}