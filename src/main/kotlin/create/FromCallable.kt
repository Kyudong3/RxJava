package create

import io.reactivex.rxjava3.core.Observable

fun main() {
    println("start: ${System.currentTimeMillis()}")
    fun createItem(): String {
        println("create: ${System.currentTimeMillis()}")
        return "Hello World!"
    }

    val observable = Observable.fromCallable { createItem() }
    Thread.sleep(1000)
    observable.subscribe { println(it) } // 이 때 Observable 을 만든다
    Thread.sleep(1000)
    observable.subscribe { println(it) }
}