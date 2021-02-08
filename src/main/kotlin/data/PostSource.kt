package ru.netology.lesson4.data

class PostSource (
    val type: TypeEnum = TypeEnum.VK,
    val platform: PlatformEnum = PlatformEnum.ANDROID,
    val data: DataEnum = DataEnum.PROFILE_ACTIVITY,
    val url: String? = null
){

}
