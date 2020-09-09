package Filter

import io.reactivex.rxjava3.core.Observable

fun main() {
    // Distinct
    Observable.just(1, 1, 2, 3, 1, 2, 3, 3, 4, 6)
        .distinct()
        .subscribe { println(it) }


    println()
    // DistinctUntilChanged
    Observable.just(1, 1, 2, 3, 1, 2, 3, 3, 4, 6)
        .distinctUntilChanged()
        .subscribe { println(it) }
}