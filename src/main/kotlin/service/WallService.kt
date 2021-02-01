package ru.netology.lesson4.service

import ru.netology.lesson4.data.Post

class WallService {
    private var posts = emptyArray<Post>()
    private var originalId = 1

    fun add(post: Post): Post {
        posts += post.copy(id = originalId++)
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
