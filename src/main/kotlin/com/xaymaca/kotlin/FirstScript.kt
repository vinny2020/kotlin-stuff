package com.xaymaca.kotlin
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.util.concurrent.atomic.AtomicLong
import kotlin.concurrent.thread


fun main() {
    println("Start")

// Start a coroutine
    GlobalScope.launch {
        delay(1000)
        println("Hello")
    }

    Thread.sleep(2000) // wait for 2 seconds
    println("Stop")



    val c = AtomicLong()

    for (i in 1..1_000_000L)
        GlobalScope.launch {
            c.addAndGet(i)
        }

    println(c.get())
}

