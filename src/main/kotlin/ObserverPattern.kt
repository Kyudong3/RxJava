fun main() {
    val eventSubject = EventSubject<String>()
    val eventSubjectString = EventSubjectString<String>()

    eventSubject.addObserver { println("First Observer: $it")}
    eventSubject.addObserver { println("Second Observer: $it")}

    eventSubjectString.addObserver("First Observer: ")
    eventSubjectString.addObserver("Second Observer: ")

    eventSubject.notify("Hello")
    eventSubject.notify("Observer Pattern")

    println()

    eventSubjectString.notify("Hello")
    eventSubjectString.notify("Observer Pattern")
}

typealias Observer<T> = (event: T) -> Unit
class EventSubject<T> {
    private val observers = mutableListOf<Observer<T>>()

    fun addObserver(observer: Observer<T>) {
        observers += observer
    }

    fun notify(event: T) {
        observers.forEach { it.invoke(event) }
    }
}

class EventSubjectString<T> {
    private val observers = mutableListOf<T>()

    fun addObserver(observer: T) {
        observers += observer
    }

    fun notify(event: T) {
        observers.forEach { println("$it $event") }
    }
}