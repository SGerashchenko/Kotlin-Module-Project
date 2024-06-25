class Menu<T : TypeOfData>(private val elements: List<T>) {

    fun showMenu(): List<Int> {
        val selectedIndices: MutableList<Int> = mutableListOf()

        elements.forEachIndexed { index, element ->
            println("$index. ${element.name}")
            selectedIndices.add(index)
        }

        println("${elements.size}. Выйти\n")

        return selectedIndices
    }
}