package com.example.petshop

class Joyful(date: String): Mood(date) {
    override fun mood(): String { // My string that represents mood
        return "I am joyful"
    }
}