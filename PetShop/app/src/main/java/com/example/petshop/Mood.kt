package com.example.petshop

abstract class Mood(val date: String) {
    abstract fun mood(): String
    fun myDate(): String { // My date attribute of type string
        return date
    }
}