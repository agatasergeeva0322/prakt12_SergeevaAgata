import kotlin.math.*
open class Class {
    fun InputN(): Int
    {
        print("Введите сколько раз будет повторяться программа: ")
        var n = readLine()!!.toInt()
        if (n > 0) return n
        else return 1
    }
    fun Circus()
    {
        try {
            print("Введите радиус окружности: ")
            var r = readLine()!!.toDouble()
            if (r>0)
            {
            print("Что будем вычислять?\n1 - Длина окружности\n2 - Площадь окружности\n---> ")
            var number = readLine()!!.toInt()
            if (number == 1) println("L = ${"%.2f".format(2 * PI * r)}")
            else if (number == 2) println("S = ${"%.2f".format(PI * r.pow(2))}")
            else println("Нет такого действия")
            }
            else println("Радиус не может быть отрицательным!")
        }
        catch (e : Exception)
        {
            println("Данные введены неправильно!")
        }
    }
}