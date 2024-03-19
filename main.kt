import kotlinx.coroutines.*
suspend fun main(){
    var obj: Class = Class()
    var n = obj.InputN()
    if (n!=1) {
        GlobalScope.launch()
        {
            for (i in 0..n - 1) {
                println("№${i + 1}")
                obj.Circus()
            }
        }
    runBlocking  { delay (30000L)}
    }
    else println("Вы ввели отрицательное количество запусков программы! Так нельзя!")
}
