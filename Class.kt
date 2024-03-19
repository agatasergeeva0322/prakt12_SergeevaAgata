import kotlinx.coroutines.delay

class Class (var log: String, var pass: String,var numRep: Int, var Full: Boolean) {
    suspend fun sortRep(repository: List<Class>): List<Class>
    {
        delay(7000L)
        return repository.filter {it.Full}.sortedWith(compareBy {it.numRep})
    }
    suspend fun getRep(): String
    {
        return "\nЛОГИН: ${log}\nПАРОЛЬ: ${pass}\nКоличество репозиториев: ${numRep}"
    }
}
