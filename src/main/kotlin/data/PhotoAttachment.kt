package ru.netology.lesson4.data

data class PhotoAttachment(
        override val type: String,
        val photo: Photo? = null
) : Attachment {
}
