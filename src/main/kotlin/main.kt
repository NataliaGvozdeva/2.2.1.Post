package ru.netology.lesson4

import ru.netology.lesson4.data.*
import ru.netology.lesson4.service.WallService
import java.time.LocalTime

fun main() {
    val service = WallService()
    //val post1 = Post(date = LocalTime.now(), text = "First post", likes = Likes(count = 0) )
    val post1 = Post(text = "First post", likes = Likes(count = 0) )
    var finalPost1 = service.add(post1)
   println("Вывод первого поста: $finalPost1")

    val post2 = Post(text = "Second post", likes = Likes(count = 0))
    val finalPost2 = service.add(post2)
    println("Вывод первого поста: $finalPost2")

    val postForMakingChange = Post(id = 1, text = "Changed post 1", likes = Likes(count = 2))
    service.update(postForMakingChange)
}