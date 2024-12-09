fun main() {
    var (a, b) = readln().split(" ").map { it.toInt() }

    if (b - 45 < 0) {
        if (a == 0) {
            a = 23
        } else {
            a -= 1
        }
        b += 60 - 45
    } else {
        b -= 45
    }
    println("$a $b")
}