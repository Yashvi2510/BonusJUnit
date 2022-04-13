
public class Employee {

	private String name;
	private double hour;
	private double totalPay;
	public final static double HOURLY_RATE = 15;
	public final static double OVERTIME_RATE = 16.5;

	public double Employee(String name, double hour) {
		this.name = name;
		this.hour = hour;
		return totalPay;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHour() {
		return hour;
	}

	public void setHour(double hour) {
		this.hour = hour;
	}

	public double getTotalPay() {
		return totalPay;
	}

	public double setTotalPay(double hours) {

		if (hours > 40) {
			totalPay = OVERTIME_RATE * hours;
		} else {
			totalPay = HOURLY_RATE * hours;
		}
		return totalPay;
	}

}
