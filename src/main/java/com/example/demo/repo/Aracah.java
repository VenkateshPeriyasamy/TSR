package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.AracahDTO;

public interface Aracah extends JpaRepository<AracahDTO, Long> {
	AracahDTO findByName(String name);

	List<AracahDTO> findByDepartmentAndCourseAndBatchno(String department, String course, String batchno);

	List<AracahDTO> findByDepartmentOrCourseAndBatchno(String department, String course, String batchno);

	List<AracahDTO> findByDepartment(String department);

	List<AracahDTO> findByCourse(String course);

	List<AracahDTO> findByBatchno(String batchno);

	List<AracahDTO> findByDepartmentAndCourse(String department, String Course);

	List<AracahDTO> findByDepartmentAndBatchno(String department, String batchno);

	List<AracahDTO> findByCourseAndBatchno(String department, String batchno);

}
