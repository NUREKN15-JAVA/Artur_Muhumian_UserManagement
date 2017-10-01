package ua.nure.kn156.muhumian;

import java.util.Calendar;
import java.util.Date;


import junit.framework.TestCase;
import ua.nure.kn156.muhumian.User;

public class UserTest extends TestCase {
	private static final int AGE = 20;
	private User user;
	private Date date;
	
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		user = new User();
		Calendar calendar = Calendar.getInstance();
		calendar.set(1997, Calendar.JUNE, 12);
		date = calendar.getTime();
	}
	
	public void testGetFullName() {
		user.setFirstName("Artur");
		user.setLastName("Muhumian");
		assertEquals("Muhumian, Artur", user.getFullName());
		user.setFirstName(null);
		try {
			user.getFullName();
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        	assertEquals(e.getMessage(), "FirstName or LastName is null");
        }
	}

	public void testGetAge() {
		user.setDateOfBirthd(date);
		assertEquals(AGE, user.getAge());
	}

}
