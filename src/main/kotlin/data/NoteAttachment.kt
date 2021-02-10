package ru.netology.lesson4.data

data class NoteAttachment(
        override val type: String,
        val note: Note? = null
) : Attachment {
}
