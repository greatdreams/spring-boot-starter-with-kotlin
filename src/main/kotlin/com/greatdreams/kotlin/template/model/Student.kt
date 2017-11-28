package com.greatdreams.kotlin.template.model

data class Student(var id: String = "00000",
                   var name: String = "anonymous",
                   var age: Int = 10,
                   var email: String) {

    open override fun toString(): String {
        return "Student(${this.id}, ${this.name},${this.age}, ${this.email})"
    }
}