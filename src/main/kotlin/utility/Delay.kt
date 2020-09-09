package utility

import io.reactivex.rxjava3.core.Observable
import java.util.concurrent.TimeUnit

fun main() {
    println(System.currentTimeMillis())
    Observable.just("Hello World")
        .delay(5000, TimeUnit.MILLISECONDS)
        .subscribe {
            println(it)
        }
    Thread.sleep(7000)
}