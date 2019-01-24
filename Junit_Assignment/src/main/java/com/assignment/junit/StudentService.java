package com.assignment.junit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentService {
	public StudentDao dao;

	public StudentDao getDao() {
		return dao;
	}

	public void setDao(StudentDao dao) {
		this.dao = dao;
	}

	public List<StudentRank> getRankList(List<Student> studentList) {
		
		Collections.sort(studentList, new ComparatorPercent());
		List<StudentRank> studentRankList= new ArrayList<StudentRank>();
		
		int student_rank = 0;
		for (Student s : studentList) {
			student_rank++;
			StudentRank rank = new StudentRank();
			rank.setStudentRank(student_rank);
			rank.setStudentId(s.getId());
			rank.setStudentName(s.getName());
			rank.setDob(s.getDob());
			rank.setMarks(s.getPercent());
			studentRankList.add(rank);
		}
		
		return studentRankList;
	}

}
