package com.taiping.tm.service;

import com.taiping.tm.persistence.domain.Student;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * desc:
 * author: as
 * date: 2019/8/9
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentServiceTest {

    @Autowired
    private StudentService studentService;

    private static final int TEST_ID = 1;

    @Test
    public void testSaveStudent() {
        Student student = new Student();
        student.setId(TEST_ID);
        student.setName("阿水");
        student.setSex((byte) 1);
        student.setAge(30);
        student.setCreateTime(new Date());
        studentService.saveStudent(student);

        Assert.assertNotNull(studentService.getStudent(student.getId()));
    }

    @Test
    public void testGetStudent() {
        Assert.assertNotNull(studentService.getStudent(TEST_ID));
    }

    @Test
    public void testUpdateStudent() {
        Student student = studentService.getStudent(TEST_ID);
        student.setName("修改名称");
        studentService.updateStudent(student);

        Student student2 = studentService.getStudent(TEST_ID);
        Assert.assertEquals(student.getName(), student2.getName());
    }

    @Test
    public void testRemoveStudent() {
        studentService.removeStudent(TEST_ID);

        Student student = studentService.getStudent(TEST_ID);
        Assert.assertNull(student);
    }
}
