package com.codigo.commands;

public class AdelantoImpl implements IOperacion {

	private Cuenta cuenta;
	private double monto;

	public AdelantoImpl(Cuenta cuenta, double monto) {
		this.cuenta = cuenta;
		this.monto = monto;
	}

	@Override
	public void execute() {
		this.cuenta.Adelanto(this.monto);
	}

}