package model;

public class TimecardCalculations {

	private int hours;
	private int pay;
	private boolean overtime;

	public boolean isOvertime() {
		return overtime;
	}

	public void setOvertime(boolean overtime) {
		this.overtime = overtime;
	}

	public TimecardCalculations() {
		super();
		// TODO Auto-generated constructor stub

	}

	public TimecardCalculations(int hours) {
		super();
		this.hours = hours;
		this.pay = determinePay(hours);
		if(hours >= 41) {
			overtime = true;
		};
	}

	public int determinePay(int hours) {
		int totalPay = 0;
		if (hours <= 40) {
			totalPay = hours * 10;

		} else if (hours >= 41) {

			totalPay = hours * 20;

		}
		return totalPay;

	}
	
	public void setBonus(int bonus){
		this.pay = getPay() + bonus;
	}

	public void setHours(int hours) {
		// TODO Auto-generated method stub
		this.hours = hours;

	}

	public int getHours() {
		return hours;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	@Override
	public String toString() {
		return "TimecardCalculations [hours=" + hours + "]";
	}

}
