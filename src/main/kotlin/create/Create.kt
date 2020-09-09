package create

import io.reactivex.rxjava3.core.Observable

fun main() {
    val observable = Observable.create<String> { emitter ->
        emitter.onNext("Hello")
        emitter.onNext("World!")
        emitter.onComplete()
    }

    observable.subscribe { println(it) }
    observable.subscribe { println(it) }
}