package com.andrewafony.triada.core

interface Mapper<T, R> {

    fun map(data: T): R

    interface Unit<S>: Mapper<S, kotlin.Unit>
}