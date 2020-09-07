package producer

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.disposables.Disposable
import io.reactivex.rxjava3.functions.Consumer

fun main() {
    // Observer 사용
    val observer = Observer<String>()
    Observable
        .just("Hello", "world", "!")
        .subscribe(observer)

    println()
    // Consumer 사용
    val consumer = Consumer<Int> { println(it) }
    Observable
        .just(1, 2, 3, 4, 5)
        .subscribe(consumer)

    // Simple
    Observable
        .just(1, 2, 3, 4, 5, 6)
        .subscribe { println(it) }
}

internal class Observer<T> : Observer<T> {
    override fun onComplete() {
        println("onComplete")
    }

    override fun onSubscribe(d: Disposable?) {
        println("onSubscribe")
    }

    override fun onNext(t: T) {
        println("onNext : $t")
    }

    override fun onError(e: Throwable?) {
        println("onError : ${e.toString()}")
    }
}