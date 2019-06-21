package course.poo.entitys;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Calendar;
import java.util.List;

import course.poo.enums.WorkLevel;

public class Work implements Serializable {
	private static final long serialVersionUID = 1L;

	private String name;
	private WorkLevel level;
	private Double baseSalary;
	private Department department;
	private List<HourContract> contract = new ArrayList<>();
	
	public Work() {
	}
	
	public Work(String name, WorkLevel level, Double baseSalary, Department department) {
		super();
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
		
	}

	public void addContract(HourContract contract) {
		this.contract.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		this.contract.remove(contract);
	}
	
	public Double income(Integer year, Integer month) {
		Double sum = this.baseSalary;
		Calendar cal = Calendar.getInstance();
		
		for(HourContract c: this.contract) {
			cal.setTime(c.getData());
			
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);
			
			if(year == c_year && month == c_month) {
				sum += c.totalValue();
			}
			
		}
		return sum;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkLevel getLevel() {
		return level;
	}

	public void setLevel(WorkLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	@Override
	public String toString() {
		return "Work [name=" + name + ", level=" + level + ", baseSalary=" + baseSalary + "]";
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContract() {
		return contract;
	}



	

	
}
