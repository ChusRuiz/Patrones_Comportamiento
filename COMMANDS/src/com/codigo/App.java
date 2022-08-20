package com.codigo;

import com.codigo.commands.AdelantoImpl;
import com.codigo.commands.Cuenta;
import com.codigo.commands.DepositarImpl;
import com.codigo.commands.Invoker;
import com.codigo.commands.RetirarImpl;

public class App {

	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(1, 500);

		DepositarImpl opDepositar = new DepositarImpl(cuenta, 200);
		RetirarImpl opRetirar = new RetirarImpl(cuenta, 100);
		AdelantoImpl opAdelanto = new AdelantoImpl(cuenta, 1000);
		
		Invoker ivk = new Invoker();
		ivk.recibirOperacion(opDepositar);
		ivk.recibirOperacion(opRetirar);
		ivk.recibirOperacion(opAdelanto);
		
		ivk.realizarOperaciones();
	}

}