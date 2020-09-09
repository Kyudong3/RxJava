package Filter

import io.reactivex.rxjava3.core.Observable

fun main() {
    Observable.just(1, 2, 3, 4, 1, 1, 2, 3, 4)
        .filter { it % 2 == 1 }
        .subscribe { println(it) }
}