package course.poo.entitys;

import java.io.Serializable;
import java.util.Date;

public class HourContract implements Serializable{
	private static final long serialVersionUID = 1L;

	private Date data;
	
	private Double valuePerHour;
	
	private Integer hours;
	
	public HourContract(){
		
	}

	public HourContract(Date data, Double valuePerHour, Integer hours) {
		super();
		this.data = data;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}
	
	public Double totalValue() {
		return this.valuePerHour * this.hours;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	
	
	
}
