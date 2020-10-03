package main;

import java.util.Calendar;
import java.util.Date;

public class User {
	
	private String firstname;
	private String lastname;
	private Integer age;
	private String email;
	private String status; //ACTIVE, INACTIVE, BLOCKED, NEW
	private Date timestamp;
	
	
	public User(String firstname, String lastname, Integer age, String email, String status) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.email = email;
		this.status = status;
		this.timestamp = Calendar.getInstance().getTime();
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(int date, int month, int year) {
		this.timestamp.setYear(year);
		this.timestamp.setMonth(month-1);
		this.timestamp.setDate(date);
	}

	@Override
	public String toString() {
		return "User [firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + ", email=" + email
				+ ", status=" + status + ", timestamp=" + timestamp + "]";
	}
}
