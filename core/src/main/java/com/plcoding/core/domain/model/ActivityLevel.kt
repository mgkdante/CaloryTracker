package com.plcoding.core.domain.model

sealed class ActivityLevel(val name: String) {
    object Low: ActivityLevel("low")
    object Medium: ActivityLevel("medium")
    object High: ActivityLevel("high")


    companion object {
        fun fromString(name: String): ActivityLevel{
            return when (name){
                "lose_weight" -> Low
                "keep_weight" -> Medium
                "gain_weight" -> High
                else -> Medium
            }
        }
    }
}