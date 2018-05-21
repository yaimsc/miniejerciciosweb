package vista;

import java.util.Scanner;


public class CargoVista extends Vista {

	public static final int CAMBIAR_SUELDO = 1;
	public static final int LISTAR_CARGOS = 2;

	public void menu() {
		

		int opcion;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println();
			System.out.println("- MENU DE GESTION DE CARGOS -");
			System.out.println("-----------------------------");
			System.out.println(CAMBIAR_SUELDO + " - cambiar sueldo a cargo");
			System.out.println(LISTAR_CARGOS + " - listar cargos");
			System.out.println(SALIR + " - salir");

			opcion = Integer.parseInt(scan.nextLine());
			switch (opcion) {
			case CAMBIAR_SUELDO:
				// TODO cambiar sueldo del cargo
				break;
			case LISTAR_CARGOS:
				// TODO listar cargos en orden alfabetico
				break;
			default:
				break;
			}
		} while (opcion != SALIR);
	}

}
