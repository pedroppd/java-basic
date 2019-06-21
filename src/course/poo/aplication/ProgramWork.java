package course.poo.aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import course.poo.entitys.Department;
import course.poo.entitys.HourContract;
import course.poo.entitys.Work;
import course.poo.enums.WorkLevel;

public class ProgramWork {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Entre com o nome do departamento: ");
		String departmentName = sc.nextLine();

		System.out.print("Entre com o nome do trabalhador: ");
		String workName = sc.nextLine();

		System.out.print("Entre com o level: ");
		String workLevel = sc.nextLine();

		System.out.print("Entre com o baseSalary: ");
		Double baseLevel = sc.nextDouble();

		Department department = new Department(departmentName);

		Work work = new Work(workName, WorkLevel.valueOf(workLevel), baseLevel, department);

		System.out.println("Quantos contratos esse trabalhor vai ter: ");
		Integer n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("entre com o " + i + " contrato: ");
			System.out.print("DATE(DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			Double valorPorHora = sc.nextDouble();
			System.out.print("Duração do contrato: ");
			Integer hours = sc.nextInt();
			HourContract contract = new HourContract(contractDate, valorPorHora, hours);
			work.addContract(contract);
		}
		System.out.println();
		
		System.out.print("Entre com o mês e o ano para calcular o salário (MM/yyyy): ");
		String monthAndYear = sc.next();
		
		int month =Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name: " + work.getName());
		System.out.println("Departamento: " + work.getDepartment().getName());
		System.out.printf("Ganho do mês "+monthAndYear+": %.2f",work.income(year, month));

		sc.close();
	}
}
