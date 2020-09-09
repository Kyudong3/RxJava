package combine

import io.reactivex.rxjava3.core.Observable
import java.util.concurrent.TimeUnit

fun main() {
    val observable1 = Observable.interval(0L, 1000L, TimeUnit.MILLISECONDS).map { "1:$it" }
    val observable2 = Observable.interval(0L, 500L, TimeUnit.MILLISECONDS).map { "2:$it" }
    val observable = Observable.merge(observable1, observable2)

    observable.subscribe {
        println(it)
    }
    Thread.sleep(3000)
}