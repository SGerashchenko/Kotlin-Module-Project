import java.util.Scanner

class UserInput {

    private val scanner = Scanner(System.`in`)

    fun answer(): Int {
        while (true) {
            try {
                print("Введите пожалуйста число: ")
                return scanner.nextLine().toInt()
            } catch (e: NumberFormatException) {
                println("Введите, пожалуйста, корректное число")
            }
        }
    }

    fun input(message: Message): String {
        while (true) {
            print(message.createThing)
            val data = scanner.nextLine()
            if (data.isNotEmpty()) {
                return data
            } else {
                println(message.error)
            }
        }
    }
}
