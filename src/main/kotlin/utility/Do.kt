package utility

import io.reactivex.rxjava3.core.Observable

fun main() {
    Observable.just("Hello", "World")
        .doOnSubscribe { println("doOnSubscribe") }
        .doOnNext { println("doOnNext") }
        .doOnEach { println("doOnEach") }
        .doAfterNext { println("doAfterNext") }
        .doOnComplete { println("doOnComplete") }
        .doOnTerminate { println("doOnTerminate") }
        .doOnError { println("doOnError") }
        .doOnDispose { println("doOnDispose") }
        .subscribe { println("- $it") }
}