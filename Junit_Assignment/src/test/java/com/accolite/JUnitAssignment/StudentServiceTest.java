package com.accolite.JUnitAssignment;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.assignment.junit.Student;
import com.assignment.junit.StudentDao;
import com.assignment.junit.StudentRank;
import com.assignment.junit.StudentService;

public class StudentServiceTest {
	public StudentService service;
	
	public StudentDao studentMock;
	
	@Before
	public void setup() {
		service=new StudentService();
		studentMock = Mockito.mock(StudentDao.class);
		service.setDao(studentMock);
	}
	
	@Test
	public void testRankStudents() {
		List<Student> students=new  ArrayList<Student>();
		students.add(new Student());
		students.get(0).setName("Akash");;
		students.get(0).setPercent(87);
		students.get(0).setDob("11-7-1996");
		students.get(0).setId(1);
		
		students.add(new Student());
		students.get(1).setName("mayank");;
		students.get(1).setPercent(87);
		students.get(1).setDob("19-10-1997");
		students.get(1).setId(2);
		
		students.add(new Student());
		students.get(2).setName("neha");;
		students.get(2).setPercent(77);
		students.get(2).setDob("3-9-1996");
		students.get(2).setId(3);
		
		students.add(new Student());
		students.get(3).setName("gaurav vats");;
		students.get(3).setPercent(93);
		students.get(3).setDob("7-1-1995");
		students.get(3).setId(4);
		
		
		
		Mockito.when(studentMock.getStudents()).thenReturn(students);
		
		List<StudentRank> studentRank=service.getRankList(students);
		
		assertEquals(4,studentRank.size());
		;
		assertEquals("gaurav vats",studentRank.get(0).getStudentName());
		assertEquals("Akash",studentRank.get(1).getStudentName());
		assertEquals("mayank",studentRank.get(2).getStudentName());
		assertEquals("neha",studentRank.get(3).getStudentName());
		
		
	}
	
	@Test
	public void RankingTheSameMarks() {
		List<Student> students=new  ArrayList<Student>();
		students.add(new Student());
		students.get(0).setName("Akash");;
		students.get(0).setPercent(87);
		students.get(0).setDob("11-7-1996");
		students.get(0).setId(1);
		
		students.add(new Student());
		students.get(1).setName("mayank");;
		students.get(1).setPercent(87);
		students.get(1).setDob("19-10-1997");
		students.get(1).setId(2);
		
		students.add(new Student());
		students.get(2).setName("neha");;
		students.get(2).setPercent(77);
		students.get(2).setDob("3-9-1996");
		students.get(2).setId(3);
		
		students.add(new Student());
		students.get(3).setName("gaurav vats");;
		students.get(3).setPercent(93);
		students.get(3).setDob("7-1-1995");
		students.get(3).setId(4);
		
		
		
		Mockito.when(studentMock.getStudents()).thenReturn(students);
		
		List<StudentRank> Rank=service.getRankList(students);
		
		assertEquals(4,Rank.size());
		assertEquals(1,Rank.get(0).getStudentRank());
		assertEquals("gaurav vats",Rank.get(0).getStudentName());
		assertEquals("Akash",Rank.get(1).getStudentName());
		assertEquals("mayank",Rank.get(2).getStudentName());
		assertEquals("neha",Rank.get(3).getStudentName());
		

	}

}
