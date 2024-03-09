package com.github.taskfybackend;

import com.github.taskfybackend.migration.Migration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TaskFyApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(TaskFyApplication.class, args);
		context.getBean(Migration.class).migration();
	}
}