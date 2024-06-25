val archives = mutableListOf(Archives("Добавить архив"))

fun start() {
    while (true) {
        println("Управление архивами: \n")
        val listArchives: List<Int> = Menu(archives).showMenu()
        when (val getAnswer = UserInput().answer()) {
            0 -> createArchive()
            listArchives.size -> break
            in listArchives -> menuNotes(archives[getAnswer], getAnswer)
            else -> println("Такой цифры нет в меню")
        }
    }
}

fun createArchive() {
    val nameOfArchive: String = UserInput().input(
        Message(
            "Введите имя: ",
            "Имя не может быть пустым"
        )
    )
    archives.add(Archives(nameOfArchive, mutableListOf(Notes("Создать новую заметку", ""))))
}