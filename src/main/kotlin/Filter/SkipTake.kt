package Filter

import io.reactivex.rxjava3.core.Observable

fun main() {
    // Skip
    Observable.just(1, 1, 2, 1, 2, 3, 4, 5, 6)
        .skip(3)
        .subscribe { print("$it  ") }

    println()
    // SkipLast
    Observable.just(1, 1, 2, 1, 2, 3, 4, 5, 6)
        .skipLast(3)
        .subscribe { print("$it  ") }

    println()
    // Take
    Observable.just(1, 1, 2, 1, 2, 3, 4, 5, 6)
        .take(3)
        .subscribe { print("$it  ") }


    println()
    // TakeLast
    Observable.just(1, 1, 2, 1, 2, 3, 4, 5, 6)
        .takeLast(4)
        .subscribe { print("$it  ") }
}