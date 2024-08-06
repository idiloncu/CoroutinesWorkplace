package com.example.coroutinesworkplace

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {

    runBlocking {
        launch (Dispatchers.Main){
            println("Main thread: ${Thread.currentThread().name}")
        }
        launch(Dispatchers.Default){
            println("Default thread: ${Thread.currentThread().name}")
        }
        launch (Dispatchers.IO){
            println("IO thread: ${Thread.currentThread().name}")
        }
        launch (Dispatchers.Unconfined){
            println("Unconfined thread: ${Thread.currentThread().name}")

        }

    }
}