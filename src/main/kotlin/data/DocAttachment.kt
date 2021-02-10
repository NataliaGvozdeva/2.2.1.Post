package ru.netology.lesson4.data

data class DocAttachment(
        override val type: String,
        val doc: Doc? = null
) : Attachment {
}