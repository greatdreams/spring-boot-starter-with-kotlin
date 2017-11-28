package com.greatdreams.kotlin.template

import com.greatdreams.kotlin.template.model.Student
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.stereotype.Component

@Configuration
@Component
open class ApplicationConfiguration {
    @Value("\${student.id}")
    var id: String = ""

    @Value("\${student.name}")
    var name: String = ""

    @Value("\${student.age}")
    var age: Int = 0
    @Value("\${student.email}")
    var  email: String = "2134@q.com"

    @Bean
    open fun student0(): Student{
        return Student(
                name = "Huawei Wang",
                age = 27,
                email = "871155310@qq.com")
    }
    @Bean
    open fun student1(): Student{
        return Student(
                id = "00001",
                name = "Huawei Wang",
                age = 27,
                email = "871155310@qq.com")
    }

    @Bean
    open fun student2(): Student{
        return Student(
                id = id,
                name = name,
                age = age,
                email = email)
    }
}
