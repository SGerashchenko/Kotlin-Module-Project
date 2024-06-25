interface TypeOfData {
    val name: String
}

data class Archives(
    override val name: String,
    val notes: MutableList<Notes> = mutableListOf()
) : TypeOfData

data class Notes(
    override val name: String,
    val note: String
) : TypeOfData

data class Message(
    val createThing: String,
    val error: String
)