package transform

import io.reactivex.rxjava3.core.Observable

fun main() {
    Observable.fromIterable(0..3)
        .map { "RxJava: $it" }
        .subscribe { println(it) }
}