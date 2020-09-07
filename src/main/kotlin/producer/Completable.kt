package producer

import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.CompletableObserver
import io.reactivex.rxjava3.disposables.Disposable

fun main() {
    // completableObserver 사용
    val completableObserver = producer.CompletableObserver()
    Completable.complete()
        .subscribe(completableObserver)

    println()
    // Consumer 사용
    Completable.complete()
        .subscribe({
            // onComplete
            println("onComplete")
        }, {
            // onError
            println(it)
        })
}

internal class CompletableObserver : CompletableObserver {
    override fun onComplete() {
        println("onComplete")
    }

    override fun onSubscribe(d: Disposable?) {
        println("onSubscribe")
    }

    override fun onError(e: Throwable?) {
        println("onError $e")
    }
}