package com.httpentityexample.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.httpentityexample.entities.Student;
import com.httpentityexample.exception.StudentNotFoundException;
import com.httpentityexample.repository.StudentRepository;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public List<Student> retrieveAllStudent() {
		return (List<Student>) studentRepository.findAll();
	}

	@Override
	public Student createStudentDetail(Student newStudent) {
		return studentRepository.save(newStudent);

	}

	@Override
	public Student retrieveStudentById(Integer studentId) throws StudentNotFoundException {

		return studentRepository.findById(studentId).orElseThrow(() -> new StudentNotFoundException(studentId));
	}

	@Override
	public void deleteStudentById(Integer studentId) {
		studentRepository.deleteById(studentId);

	}

	@Override
	public Student updateStudentDetails(Student newStudent, Integer studentId) {
			 return studentRepository.findById(studentId).map
					 (student -> {student.setStudentName(newStudent.getStudentName());
				        student.setDateOfBirth(newStudent.getDateOfBirth());
				        student.setCourseEnrolled(newStudent.getCourseEnrolled());
				        return studentRepository.save(student);
				      })
				      .orElseGet(() -> {
				        newStudent.setStudentId(studentId);
				        return studentRepository.save(newStudent);
				      });
	}
}