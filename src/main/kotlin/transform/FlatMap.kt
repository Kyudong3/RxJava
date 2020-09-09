package transform

import io.reactivex.rxjava3.core.Observable

fun main() {
    Observable.fromIterable(0..20)
        .flatMap { Observable.just("num: $it") }
        .subscribe { println(it) }
}