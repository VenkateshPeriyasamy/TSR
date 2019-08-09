package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.RcamsarDTO;

public interface Rcamsar extends JpaRepository<RcamsarDTO, Long> {
	RcamsarDTO findByName(String name);

	List<RcamsarDTO> findByDepartmentAndCourseAndBatchno(String department, String course, String batchno);

	List<RcamsarDTO> findByDepartmentOrCourseAndBatchno(String department, String course, String batchno);

	List<RcamsarDTO> findByDepartment(String department);

	List<RcamsarDTO> findByCourse(String course);

	List<RcamsarDTO> findByBatchno(String batchno);

	List<RcamsarDTO> findByDepartmentAndCourse(String department, String Course);

	List<RcamsarDTO> findByDepartmentAndBatchno(String department, String batchno);

	List<RcamsarDTO> findByCourseAndBatchno(String department, String batchno);

}
