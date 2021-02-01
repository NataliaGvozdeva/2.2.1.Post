package ru.netology.lesson4.service

import ru.netology.lesson4.data.Post

object WallService {
    private var posts = emptyArray<Post>()
    private var originalId = 1

    fun add(post: Post): Post {
        if (posts.isEmpty()){
            posts += post.copy(id = 1)
        } else{
            posts += post.copy(id = posts.last().id+1)
        }
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
