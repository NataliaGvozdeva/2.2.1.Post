#### 2.2. ООП: Объекты и классы

##### Задача №1 - Посты

Наконец мы добрались до ООП и можем уже не только решать вычислительные задачи, но и моделировать целые системы.

На лекции мы разобрали упрощённый пример того, как может выглядеть пост, давайте же посмотрим на то, как он выглядит на самом деле*.

Примечание*: возьмите себе за привычку анализировать системы, с которыми вы работаете в реальной жизни, и продумывать "как бы сделали вы".

В качестве примера возьмём всё тот же VK: https://vk.com/dev/objects/post (если страница у вас по каким-то причинам недоступна, воспользуйтесь [копией](https://github.com/netology-code/kt-homeworks/blob/master/05_objects/assets/post.pdf) из каталога [assets](https://github.com/netology-code/kt-homeworks/tree/master/05_objects/assets)).

На что нужно обратить внимание:

1. В Kotlin мы используем camelCase для полей
1. Некоторые поля помечены как integer [0, 1], хотя по логике, должны быть Boolean (у вас должны быть Boolean)
1. Игнорируйте поля post_source, attachments, geo, copy_history
1. Все остальные поля должны быть перечислены

Что мы хотим получить:

1. Data класс Post
1. Объект WallService, который внутри себя хранит посты в массиве

Итого: у вас должен быть репозиторий на GitHub, в котором расположен ваш Gradle-проект (автотесты также должны храниться в репозитории).