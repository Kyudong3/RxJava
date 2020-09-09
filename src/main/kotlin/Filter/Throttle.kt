package Filter

import io.reactivex.rxjava3.core.Observable
import java.util.concurrent.TimeUnit

fun main() {
    // ThrottleLast
    Observable.interval(0, 100, TimeUnit.MILLISECONDS)
        .throttleLast(250, TimeUnit.MILLISECONDS)
        .subscribe {
            println(it)
        }

    Thread.sleep(1000)


    // ThrottleFirst
    Observable.interval(0, 100, TimeUnit.MILLISECONDS)
        .throttleFirst(350, TimeUnit.MILLISECONDS)
        .subscribe {
            println(it)
        }
    Thread.sleep(1100)
}