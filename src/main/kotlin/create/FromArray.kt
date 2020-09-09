package create

import io.reactivex.rxjava3.core.Observable

fun main() {
    val dataList = arrayOf("Hello", "World")
    Observable.fromArray(*dataList)
        .subscribe { println(it) }
}