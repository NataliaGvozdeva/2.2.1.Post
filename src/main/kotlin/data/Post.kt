package ru.netology.lesson4.data

import java.time.LocalTime

data class Post(
    val id: Int = 0,
    val ownerId: Int = 0,
    val fromId: Int = 0,
    val createdBy: Int = 0,
    val date: LocalTime = LocalTime.now(),
    val text: String? = null,
    val replyOwnerId: Int = 0,
    val replyPostId: Int = 0,
    val friendsOnly: Boolean = true,
    val comments: Comments = Comments(),
    val copyright: Copyright = Copyright(),
    val likes: Likes = Likes(),
    val reposts: Reposts = Reposts(),
    val views: Views = Views(),
    val postType: PostTypeEnum = PostTypeEnum.POST,
    val postSource: PostSource = PostSource(),
    val attachment: Array<Attachment>? = null,
    val geo: Geo = Geo(),
    val signerId: Int = 0,
    val copyHistory: Array<String>? = null,
    val canPin: Boolean = true,
    val canDelete: Boolean = true,
    val canEdit: Boolean = true,
    val isPinned: Boolean = false,
    val markedAsAds: Boolean = false,
    val isFavorite: Boolean = false,
    val donut: Donut = Donut(),
    val postponedId: Int = 0,
) {
}