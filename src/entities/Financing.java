package entities;

public class Financing {

	private Double totalAmount;
	private Double income;
	private Integer month;

	public Financing(Double totalAmount, Double income, Integer month) {
		this.totalAmount = totalAmount;
		this.income = income;
		this.month = month;
		validateFinancing(totalAmount, income, month);

	}

	public Financing() {
		// TODO Auto-generated constructor stub
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Double getIncome() {
		return income;
	}

	public void setIncome(Double income) {
		this.income = income;
	}

	public Integer getMonth() {
		return month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	public double entry() {

		return totalAmount * 0.2;

	}

	public double quota() {

		return (entry() - totalAmount) / month;

	}

	private void validateFinancing(Double totalAmount, Double income, Integer month) {
		// TODO Auto-generated method stub

		//0.8 pois ja vai ser dado 20% de entrada.
		if (totalAmount * 0.8 / month > income / 2.0) {
			throw new IllegalArgumentException("A parcela não pode ser maior que a metade da renda");
		}

	}

}
