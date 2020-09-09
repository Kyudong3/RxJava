package create

import io.reactivex.rxjava3.core.Observable

fun main() {
    val observable = Observable.just("Hello", "World")
        .doOnSubscribe { println("subscribe") }
        .repeat(2)
    observable.subscribe { println(it) }
}