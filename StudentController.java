package com.kiranacademy.cms.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kiranacademy.cms.entity.Student;
import com.kiranacademy.cms.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService ss;

	@GetMapping("getallstddata")
	List<Student> getAllStdData() {
		return ss.getAllStdData();
	}

	@PostMapping("insertdata")
	String insertData(@RequestBody Student student) {
		return ss.insertData(student);
	}

	@DeleteMapping("deletedata/{id}")
	String deleteData(@PathVariable int id) {
		return ss.deleteData(id);
	}

	@PutMapping("updatedata/{id}")
	String updateData(@PathVariable int id) {
		return ss.updateData(id);
	}

	/////////////////////////// CRUD API END///////////////////////////////////

	/// criteria API with Restrictions start

	@GetMapping("marksmorethan50")
	List<Student> getMarksMoreThan50() {
		return ss.getMarksMoreThan50();
	}

	@GetMapping("agelessthan20")
	List<Student> getStudentAgeLessthan20() {
		return ss.getStudentAgeLessthan20();
	}

	@GetMapping("ABbloodgrpstd")
	List<Student> getAB_BloodGroupStudent() {
		return ss.getAB_BloodGroupStudent();
	}

	@GetMapping("marksbetwn50to90")
	List<Student> getStdMarksBtwn60To90() {
		return ss.getStdMarksBtwn60To90();
	}

	@GetMapping("outofpunelocation")
	List<Student> getStdOutOfPuneLoacation() {
		return ss.getStdOutOfPuneLoacation();
	}

	@GetMapping("onlynagarstd")
	List<Student> getNagarStdOnly() {
		return ss.getNagarStdOnly();
	}

	/// criteria API with Projections start

	@GetMapping("maxmarks")
	List<Student> getMaxMarksStd() {
		return ss.getMaxMarksStd();
	}

	@GetMapping("minmarks")
	List<Student> getMinMarksStd() {
		return ss.getMinMarksStd();
	}

	@GetMapping("total")
	List<Student> getTotalMarks() {
		return ss.getTotalMarks();
	}

	@GetMapping("/average")
	List<Student> getAverageMarks() {
		return ss.getAverageMarks();
	}

	@GetMapping("totaladdress")
	List<Student> stdTotalCities() {
		return ss.stdTotalCities();
	}

	/// start advance level API

	@GetMapping("Mgt50onlypunestd")
	ArrayList<Student> getStdMarksMoreThan50AndfromPuneonly() {

		return ss.getStdMarksMoreThan50AndfromPuneonly();
	}

	@GetMapping("mgt50lpsc")
	ArrayList<Student> getStdMarksMoreThan50AndfromPuneonlyAndSciStreamOnly() {
		return ss.getStdMarksMoreThan50AndfromPuneonlyAndSciStreamOnly();
	}

	@GetMapping("mgrt50onlyartandcom/")
	ArrayList<Student> getStdMarksMoreThan50AndfromArtsACommerceStrOnly() {
		return ss.getStdMarksMoreThan50AndfromArtsACommerceStrOnly();
	}

}
