package com.kiranacademy.cms.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kiranacademy.cms.entity.Student;

@Repository
public class StudentDao {
	@Autowired
	private SessionFactory sf;

	public List<Student> getAllStdData() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Student.class);
		List<Student> list = criteria.list();
		return list;

	}

	public String insertData(Student student) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.save(student);
		tr.commit();
		session.close();
		return "Data Inserted Successfully......!";
	}

	public String deleteData(int id) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Student s1 = session.load(Student.class, id);
		session.delete(s1);
		tr.commit();
		session.close();
		return "Successfully deleted......!";

	}

	public String updateData(int id) {
		Session session = sf.openSession();
		Student ss = session.load(Student.class, id);
		Transaction tr = session.beginTransaction();
		ss.setAddress("pune");
		ss.setMarks("88");
		session.update(ss);
		tr.commit();
		session.close();
		return "Successfully updated....!";

	}

	public List<Student> getMarksMoreThan50() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Student.class);
		criteria.add(Restrictions.gt("marks", "50"));
		List<Student> list = criteria.list();
		return list;
	}

	public List<Student> getStudentAgeLessthan20() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Student.class);
		criteria.add(Restrictions.lt("age", "20"));
		List<Student> list = criteria.list();
		return list;

	}

	public List<Student> getAB_BloodGroupStudent() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Student.class);
		criteria.add(Restrictions.eq("bloodgroup", "AB"));
		List<Student> list = criteria.list();
		return list;

	}

	public List<Student> getStdMarksBtwn60To90() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Student.class);
		criteria.add(Restrictions.between("marks", "50", "90"));
		List<Student> list = criteria.list();
		return list;

	}

	public List<Student> getStdOutOfPuneLoacation() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Student.class);
		criteria.add(Restrictions.ne("address", "pune"));
		List<Student> list = criteria.list();
		return list;

	}

	public List<Student> getNagarStdOnly() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Student.class);
		criteria.add(Restrictions.eq("address", "nagar"));
		List<Student> list = criteria.list();
		return list;

	}

	public List<Student> getMaxMarksStd() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Student.class);
		criteria.setProjection(Projections.max("marks"));
		List<Student> list = criteria.list();
		return list;

	}

	public List<Student> getMinMarksStd() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Student.class);
		criteria.setProjection(Projections.min("marks"));
		List<Student> list = criteria.list();
		return list;

	}

	public List<Student> getTotalMarks() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Student.class);
		criteria.setProjection(Projections.sum("marks"));
		List<Student> list = criteria.list();
		return list;

	}

	public List<Student> getAverageMarks() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Student.class);
		criteria.setProjection(Projections.avg("marks"));
		List<Student> list = criteria.list();
		return list;

	}

	public List<Student> stdTotalCities() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Student.class);
		criteria.setProjection(Projections.countDistinct("address"));
		List<Student> list = criteria.list();
		return list;

	}

	public List<Student> getStdMarksMoreThan50AndfromPuneonly() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Student.class);
		criteria.add(Restrictions.gt("marks", "50"));
		List<Student> list = criteria.list();
		return list;

	}

	public List<Student> getStdMarksMoreThan50AndfromPuneonlyAndSciStreamOnly() {

		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Student.class);
		criteria.add(Restrictions.gt("marks", "50"));
		List<Student> list = criteria.list();
		return list;

	}

	public List<Student> getStdMarksMoreThan50AndfromArtsACommerceStrOnly() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Student.class);
		criteria.add(Restrictions.gt("marks", "50"));
		List<Student> list = criteria.list();
		return list;

	}
}
