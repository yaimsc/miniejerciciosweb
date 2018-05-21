package vista;

import java.util.Scanner;


public class DepartamentoVista extends Vista {

	public static final int LISTAR_GASTOS_DEPARTAMENTOS = 1;

	public void menu() {
		int opcion;
	
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println();
			System.out.println("- MENU DE GESTION DE DEPARTAMENTOS -");
			System.out.println("------------------------------------");
			System.out.println(LISTAR_GASTOS_DEPARTAMENTOS + " - listar departamentos con sus gastos");
			System.out.println(SALIR + " - salir");

			opcion = Integer.parseInt(scan.nextLine());
			switch (opcion) {
			case LISTAR_GASTOS_DEPARTAMENTOS:
				//TODO listar el nombre de todos los departametos con su gasto en sueldos
				
				break;

			default:
				break;
			}
		} while (opcion != SALIR);

	}

}
