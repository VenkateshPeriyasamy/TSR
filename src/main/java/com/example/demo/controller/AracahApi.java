package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.AracahDTO;

import com.example.demo.repo.Aracah;

@RequestMapping("")
@Controller

public class AracahApi {

	private final Aracah aracahrepo;

	public AracahApi(Aracah aracahrepo) {
		this.aracahrepo = aracahrepo;
	}

	@RequestMapping(path = "/aracah_alumni/datatable", method = RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Map<String, List<AracahDTO>> Aracahdatatable(String department, String course, String batchno) {
		Map<String, List<AracahDTO>> response = new HashMap<>();
		List<AracahDTO> aracahdtos = new ArrayList<>();

		if (department != "" && course != "" && batchno != "") {
			aracahdtos = aracahrepo.findByDepartmentAndCourseAndBatchno(department, course, batchno);
		}

		else if (department != "" && course != "") {
			aracahdtos = aracahrepo.findByDepartmentAndCourse(department, course);
		} else if (department != "" && batchno != "") {
			aracahdtos = aracahrepo.findByDepartmentAndBatchno(department, batchno);
		} else if (course != "" && batchno != "") {
			aracahdtos = aracahrepo.findByCourseAndBatchno(course, batchno);
		} else if (department != "") {
			aracahdtos = aracahrepo.findByDepartment(department);
		} else if (course != "") {
			aracahdtos = aracahrepo.findByCourse(course);
		} else {
			aracahdtos = aracahrepo.findByBatchno(batchno);
		}

		response.put("data", aracahdtos);

		return response;

	}

}
