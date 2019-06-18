package course.poo;

import java.io.Serializable;

public class Funcionario implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String name;
	private double grossSalari;
	private double tax;
	
	public Funcionario() {
		
	}
	
	public double netSalary() {
		return this.grossSalari -= tax;
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void increaseSalary(double porcentage) {
		double n = porcentage * this.grossSalari;
		this.grossSalari += n;
	}

	public double getGrossSalari() {
		return grossSalari;
	}

	public void setGrossSalari(double grossSalari) {
		this.grossSalari = grossSalari;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public Funcionario(String name, double grossSalari, double tax) {
		super();
		this.name = name;
		this.grossSalari = grossSalari;
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "Funcionario [name=" + name + ", grossSalari=" + grossSalari + ", tax=" + tax + "]";
	}
	
	
	
}
