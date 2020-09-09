package transform

import io.reactivex.rxjava3.core.Observable

fun main() {
    Observable.fromIterable(0..10)
        .buffer(2, 3)
        .subscribe { println(it) }
}