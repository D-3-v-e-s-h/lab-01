package com.example.petshop

class Calm(date: String): Mood(date) {
    override fun mood(): String {
        return "I am calm" // My string that represents mood
    }
}