package com.demo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.beans.Subject;
import com.demo.service.SubjectService;

@Controller
@RequestMapping("/subject")
public class SubjectController {

	@Autowired
	SubjectService subservice;

	@GetMapping("/showSubject")
	public ModelAndView getAllSubject(HttpSession session) {
		Student stu = (Student) session.getAttribute("stu");
		if (stu != null) {
			List<Subject> slist = subservice.findAllSubject();
			for (Subject s : slist)
				System.out.println(s);
			session.setAttribute("slist", slist);
			System.out.println(slist);
			return new ModelAndView("displaySubject");
		}
		return new ModelAndView("showLogin", "message", "No Product Found");
	}

	@GetMapping("/addSubject")
	public ModelAndView addNewSubject(@ModelAttribute Subject s) {

		boolean status = subservice.addNewSub(s);
		if (status) {
			return new ModelAndView("displaySubject", "message", "Subject Added Successfully");
		}
		return new ModelAndView("displaySubject", "message", "Subject Not Added...!");
	}

//	@GetMapping("/deletesubject/${sid}")
//	public ModelAndView deleteSubject(@PathVariable("sid") int sid) {
//		boolean status = subservice.deleteSub(sid);
//		if (status) {
//			return new ModelAndView("redirect:/subject/showsubject");
//		}
//		return new ModelAndView("displaySubject", "message", "Subject Not deleted...!");
//	}

}
