package com.greatdreams.kotlin.template

import com.greatdreams.kotlin.template.model.Student
import org.slf4j.LoggerFactory
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Configuration
import org.springframework.core.env.get

/**
 * @author greatdreams
 * <br/>This is the main class for the application
 */
@SpringBootApplication
@Configuration("ApplicationConfiguration.class, ApplicationConfiguration1.class")
open class Application {

    companion object {
        val log = LoggerFactory.getLogger(javaClass)
        /**
         * the main method of the application class
         * @param args application command arguments when running
         */
        @JvmStatic fun main(args: Array<String>) {
            log.info("The main program begins to run..." + args.toString())
            val ctx = SpringApplication.run(Application::class.java, *args)
            log.info("application name: " + ctx.environment.get("spring.application.name"))
            log.info("student id: " + ctx.environment.get("student.name"))
            for(name in ctx.beanDefinitionNames) {
                log.debug("name: " + name + ", " + ctx.getBean(name)::class.java)
            }
            val stu = ctx.getBean("student2", Student::class.java)
            log.info("student information: " + stu.toString())
            log.info("The main program exits normally...")
        }
    }
}