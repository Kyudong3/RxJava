package Filter

import io.reactivex.rxjava3.core.Observable

fun main() {
    Observable.just(1, true, "Hello", "World", 2f)
        .ofType(Integer::class.java)
        .subscribe { println(it) }
}