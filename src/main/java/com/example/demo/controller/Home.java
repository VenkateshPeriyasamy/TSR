package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class Home {

	@GetMapping("/")

	public String home() {
		return "index";
	}

	@RequestMapping("/about")
	

	public String name() {

		return "about";
	}

	@RequestMapping("/admin")

	public String admin() {

		return "admin";
	}
	
	@RequestMapping("/admin_details")
	public String admin_details() {

		return "admin_details";
	}

	@RequestMapping("/aracah_admin")
	public String aracah_admin() {

		return "aracah_admin";
	}
	@RequestMapping("/rcamsar_admin")
	public String rcamsar_admin() {

		return "rcamsar_admin";
	}
	@RequestMapping("/faculty")

	public String faculty() {

		return "faculty";
	}

	@RequestMapping("/gallery")

	public String gallery() {

		return "gallery";

	}

	@RequestMapping("/contact")
	public String contact() {
		return "contact";

	}

	@RequestMapping("/tsr")
	public String tsr() {
		return "tsr";
	}

	@RequestMapping("/rcamsar")
	public String rcamsar() {
		return "rcamsar";
	}

	@RequestMapping("/aracah")
	public String aracah() {
		return "aracah";
	}

	@RequestMapping("/index")
	public String index() {
		return "index";
	}

	@RequestMapping("/alumni")
	public String alumni() {
		return "alumni";
	}

	@RequestMapping("/news_events")
	public String news_events() {
		return "news_events";
	}

	@RequestMapping("/courses/tsr_bscnauticalscience")
	public String tsr_bscnauticalscience() {
		return "/courses/tsr_bscnauticalscience";
	}

	@RequestMapping("/courses/tsr_imudiplomainns")
	public String tsr_imudiplomainns() {
		return "/courses/tsr_imudiplomainns";
	}

	@RequestMapping("/courses/tsr_preseageneralpurposeratingtrainingcourse")
	public String tsr_preseageneralpurposeratingtrainingcourse() {
		return "/courses/tsr_preseageneralpurposeratingtrainingcourse";
	}

	@RequestMapping("/courses/tsr_bscmaritimehospitalitystudies")
	public String tsr_bscmaritimehospitalitystudies() {
		return "/courses/tsr_bscmaritimehospitalitystudies";
	}

	@RequestMapping("/courses/tsr_certificationcourseinmaritimecatering")
	public String tsr_certificationcourseinmaritimecatering() {
		return "/courses/tsr_certificationcourseinmaritimecatering";
	}

	@RequestMapping("/courses/tsr_gme")
	public String tsr_gme() {
		return "/courses/tsr_gme";
	}

	@RequestMapping("/courses/tsr_post_basicstcwcourses")
	public String tsr_post_basicstcwcourses() {
		return "/courses/tsr_post_basicstcwcourses";
	}

	@RequestMapping("/courses/tsr_post_advancestcw")
	public String tsr_post_advancestcw() {
		return "/courses/tsr_post_advancestcw";
	}

	@RequestMapping("/courses")
	public String courses() {
		return "/courses";
	}

	@RequestMapping("/facility/museum")
	public String museum() {
		return "/facility/museum";
	}

	@RequestMapping("/facility/hospital")
	public String hospital() {
		return "/facility/hospital";
	}

	@RequestMapping("/facility/library")
	public String library() {
		return "/facility/library";
	}

	@RequestMapping("/facility/security")
	public String security() {
		return "/facility/security";
	}

	@RequestMapping("/facility/transport")
	public String transport() {
		return "/facility/transport";
	}

	@RequestMapping("/facility/catering")
	public String catering() {
		return "/facility/catering";
	}

	@RequestMapping("/facility/farm")
	public String farm() {
		return "/facility/farm";
	}

	@RequestMapping("/facility/laundry")
	public String laundry() {
		return "/facility/laundry";
	}

	@RequestMapping("/facility/broadband")
	public String broadband() {
		return "/facility/broadband";
	}

	@RequestMapping("/facility/banking")
	public String banking() {
		return "/facility/banking";
	}

	@RequestMapping("/facility/playground")
	public String playground() {
		return "/facility/playground";
	}

	@RequestMapping("/facility")
	public String facility() {
		return "/facility";
	}

	@RequestMapping("/tsr_gallery")
	public String tsr_gallery() {
		return "/tsr_gallery";
	}

	@RequestMapping("/rcamsar_gallery")
	public String rcamsar_gallery() {
		return "/rcamsar_gallery";
	}

	@RequestMapping("/aracah_gallery")
	public String aracah_gallery() {
		return "/aracah_gallery";
	}

	@RequestMapping("/aracah_alumni")
	public String aracah_alumni() {
		return "/aracah_alumni";
	}

	@RequestMapping("/courses/tsr_fpff")
	public String tsr_fpff() {
		return "/courses/tsr_fpff";
	}

	@RequestMapping("/courses/tsr_aff")
	public String tsr_aff() {
		return "/courses/tsr_aff";
	}

	@RequestMapping("/courses/tsr_fpff_ref")
	public String tsr_fpff_ref() {
		return "/courses/tsr_fpff_ref";

	}

	@RequestMapping("/courses/tsr_tasco")
	public String tsr_tasco() {
		return "/courses/tsr_tasco";

	}

	@RequestMapping("/courses/rutc")
	public String rutc() {
		return "/courses/rutc";

	}

	@RequestMapping("/courses/tsr_post_refresherupadationcourses")
	public String tsr_post_refresherupadationcourses() {
		return "/courses/tsr_post_refresherupadationcourses";

	}

	@RequestMapping("/courses/tsr_post_offshorecourses")
	public String tsr_post_offshorecourses() {
		return "/courses/tsr_post_offshorecourses";

	}

	@RequestMapping("/courses/tsr_aff_ref")
	public String tsr_aff_ref() {
		return "/courses/tsr_aff_ref";

	}

	@RequestMapping("/courses/tsr_meocliipreparatorycourse")
	public String tsr_meocliipreparatorycourse() {
		return "/courses/tsr_meocliipreparatorycourse";

	}

	@RequestMapping("/courses/tsr_meoclivpreparatorycourse")
	public String tsr_meoclivpreparatorycourse() {
		return "/courses/tsr_meoclivpreparatorycourse";

	}

	@RequestMapping("/courses/ba_culinary_arts")
	public String ba_culinary_arts() {
		return "/courses/ba_culinary_arts";

	}

	@RequestMapping("/courses/short_term_maritime_catering")
	public String short_term_maritime_catering() {
		return "/courses/short_term_maritime_catering";

	}

	@RequestMapping("/tsr_alumni")
	public String tsr_alumni() {
		return "/tsr_alumni";

	}

	@RequestMapping("/rcamsar_alumni")
	public String rcamsar_alumni() {
		return "/rcamsar_alumni";

	}

}
