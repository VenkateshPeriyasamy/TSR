package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.demo.model.RcamsarDTO;
import com.example.demo.repo.Rcamsar;

@RequestMapping("")
@Controller
public class RcamsarApi {

	private final Rcamsar rcamsarrepo;

	public RcamsarApi(Rcamsar rcamsarrepo) {
		this.rcamsarrepo = rcamsarrepo;
	}

	@RequestMapping(path = "/rcamsar_alumni/datatable", method = RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Map<String, List<RcamsarDTO>> Rcamsardatatable(String department, String course, String batchno) {
		Map<String, List<RcamsarDTO>> response = new HashMap<>();
		List<RcamsarDTO> rcamsardtos = new ArrayList<>();

		if (department != "" && course != "" && batchno != "") {
			rcamsardtos = rcamsarrepo.findByDepartmentAndCourseAndBatchno(department, course, batchno);
		}

		else if (department != "" && course != "") {
			rcamsardtos = rcamsarrepo.findByDepartmentAndCourse(department, course);
		} else if (department != "" && batchno != "") {
			rcamsardtos = rcamsarrepo.findByDepartmentAndBatchno(department, batchno);
		} else if (course != "" && batchno != "") {
			rcamsardtos = rcamsarrepo.findByCourseAndBatchno(course, batchno);
		} else if (department != "") {
			rcamsardtos = rcamsarrepo.findByDepartment(department);
		} else if (course != "") {
			rcamsardtos = rcamsarrepo.findByCourse(course);
		} else {
			rcamsardtos = rcamsarrepo.findByBatchno(batchno);
		}

		response.put("data", rcamsardtos);

		return response;
	}

}
