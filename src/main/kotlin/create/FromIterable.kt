package create

import io.reactivex.rxjava3.core.Observable

fun main() {
    // listOf -> List -> Collection -> Iterable Implement
    val items = listOf("Hello", "World")
    Observable.fromIterable(items)
        .subscribe { println(it) }
}