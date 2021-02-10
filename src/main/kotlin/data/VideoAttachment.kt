package ru.netology.lesson4.data

data class VideoAttachment(
        override val type: String,
        val photo: Video? = null
) : Attachment {
}
