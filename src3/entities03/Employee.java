package entities03;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double discount;
	
	public double netSalary() {
		return grossSalary - discount;
	}
	public void increaseSalary(double percentage) {
		this.grossSalary += (grossSalary * percentage / 100);
	}
	public String toString() {
		return name
				+ ", $"
				+ String.format("%.2f%n", netSalary());
	}

}
