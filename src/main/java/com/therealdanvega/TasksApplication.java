package com.therealdanvega;

import com.therealdanvega.domain.Task;
import com.therealdanvega.service.TaskService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@SpringBootApplication
public class TasksApplication {

    public static void main(String[] args) {
        SpringApplication.run(TasksApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(TaskService taskService) {
        return args -> {
            taskService.save(new Task(1L, "Create #1", LocalDate.now(), true));
            taskService.save(new Task(1L, "Create #2", LocalDate.now().plus(1, ChronoUnit.DAYS), false));
            taskService.save(new Task(1L, "Create #3", LocalDate.now().plus(3, ChronoUnit.DAYS), false));
            taskService.save(new Task(1L, "Create #4", LocalDate.now().plus(5, ChronoUnit.DAYS), false));
            taskService.save(new Task(1L, "Create #5", LocalDate.now().plus(8, ChronoUnit.DAYS), false));
            taskService.save(new Task(1L, "Create #6", LocalDate.now().plus(10, ChronoUnit.DAYS), false));
            taskService.save(new Task(1L, "Create #7", LocalDate.now().plus(12, ChronoUnit.DAYS), false));
            taskService.save(new Task(1L, "Create #8", LocalDate.now().plus(13, ChronoUnit.DAYS), false));
        };
    }

}
