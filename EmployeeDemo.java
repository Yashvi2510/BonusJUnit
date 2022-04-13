import java.util.Scanner;

public class EmployeeDemo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Employee em = new Employee();
System.out.println("enter name:");
String name=input.nextLine();
System.out.println("enter hours:");
double hour=input.nextDouble();
System.out.println(em.setTotalPay(hour));
	}

}
