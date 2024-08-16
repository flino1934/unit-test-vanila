package tests.factory;

import entities.Financing;

public class FinancingFactory {

	public static Financing creatFinancing() {

		return new Financing(100000.0, 2000.0, 80);

	}

	public static Financing creatFinancingInvalid() {

		return new Financing(100000.0, 2000.0, 20);

	}

}
