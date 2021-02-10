package ru.netology.lesson4.data

data class AudioAttachment(
        override val type: String,
        val audio: Audio? = null
) : Attachment {
}
