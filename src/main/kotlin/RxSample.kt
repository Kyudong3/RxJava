import io.reactivex.rxjava3.core.Observable

fun main() {
    Observable
        .just(0, 1, 2, 3)
        .filter { it % 2 == 0 }
        .subscribe { println(it) }
}