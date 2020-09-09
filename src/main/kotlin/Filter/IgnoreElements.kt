package Filter

import io.reactivex.rxjava3.core.Observable

fun main() {
    // Completable 를 반환하기 때문
    Observable.just(1, 1, 2, 1, 2, 3)
        .ignoreElements()
        .subscribe { println("complete") }
}