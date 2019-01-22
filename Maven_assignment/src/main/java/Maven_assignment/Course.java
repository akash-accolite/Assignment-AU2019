package Maven_assignment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
	@Table(name="course")
	public class Course {
		
		@Id
		@Column(name="courseId")
		@GeneratedValue(strategy=GenerationType.AUTO)
		public int courseId;
		
		@Column(name="courseName")
		public String courseName;
		
		@Column(name="id")
		public int id;

		public int getCourseId() {
			return courseId;
		}

		public void setCourseId(int courseId) {
			this.courseId = courseId;
		}

		public String getCourseName() {
			return courseName;
		}

		public void setCourseName(String courseName) {
			this.courseName = courseName;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		

	
	}



