package com.example.coroutinesworkplace

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        delay(2000)
        myFun()
    }
}
suspend fun myFun(){
    coroutineScope {
        delay(3000)
        println("suspend function")
    }
}