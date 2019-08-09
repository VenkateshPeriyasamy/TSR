package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.demo.model.SignupDTO;
import com.example.demo.repo.Signup;

@RequestMapping("")
@Controller

public class SignupApi {

	private final Signup signuprepo;

	public SignupApi(Signup signuprepo) {
		this.signuprepo = signuprepo;
	}

	@RequestMapping(path = "/alumni/datatable", method = RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Map<String, List<SignupDTO>> Signupdatatable(String department, String course, String batchno) {
		Map<String, List<SignupDTO>> response = new HashMap<>();
		List<SignupDTO> signupdtos = new ArrayList<>();
		if (department != "" && course != "" && batchno != "") {
			signupdtos = signuprepo.findByDepartmentAndCourseAndBatchno(department, course, batchno);
		}

		else if (department != "" && course != "") {
			signupdtos = signuprepo.findByDepartmentAndCourse(department, course);
		} else if (department != "" && batchno != "") {
			signupdtos = signuprepo.findByDepartmentAndBatchno(department, batchno);
		} else if (course != "" && batchno != "") {
			signupdtos = signuprepo.findByCourseAndBatchno(course, batchno);
		} else if (department != "") {
			signupdtos = signuprepo.findByDepartment(department);
		} else if (course != "") {
			signupdtos = signuprepo.findByCourse(course);
		} else {
			signupdtos = signuprepo.findByBatchno(batchno);
		}

		response.put("data", signupdtos);

		return response;
	}

@RequestMapping(path="/admin_addapi",method=RequestMethod.POST)
    
    public String Admin_AddDetails(String rollno, String name, String dob, String indosno, String passedout, String email,
            String mobilenumber, String department, String course,String batchno, String action) {
        signuprepo.save(new SignupDTO(rollno,name,dob,indosno,passedout,email,mobilenumber,department,course,batchno,action));
        return "/admin_details";
    }
    @RequestMapping(path="/admin_updateapi",method=RequestMethod.POST)
    public String Admin_UpdateDetails(Long id,String rollno, String name, String dob, String indosno, String passedout, String email,
            String mobilenumber, String department, String course,String batchno, String action) {
        signuprepo.save(new SignupDTO(id,rollno,name,dob,indosno,passedout,email,mobilenumber,department,course,batchno,action));
        return "/admin_details";
    }
    @RequestMapping(path="/admin_deleteapi",method=RequestMethod.POST)
    public String Admin_DeleteDetails(Long id) {
        signuprepo.delete(new SignupDTO(id));
        return "/admin_details";
    }
	@RequestMapping(path = "", method = RequestMethod.GET)
	public String index() {

		return "index";
	}

}