package com.example.myapplication

import android.content.Context

class PreferenceManager(context: Context) {
    private val sharedPreferences = context.getSharedPreferences("MyAppPreferences", Context.MODE_PRIVATE)

    fun isLoggedIn(): Boolean {
        return sharedPreferences.getBoolean("isLoggedIn", false)
    }

    fun setLoggedIn(isLoggedIn: Boolean) {
        val editor = sharedPreferences.edit()
        editor.putBoolean("isLoggedIn", isLoggedIn)
        editor.apply()
    }
}