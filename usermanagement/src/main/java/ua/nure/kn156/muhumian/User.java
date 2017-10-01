package ua.nure.kn156.muhumian;

import java.util.Date;

public class User {
	private Long id;
	private String firstName;
	private String latsName;
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
	public String getLatsName() {
		return latsName;
	}
	public void setLatsName(String latsName) {
		this.latsName = latsName;
	}
	public Date getDateOfBirthd() {
		return dateOfBirthd;
	}
	public void setDateOfBirthd(Date dateOfBirthd) {
		this.dateOfBirthd = dateOfBirthd;
	}
}
