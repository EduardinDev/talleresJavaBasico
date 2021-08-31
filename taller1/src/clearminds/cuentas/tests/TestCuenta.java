package clearminds.cuentas.tests;

import clearminds.cuentas.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		//creo el objeto cuenta y lo refiero con cuenta1
		Cuenta cuenta1 = new Cuenta("03476");
		
		//modifico el tipo de cuenta
		cuenta1.setSaldo(675);
		
		//creo el objeto cuenta y lo refiero con cuenta2
		Cuenta cuenta2 = new Cuenta("03476","C",98);
		
		//creo el objeto cuenta y lo refiero con cuenta3
		Cuenta cuenta3 = new Cuenta("03476");
		
		//modifico el tipo de cuenta
		cuenta3.setTipo("C");
		
		//imprimo cuenta1,cuenta2,cuenta3
		System.out.println("-------------Valores iniciales-------------\n");
		cuenta1.imprimirConMiEstilo();
		cuenta2.imprimirConMiEstilo();
		cuenta3.imprimirConMiEstilo();
		System.out.println("-------------Valores modificados-------------\n");
		
		cuenta1.setSaldo(444);
		cuenta3.setSaldo(567);
		cuenta2.setTipo("D");
		cuenta1.imprimirConMiEstilo();
		cuenta2.imprimirConMiEstilo();
		cuenta3.imprimirConMiEstilo();
		
		System.out.println("-------------Cuentas nuevas-------------\n");
		
		Cuenta cuenta4 = new Cuenta("0987","A",10);
		Cuenta cuenta5 = new Cuenta("0557","C",10);
		Cuenta cuenta6 = new Cuenta("0666");
		
		cuenta4.imprimirConMiEstilo();
		cuenta5.imprimirConMiEstilo();
		cuenta6.imprimirConMiEstilo();

	}

}
