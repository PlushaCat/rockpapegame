import kotlin.random.Random

fun main(args: Array<String>) {
    game()


}

fun Checkresult(input: String) {
    var randomvar = Random.nextInt(1, 3)
    var vrag = ""

    when (randomvar) {
        1 -> vrag = "Камень"
        2 -> vrag = "Ножницы"
        3 -> vrag = "Бумага"
    }

    if (input == vrag) {
        println("Вы  выбрали " + input + ", соперник выбрал " + vrag + " Ничья")
        game()
    }

    if (input == "Камень" && vrag == "Ножницы") {
        println("Вы выбрали " + input + ", соперник выбрал " + vrag + " Вы победили")
    }

    if (input == "Камень" && vrag == "Бумага") {
        println("Вы выбрали " + input + ", соперник выбрал " + vrag + " Вы проиграли")
    }

    if (input == "Ножницы" && vrag == "Камень") {
        println("Вы выбрали " + input + ", соперник выбрал " + vrag + " Вы проиграли")
    }

    if (input == "Ножницы" && vrag == "Бумага") {
        println("Вы выбрали " + input + ", соперник выбрал " + vrag + " Вы победили")
    }

    if (input == "Бумага" && vrag == "Ножницы") {
        println("Вы выбрали " + input + ", соперник выбрал " + vrag + " Вы проиграли")
    }

    if (input == "Бумага" && vrag == "Камень") {
        println("Вы выбрали " + input + ", соперник выбрал " + vrag + " Вы победили")
    }

}


fun game() {
    println("Введите 'Каменьfrgh', 'Ножницы', 'Бумага'.")

    var v = readln()

    when (v) {
        "Камень" -> Checkresult("Камень")
        "Ножницы" -> Checkresult("Ножницы")
        "Бумага" -> Checkresult("Бумага")
    }
}