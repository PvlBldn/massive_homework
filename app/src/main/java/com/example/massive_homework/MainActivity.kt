package com.example.massive_homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    val bad = 0..3
    val normal = 4..6
    val nice = 7..9
    val excellent = 10
    val gradeArray = arrayOf(4, 7, 3, 6, 10, 2)
    val nameArray = arrayOf("Антон", "Егор", "Маша", "Светлана", "Юля", "Семен")
    val badArray = ArrayList<String>()
    val normalArray = ArrayList<String>()
    val niceArray = ArrayList<String>()
    val excellentArray = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        for ((i, g) in gradeArray.withIndex()) {
            if(g in bad) badArray.add("Student: ${nameArray[i]} - $g")
            if(g in normal) normalArray.add("Student: ${nameArray[i]} - $g")
            if(g in nice) niceArray.add("Student: ${nameArray[i]} - $g")
            if(g == excellent) excellentArray.add("Student: ${nameArray[i]} - $g")
        }

    }
}