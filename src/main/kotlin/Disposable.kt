import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.disposables.CompositeDisposable
import java.util.concurrent.TimeUnit

fun main() {
    val compositeDisposable = CompositeDisposable()
    val disposable1 = Observable.just(1, 2)
        .subscribe { println(it) }
    compositeDisposable.addAll(disposable1)
    compositeDisposable.clear()

    val disposable2 = Observable.just(3, 4)
        .delay(1, TimeUnit.SECONDS)
        .subscribe { println(it) }
    compositeDisposable.addAll(disposable2)
    Thread.sleep(2000L)
}