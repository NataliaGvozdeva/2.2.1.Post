package ru.netology.lesson4

import org.junit.Test
import org.junit.Assert.*
import ru.netology.lesson4.data.Post
import ru.netology.lesson4.service.WallService

class WallServiceTest {

    @Test
    fun addFunction(){
        //arrange

        //act
        val service = WallService()
        val result = service.add(Post())

        //assert
        assertNotEquals(0 ,result.id)

    }

    @Test
    fun updateFunction_returnTrue() {
        // создаём целевой сервис
        val service = WallService()
        // заполняем несколькими постами
        service.add(Post(text = "First post"))
        service.add(Post(text = "Second post"))
        service.add(Post(text = "Third post"))
        // создаём информацию об обновлении
        val update = Post(id = 1, text = "updated text of the post")

        // выполняем целевое действие
        val result = service.update(update)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertTrue(result)
    }

    @Test
    fun updateFunction_returnFalse() {
        // создаём целевой сервис
        val service = WallService()
        // заполняем несколькими постами
        service.add(Post(text = "First post"))
        service.add(Post(text = "Second post"))
        service.add(Post(text = "Third post"))
        // создаём информацию об обновлении
        val update = Post(id = 4, text = "updated text of the post")

        // выполняем целевое действие
        val result = service.update(update)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertFalse(result)
    }

}