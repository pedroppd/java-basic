package course.poo.exception.model.entity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import course.poo.exception.DomainException;

public class Reservation {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private Integer roomNumber;

	private Date checkin;

	private Date checkOut;

	public Reservation() {

	}

	public Reservation(Integer roomNumber, Date checkin, Date checkout) {
		if (!checkout.after(checkin)) {
			throw new DomainException("Erro");
		}
		this.roomNumber = roomNumber;
		this.checkin = checkin;
		this.checkOut = checkout;
	}

	public void updateDates(Date checkin, Date checkout) {
		Date now = new Date();
		if (checkin.before(now) || checkout.before(now)) {
			throw new DomainException("Erro");
		}

		if (!checkout.after(checkin)) {
			throw new DomainException("Erro");
		}
		this.checkin = checkin;
		this.checkOut = checkout;
	}

	// Calculando a duração em dias
	public Long duration() {
		Long diff = checkOut.getTime() - checkin.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckin() {
		return checkin;
	}

	public Date getCheckout() {
		return checkOut;
	}

	@Override
	public String toString() {
		return "Reservation [roomNumber=" + roomNumber + ", checkin=" + sdf.format(checkin) + ", checkOut="
				+ sdf.format(checkOut) + ", nights=" + duration() + "]";
	}

}
