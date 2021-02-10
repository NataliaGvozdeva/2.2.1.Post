package ru.netology.lesson4.service

import ru.netology.lesson4.data.Attachment
import ru.netology.lesson4.data.Post

object WallService {

    private var posts = emptyArray<Post>()
    private var arrayAttach = emptyArray<Attachment>()


    fun addArrayAttach(attach: Attachment) {
        arrayAttach += attach
    }

    fun add(post: Post): Post {
        val newId = if (posts.isEmpty()) 0 else posts.last().id
        posts += post.copy(id=newId+1,attachment = arrayAttach)
        return posts.last()
    }

    fun update(postForСompare: Post): Boolean {
        for ((index, post) in posts.withIndex()) {
            if (postForСompare.id == post.id) {
                val date = post.date
                posts[index] = postForСompare.copy(date = date)
                println("Вывод изменённого поста: ${posts[index]}")
                return true
            }
        }
        return false
    }
}
