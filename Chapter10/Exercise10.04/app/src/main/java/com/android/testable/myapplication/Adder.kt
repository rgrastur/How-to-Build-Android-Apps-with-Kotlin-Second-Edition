package com.android.testable.myapplication

class Adder {
    fun sum(n: Int): Long {
        return if (n > 0) (n * (n.toLong() + 1)) / 2 else -1
    }
}



