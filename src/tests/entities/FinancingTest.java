package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;
import tests.factory.FinancingFactory;

public class FinancingTest {

	// Esta testando o metodo construtor
	@Test
	public void shouldTestWhetherTheConstructorSucess() {

		// Arrange
		Financing financing = FinancingFactory.creatFinancing();

		// Assert
		Assertions.assertEquals(100000.0, financing.getTotalAmount());
		Assertions.assertEquals(2000.0, financing.getIncome());
		Assertions.assertEquals(80, financing.getMonth());

	}

	// Esta testando o erro do metodo construtor
	@Test
	public void shouldTestWhetherTheConstructorFail() {

		// Assert
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			// Arrange
			Financing financing = FinancingFactory.creatFinancingInvalid();
		});

	}

	// Esta testando o metodo de entrada do financiamento
	@Test
	public void testShouldEntry() {

		// Arrange
		double entry = 20000;
		Financing financing = FinancingFactory.creatFinancing();

		// Act
		double result = financing.entry();

		// Asserts
		Assertions.assertEquals(entry, result);

	}

	// Este metodo vai testar o metodo set amount
	@Test
	public void shouldTestWhetherTheMethodSetAmountSucess() {

		// Arrange
		Financing financing = FinancingFactory.creatFinancing();
		financing.setTotalAmount(90000.0);

		// Asserts
		Assertions.assertEquals(90000.0, financing.getTotalAmount());

	}

	// Este metodo vai testar o metodo set income
	@Test
	public void shouldTestWhetherTheMethodSetIncomeSucess() {

		// Arrange
		double amount = 3000.0;
		Financing financing = FinancingFactory.creatFinancing();
		financing.setIncome(amount);

		Assertions.assertEquals(amount, financing.getIncome());

	}

	// Este metodo vai testar o metodo set month
	@Test
	public void shouldTestWhetherTheMethodSetMonthSucess() {

		// Arrange
		Financing financing = FinancingFactory.creatFinancing();
		financing.setMonth(90);

		Assertions.assertEquals(90, financing.getMonth());

	}

	// Vai testar o metodo quota que é referente a parcela
	@Test
	public void shouldTestWhetherTheMethodQuota() {

		// Arrange
		Financing financing = FinancingFactory.creatFinancing();
		
		//Act
		double result = financing.quota();
		
		Assertions.assertEquals(1000.0, result);
		
		

	}

}
