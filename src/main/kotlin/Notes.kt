fun menuNotes(archive: Archives, numberArchive: Int) {
    while (true) {
        val listOfIndexesNotes: List<Int> = Menu(archive.notes).showMenu()
        when (val getAnswer = UserInput().answer()) {
            0 -> createNote(numberArchive)
            listOfIndexesNotes.size + 1 -> break
            in listOfIndexesNotes -> showText(archive.notes, getAnswer)
            else -> println("Такой цифры нет в меню")
        }
    }
}

fun createNote(index: Int) {
    val pairNote: Pair<String, String> = Pair(
        UserInput().input(
            Message("Введите имя: ", "Имя не может быть пустым")
        ),
        UserInput().input(
            Message("Введите содержание:\n", "Содержание не может быть пустым")
        )
    )
    archives[index].notes.add(Notes(pairNote.first, pairNote.second))
}

fun showText(notes: List<Notes>, getAnswer: Int) {
    notes.getOrNull(getAnswer)?.let { note ->
        println("Заметка \"${note.name}\":")
        println("${note.note}\n")
    }
}