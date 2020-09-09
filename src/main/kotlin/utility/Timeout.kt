package utility

import io.reactivex.rxjava3.core.Observable
import java.util.concurrent.TimeUnit

fun main() {
    Observable.just("Hello", "World")
        .delay(3000L, TimeUnit.MILLISECONDS)
        .timeout(2000L, TimeUnit.MILLISECONDS, Observable.just("TimeOut"))
        .subscribe({
            println(it)
        }, {
            it.printStackTrace()
        })

    Thread.sleep(4000)
}