package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.entity.Student;
import com.app.repo.StudentRepository;


@Controller
@RequestMapping("/student/")
public class StudentController {
	private StudentRepository studentRepository;
	
	@Autowired
	private StudentController(StudentRepository studentRepository) {
		super();
		this.studentRepository=studentRepository;
	}
	
	@GetMapping("showForm")
	public String showForm(Student student) {
		return "add-student";
	}
	@PostMapping("add")
	public String addStudent(Student student, Model model) {
		studentRepository.save(student);
		return "redirect:list";
	}
	
	@GetMapping("list")
	public String showUpdateForm(Model model) {
		model.addAttribute("students",studentRepository.findAll());
		return "index";
	}
	
	@GetMapping("edit/{id}")
	public String showUpdateForm(@PathVariable("id") int id,Model model) {
		
		Student  student = studentRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Invalid student id:"+id));
		model.addAttribute("student",student);
		return "update-student";
		
	}
	
	@PostMapping("update/{id}")
	public String updateStudent(int id, Student student, BindingResult result,Model model) {
		if(result.hasErrors()) {
			student.setId(id);
			return "update-student";
		}
		
		studentRepository.save(student);
		model.addAttribute("students",studentRepository.findAll());
		return "index";
		
	}
	
	
	@GetMapping("delete/{id}")
	public String deleteStudent(@PathVariable("id") int id,Model model) {
		
		Student  student = studentRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Invalid student id:"+id));
		studentRepository.delete(student);
		model.addAttribute("students",studentRepository.findAll());
		return "index";
	}
		
	}
