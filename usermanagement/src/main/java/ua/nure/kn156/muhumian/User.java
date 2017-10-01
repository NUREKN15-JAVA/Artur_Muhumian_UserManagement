package ua.nure.kn156.muhumian;

import java.util.Calendar;
import java.util.Date;

public class User {
	private Long id;
	private String firstName;
	private String lastName;
	private Date dateOfBirthd;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String latsName) {
		this.lastName = latsName;
	}
	public Date getDateOfBirthd() {
		return dateOfBirthd;
	}
	public void setDateOfBirthd(Date dateOfBirthd) {
		this.dateOfBirthd = dateOfBirthd;
	}
	
	public String getFullName() {
		if (getLastName() == null || getFirstName() == null) throw new IllegalArgumentException("FirstName or LastName is null");
		return new StringBuilder(getLastName()).append(", ").append(getFirstName()).toString();
	}
	public long getAge() {
		Calendar calendar = Calendar.getInstance();
		long currentYear = calendar.get(Calendar.YEAR);
		calendar.setTime(getDateOfBirthd());
		long yearOfBirth = calendar.get(Calendar.YEAR);
		return currentYear - yearOfBirth;
	}
}
