package com.taiping.tm.task.controller.v1;

import com.taiping.tm.task.persistence.domain.Student;
import com.taiping.tm.task.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * desc:
 * author: as
 * date: 2019/8/9
 */
@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("get/{id}")
    public Student get(@PathVariable("id") Integer id) {
        return studentService.getStudent(id);
    }
}
