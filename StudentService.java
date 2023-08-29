package com.kiranacademy.cms.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiranacademy.cms.dao.StudentDao;
import com.kiranacademy.cms.entity.Student;

@Service
public class StudentService {
	@Autowired
	StudentDao sd;

	public List<Student> getAllStdData() {
		return sd.getAllStdData();
	}

	public String insertData(Student student) {
		return sd.insertData(student);
	}

	public String deleteData(int id) {
		return sd.deleteData(id);
	}

	public String updateData(int id) {

		return sd.updateData(id);
	}

	public List<Student> getMarksMoreThan50() {

		return sd.getMarksMoreThan50();
	}

	public List<Student> getStudentAgeLessthan20() {
		return sd.getStudentAgeLessthan20();
	}

	public List<Student> getAB_BloodGroupStudent() {
		return sd.getAB_BloodGroupStudent();
	}

	public List<Student> getStdMarksBtwn60To90() {
		return sd.getStdMarksBtwn60To90();
	}

	public List<Student> getStdOutOfPuneLoacation() {
		return sd.getStdOutOfPuneLoacation();
	}

	public List<Student> getNagarStdOnly() {

		return sd.getNagarStdOnly();
	}

	public List<Student> getMaxMarksStd() {
		return sd.getMaxMarksStd();
	}

	public List<Student> getMinMarksStd() {
		return sd.getMinMarksStd();
	}

	public List<Student> getTotalMarks() {
		return sd.getTotalMarks();
	}

	public List<Student> getAverageMarks() {
		return sd.getAverageMarks();
	}

	public List<Student> stdTotalCities() {

		return sd.stdTotalCities();
	}

	public ArrayList<Student> getStdMarksMoreThan50AndfromPuneonly() {
		List<Student> list = sd.getStdMarksMoreThan50AndfromPuneonly();
		ArrayList<Student> al = new ArrayList<>();
		for (Student student : list) {
			if (student.getAddress().equals("pune"))

				al.add(student);
		}
		return al;
	}

	public ArrayList<Student> getStdMarksMoreThan50AndfromPuneonlyAndSciStreamOnly() {
		List<Student> list = sd.getStdMarksMoreThan50AndfromPuneonlyAndSciStreamOnly();
		ArrayList<Student> al = new ArrayList<>();
		for (Student student : list) {
			if (student.getAddress().equals("pune") && student.getStream().equals("science"))
				al.add(student);
		}
		return al;
	}

	public ArrayList<Student> getStdMarksMoreThan50AndfromArtsACommerceStrOnly() {
		List<Student> list = sd.getStdMarksMoreThan50AndfromArtsACommerceStrOnly();
		ArrayList<Student> al = new ArrayList<>();
		for (Student student : list) {
			if (student.getStream().equals("arts") || student.getStream().equals("commerce"))
				al.add(student);
		}
		return al;
	}

}
