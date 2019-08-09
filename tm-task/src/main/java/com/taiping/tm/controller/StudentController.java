package com.taiping.tm.controller;

import com.taiping.tm.persistence.domain.Student;
import com.taiping.tm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * desc:
 * author: as
 * date: 2019/8/9
 */
@Controller
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("get/{id}")
    @ResponseBody
    public Student get(@PathVariable("id") Integer id) {
        return studentService.getStudent(id);
    }
}
