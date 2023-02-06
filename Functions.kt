// public void main(string args[]){}

// public int sum(int a, int b)

fun main(){
    println(sum2(1, 2))
    printAwesomeMessage("Hello World!")
}

// in Kotlin, return types go at the end
fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int): Int = a + b

// instead of Void, we use Unit
// but Unit is optional when we aren't returning anything

fun printAwesomeMessage(message: String): Unit {
    println(message)
    //return
}