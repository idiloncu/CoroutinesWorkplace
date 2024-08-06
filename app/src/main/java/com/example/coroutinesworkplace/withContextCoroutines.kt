package com.example.coroutinesworkplace

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

fun main() {
        runBlocking {
            launch (Dispatchers.Default){
                println("Context: $coroutineContext")
                withContext(Dispatchers.IO){

                }
                //İç içe coroutineleri daha cok Dispatchers.IO ile baslayıp
            // Dispatchers.Main ile biten konularda kullanılır
            }
        }
    }