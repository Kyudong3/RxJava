package producer

import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.core.SingleObserver
import io.reactivex.rxjava3.disposables.Disposable
import io.reactivex.rxjava3.functions.Consumer

fun main() {
    // singleObserver 사용
    val singleObserver = producer.SingleObserver<Int>()
    Single.just(1)
        .subscribe(singleObserver)

    println()
    // Consumer 사용
    val consumer = producer.Consumer<String>()
    Single.just("Hello World")
        .subscribe(consumer)

    println()
    // Simple
    Single.just("Hello!!")
        .subscribe(
            {
                println(it)
            },
            {
                println(it)
            })
}

internal class SingleObserver<T> : SingleObserver<T> {
    override fun onSuccess(t: T) {
        println("onSuccess : $t")
    }

    override fun onSubscribe(d: Disposable?) {
        println("onSubscribe")
    }

    override fun onError(e: Throwable?) {
        println("onError : ${e.toString()}")
    }
}

internal class Consumer<T> : Consumer<T> {
    override fun accept(t: T) {
        println("accept : $t")
    }
}