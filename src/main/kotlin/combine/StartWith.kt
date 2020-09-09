package combine

import io.reactivex.rxjava3.core.Observable

fun main() {
    Observable.just(1, 2, 3,4 ,5)
        .startWithItem(100)
        .subscribe { println(it) }
}