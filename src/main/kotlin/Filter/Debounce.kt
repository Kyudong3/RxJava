package Filter

import io.reactivex.rxjava3.core.Observable
import java.util.concurrent.TimeUnit

fun main() {
    Observable.interval(250, TimeUnit.MILLISECONDS)
        .debounce(200, TimeUnit.MILLISECONDS)
//        .debounce(300, TimeUnit.MILLISECONDS)
        .subscribe { println(it) }
    Thread.sleep(1705)
}