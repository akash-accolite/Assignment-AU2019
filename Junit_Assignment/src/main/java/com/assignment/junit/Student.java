package com.assignment.junit;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	@Id
	@Column(name="id")
	public int Id;
	
	@Column(name = "name")
	public String Name;
	
	@Column(name = "dob")
	public String  Dob;
	
	@Column(name = "percent")
	public int  Percent;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDob() {
		return Dob;
	}

	public void setDob(String dob) {
		this.Dob = dob;
	}

	public int getPercent() {
		return Percent;
	}

	public void setPercent(int percent) {
		Percent = percent;
	}

	
	
	
}
