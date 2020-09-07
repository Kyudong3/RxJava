package producer

import io.reactivex.rxjava3.core.Maybe
import io.reactivex.rxjava3.core.MaybeObserver
import io.reactivex.rxjava3.disposables.Disposable

fun main() {
    // maybeObserver 사용
    val maybeObserver = producer.MaybeObserver<Int>()
    Maybe.just(1)
        .subscribe(maybeObserver)

    println()
    // Consumer 사용
    Maybe.just(1)
        .subscribe({
            // onSuccess
            println(it)
        }, {
            // onError
            println(it)
        }, {
            // onComplete
            println("onComplete")
        })

    println()
    // emptyList - 데이터가 0개일 때
    Maybe.empty<Int>()
        .subscribe({
            // onSuccess
            println(it)
        }, {
            // onError
            println(it)
        }, {
            // onComplete
            println("onComplete")
        })
}

internal class MaybeObserver<T> : MaybeObserver<T> {
    override fun onSuccess(t: T) {
        println("onSuccess : $t")
    }

    override fun onSubscribe(d: Disposable?) {
        println("onSubscribe")
    }

    override fun onError(e: Throwable?) {
        println("onError : ${e.toString()}")
    }

    override fun onComplete() {
        println("onComplete")
    }
}