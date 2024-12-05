package learnkotlin.singleton

/**
 * Singleton(одиночка) - это паттерн проектирования при котором создаётся
 * один, по факту уникальный объект. При повторном обращении к объекту,
 * никаких других объектов не создаётся, как например при использовании
 * классов.
 *
 * Ниже приведены примеры синглтонов и один из них [Singleton1]. Они оба
 * являются языковой реализацией из "коробки" этого паттерна. То есть
 * по факту object и есть синглтон.
 *
 * Когда вы объявляете Singleton с ключевым словом object, Kotlin автоматически
 * обеспечивает ленивую инициализацию. Это значит, что объект не будет создан
 * в момент определения object, а лишь в тот момент, когда вы впервые обратитесь
 * к нему.
 *
 * Lazy Initialization — это подход, при котором объект или ресурс создаётся
 * только тогда, когда к нему впервые обращаются.
 */
fun main() {
    println("Start.")
    Singleton1.printObj()
    println("Finish.")
    println()

    println("Start.")
    Singleton1.printObj()
    println("Finish.")
    println()

    Singleton11//Здесь произойдёт инициализация нового объекта.
    Singleton11//А здесь ничего не будет.
    Singleton11//И здесь тоже.
    Singleton11.printObj()
    println(Singleton11.a)
}

/**
 * Это пример синглтона.
 */
object Singleton1 {
    init {
        println("Initial the object.")
    }
    fun printObj() {
        println("Print the object.")
    }
}

object Singleton11 {
    var a: Int = 8

    init {
        println("Initial the object.")
    }
    fun printObj() {
        println("Print the object.")
    }
}