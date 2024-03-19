import kotlinx.coroutines.*
fun main() = runBlocking{
    var repos = mutableListOf<Class>()
    while(true)
    {
        println("\nНовый участник! Давайте разрушим основы конфиденциальности!!!")
        try{
            print("LOGIN ('exit' for exit): ")
            var login = readLine()!!.toString()
            if (login == "exit" || login == "Exit" || login == "EXIT") break
            if (login.length>4)
            {
            print("PASSWORD: ")
            var password = readLine()!!.toString()
            if (password.length > 7) {
                print("Numbers of repositories: ")
                var numb = readLine()!!.toInt()
                if (numb>0)
                {
                print("Are they NOT empty? (1 is 'yes'; 2 is 'no') ")
                var full = readLine()!!.toInt()
                if (full != 1 && full != 2) throw Exception()
                val isFull: Boolean = full == 1

                repos.add(Class(login, password, numb, isFull))
                }
                else println("Количество репозиториев не может быть отрицательным!")
            }
            else println("Пароль был слишком коротким!")
            }
            else println("Логин слишком короткий")
        }
        catch(e : Exception)
        {
            println("Был произведён неправильный ввод данных")
        }
    }
    if (repos.size >0) {
        println("\nЗагрузка данных...")
        delay(5000L)
        val sortRep = repos.first().sortRep(repos)
        sortRep.forEach {
            println(it.getRep())
        }
    }
    else println("THE END")
}
