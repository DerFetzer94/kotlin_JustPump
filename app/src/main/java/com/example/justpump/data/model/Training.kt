package com.example.justpump.data.model

/**
 * Diese Klasse repräsentiert einen Trainingsplan
 **/
data class Training(
    val category: ExerciseCategory,
    val imageId: Int,
    val title: String,
    val description: String
)