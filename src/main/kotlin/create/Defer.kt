package create

import io.reactivex.rxjava3.core.Observable

fun main() {
    val observable = Observable.defer {
        Observable.create<Int> {
            println("생산")
            it.onNext(1)
        }
    }

    observable.subscribe { println(it) }
    observable.subscribe { println(it) }
}