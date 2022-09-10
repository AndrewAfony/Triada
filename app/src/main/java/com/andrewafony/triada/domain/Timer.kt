package com.andrewafony.triada.domain

import android.os.CountDownTimer
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow

interface Timer {

    fun start(): Flow<Int>

    fun pause()

    fun reset()

    class Base: Timer {

        private lateinit var timer: CountDownTimer

        override fun start() = callbackFlow {
            trySend(60)
            timer = object : CountDownTimer(60000L, 1000L) {
                override fun onTick(millisUntilFinished: Long) {
                    trySend((millisUntilFinished/1000).toInt())
                }

                override fun onFinish() {}

            }.start()

            awaitClose { timer.cancel() }
        }

        override fun pause() {
            if (this::timer.isInitialized) timer.cancel()
        }

        override fun reset() {

        }
    }
}
