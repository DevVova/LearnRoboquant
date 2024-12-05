package learnkotlin.singleton

/**
 * А вот уже здесь представлены примеры паттерна Singleton на уровне кода.
 */
fun main() {
    val s = New
    println(s)
    println(s)

    val s1 = New.getInstance("Vova")
    println(s1.value)
    println(s1)

    val s2 = New.getInstance("Sam")
    println(s2.value)
    println(s2)
    println(New)
}

class New private constructor(val value: String) {
    init {
        println("New is created.")
    }
    companion object {
        init {
            println("Companion object is created.")
        }
        fun getInstance(value: String): New {
            return New(value)
        }
    }
}