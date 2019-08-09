package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.SignupDTO;

public interface Signup extends JpaRepository<SignupDTO, Long> {
	SignupDTO findByName(String name);


	List<SignupDTO> findByDepartmentAndCourseAndBatchno(String department, String course, String batchno);

	List<SignupDTO> findByDepartmentOrCourseAndBatchno(String department, String course, String batchno);

	List<SignupDTO> findByDepartment(String department);

	List<SignupDTO> findByCourse(String course);

	List<SignupDTO> findByBatchno(String batchno);

	List<SignupDTO> findByDepartmentAndCourse(String department, String Course);

	List<SignupDTO> findByDepartmentAndBatchno(String department, String batchno);

	List<SignupDTO> findByCourseAndBatchno(String department, String batchno);

}
