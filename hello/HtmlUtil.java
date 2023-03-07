public class HtmlUtil {
	public static void main(String args[]) {
		System.out.println("Hello world.");
	}

}

	public Money calculatePay(Employee e) throws InvalidEmployeeType {
		switch (e.type) {
			case COMMISSIONED:
				return calculateCommissionedPay(e);
		case HOURLY:
				return calcualteHourlyPay(e);
			case SALARIED:
				return calculateSalaredPay(e);
			default:
				throw new InvalidEmployeeType(e.type);
		}
	}

	public abstract class Employee {
		public abstract boolean isPayday();

		public abstract Money calculatePay();

		public abstract void deliverPay(Money pay);
	}

	public interface EmployeeFactory {
		public Employee makeEmployee(EmployeeRecord r) throws InvalidEmployeeType;
	}

public class EmployeeFactoryImpl implements EmployeeFactory {
	public Employee makeEmployee(EmployeeRecord r) throws InvalidEmployeeType {
		switch (r.type) {
			case COMMISSIONED:
				return new CommissionedEmployee(r);
			case HOURLY:
				return new HourlyEmployee(r);
			case SALARIED:
				return new SalariedEmployee(r);
			default:
				throw new InvalidEmployeeType(r.type);
		}
	}
}