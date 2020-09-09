package combine

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.functions.BiFunction

fun main() {
    val observable1 = Observable.just(1, 2, 3, 4, 5)
    val observable2 = Observable.just("a", "b", "c", "d")
    val observable = Observable.zip(
        observable1,
        observable2,
        BiFunction<Int, String, String> { t1, t2 ->
            "$t1 $t2"
        })
    observable.subscribe { println(it) }

}