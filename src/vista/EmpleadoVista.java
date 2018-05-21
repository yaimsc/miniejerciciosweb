package vista;


import java.util.Scanner;


public class EmpleadoVista extends Vista {

	public static final int ELIMINAR_EMPLEADO = 1;
	public static final int LISTAR_EMPLEADOS = 2;

	@Override
	public void menu() {
		
		int opcion;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println();
			System.out.println("- MENU DE GESTION DE EMPLEADOS -");
			System.out.println("--------------------------------");
			System.out.println(ELIMINAR_EMPLEADO + " - eliminar empleado");
			System.out.println(LISTAR_EMPLEADOS + " - listar empledos con departamento y cargo");
			System.out.println(SALIR + " - salir");

			opcion = Integer.parseInt(scan.nextLine());

			switch (opcion) {
			case ELIMINAR_EMPLEADO:
				//TODO pedir un dni y eliminar el empleado con ese dni
				
				break;

			case LISTAR_EMPLEADOS:
				//TODO listar todos los empleados con nombre de departamento y nobre de cargo
				
				break;

			default:
				break;
			}
		} while (opcion != SALIR);

	}

}
