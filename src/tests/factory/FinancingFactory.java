package tests.factory;

import entities.Financing;

public class FinancingFactory {

	public Financing creatFinancingEmpty() {

		return new Financing();

	}

	public Financing creatFinancing() {

		return new Financing(10000.0, 200.0, 80);

	}

	public Financing creatFinancingInvalid() {

		return new Financing(10000.0, 2000.0, 20);

	}

}
