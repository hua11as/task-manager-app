package com.taiping.tm.service;

import com.taiping.tm.persistence.domain.Student;

/**
 * desc:
 * author: as
 * date: 2019/8/9
 */
public interface StudentService {

    void saveStudent(Student student);

    void removeStudent(int id);

    void updateStudent(Student student);

    Student getStudent(int id);
}
