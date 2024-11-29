package com.tutorials.inheritanceapp

// Derived class of BaseClass
open class Secondary: BaseClass() {
    override fun role() {
//        super.role()
        println("Knight of the House of BaseClass")
    }
}