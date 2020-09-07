package producer

import io.reactivex.rxjava3.subjects.AsyncSubject
import io.reactivex.rxjava3.subjects.BehaviorSubject
import io.reactivex.rxjava3.subjects.PublishSubject
import io.reactivex.rxjava3.subjects.ReplaySubject

fun main() {
    // PublishSubject
    val publishSubject = PublishSubject.create<Int>()
    publishSubject.subscribe { println("1번째 $it") }
    publishSubject.onNext(1)
    publishSubject.subscribe { println("2번째 $it") }
    publishSubject.onNext(2)
    publishSubject.onNext(3)
    publishSubject.subscribe { println("3번째 $it") }
    publishSubject.onNext(4)


    println()
    // BehaviorSubject
    val behaviorSubject = BehaviorSubject.create<Int>()
    behaviorSubject.subscribe { println("1번째 $it") }
    behaviorSubject.onNext(1)
    behaviorSubject.subscribe { println("2번째 $it") }
    behaviorSubject.onNext(2)
    behaviorSubject.onNext(3)
    behaviorSubject.subscribe { println("3번째 $it") }
    behaviorSubject.onNext(4)


    println()
    // ReplaySubject
    val replaySubject = ReplaySubject.create<Int>()
    replaySubject.subscribe { println("1번째 $it") }
    replaySubject.onNext(1)
    replaySubject.subscribe { println("2번째 $it") }
    replaySubject.onNext(2)
    replaySubject.onNext(3)
    replaySubject.subscribe { println("3번째 $it") }
    replaySubject.onNext(4)


    println()
    // AsyncSubject
    val asyncSubject = AsyncSubject.create<Int>()
    asyncSubject.subscribe { println("1번째 $it") }
    asyncSubject.onNext(1)
    asyncSubject.subscribe { println("2번째 $it") }
    asyncSubject.onNext(2)
    asyncSubject.onNext(3)
    asyncSubject.subscribe { println("3번째 $it") }
    asyncSubject.onNext(4)
    asyncSubject.onComplete()
}