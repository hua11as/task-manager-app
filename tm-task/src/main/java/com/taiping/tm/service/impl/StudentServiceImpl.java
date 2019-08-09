package com.taiping.tm.service.impl;

import com.taiping.tm.persistence.dao.StudentMapper;
import com.taiping.tm.persistence.domain.Student;
import com.taiping.tm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * desc:
 * author: as
 * date: 2019/8/9
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public void saveStudent(Student student) {
        studentMapper.insert(student);
    }

    @Override
    public void removeStudent(int id) {
        studentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updateStudent(Student student) {
        studentMapper.updateByPrimaryKey(student);
    }

    @Override
    public Student getStudent(int id) {
        return studentMapper.selectByPrimaryKey(id);
    }
}
