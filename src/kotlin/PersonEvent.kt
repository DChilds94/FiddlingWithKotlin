sealed class PersonEvent {
    object Awake : PersonEvent()
    object Asleep : PersonEvent()
    class Eating(val food: String) : PersonEvent()
}

fun handlePersonEvent(event: PersonEvent) {
    when(event) {
        is PersonEvent.Awake -> println("Awake")
        is PersonEvent.Asleep -> println("Asleep")
        is PersonEvent.Eating -> println(event.food)
    }
}

fun main () {
    handlePersonEvent(event = PersonEvent.Asleep)
    handlePersonEvent(event = PersonEvent.Awake)
    handlePersonEvent(event = PersonEvent.Eating("Cheese"))
}



