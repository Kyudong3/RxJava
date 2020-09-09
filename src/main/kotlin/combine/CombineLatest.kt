package combine

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.functions.BiFunction
import java.util.concurrent.TimeUnit
import kotlin.random.Random

fun main() {
    val observable1 = Observable.interval(0L, 800L, TimeUnit.MILLISECONDS)
    val observable2 = Observable.interval(0L, 600L, TimeUnit.MILLISECONDS).map { Random.nextInt(10) }
    val observable = Observable.combineLatest<Long, Int, String>(
        observable1,
        observable2,
        BiFunction<Long, Int, String> { t1, t2 ->
            "$t1 $t2"
        })
    observable.subscribe {
        println(it)
    }
    Thread.sleep(4010)
}