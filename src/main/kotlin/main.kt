package ru.netology.lesson4

import ru.netology.lesson4.data.*
import ru.netology.lesson4.service.WallService
import java.time.LocalTime

fun main() {

    val post1 = Post(text = "First post", likes = Likes(count = 0))
    var finalPost1 = WallService.add(post1)
    println("Вывод первого поста: $finalPost1")

    val post2 = Post(text = "Second post", likes = Likes(count = 0))
    val finalPost2 = WallService.add(post2)
    println("Вывод первого поста: $finalPost2")

    val postForMakingChange = Post(id = 1, text = "Changed post 1", likes = Likes(count = 0))
    WallService.update(postForMakingChange)
}