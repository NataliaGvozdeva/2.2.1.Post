package ru.netology.lesson4.data

class Donut(
    val isDonut: Boolean = false,
    val paid_duration: Int = 86400,
    //val placeholder: Placeholder,
    val canPublishFreeCopy: Boolean = true,
    val editMode: EditModeEnum = EditModeEnum.ALL,
) {

}
