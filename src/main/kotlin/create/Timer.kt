package create

import io.reactivex.rxjava3.core.Observable
import java.util.concurrent.TimeUnit

fun main() {
    println("start:\t\t ${System.currentTimeMillis()}")
    Observable.timer(3000, TimeUnit.MILLISECONDS)
        .subscribe { println("subscribe:\t ${System.currentTimeMillis()}") }
    Thread.sleep(4000)
}