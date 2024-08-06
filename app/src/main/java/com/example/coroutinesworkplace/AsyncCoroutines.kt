package com.example.coroutinesworkplace

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() {

    var userName = ""
    var userAge = 0

    runBlocking {
       val downloadedName=async {
           downloadedName()
       }
        val downloadedAge=async {
            downloadedAge()
        }
        userName=downloadedName.await()
        userAge=downloadedAge.await()
        println("$userName $userAge")
    }
}
suspend fun downloadedName():String{
    delay(4000)
    return "new data"
}
suspend fun downloadedAge():Int{
    delay(2000)
    return 21
}

