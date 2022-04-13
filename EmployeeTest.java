import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTest {

	@Test
	void testEmployee() {
		Employee em = new Employee();
		em.setName("yashvi");
		em.setHour(30);
		assertEquals(450, em.setTotalPay(30));
	}

}
