import java.util.Scanner;

public class index {

	final static int MIN_NUSS = 100000;
	final static int MAX_NUSS = 999999;

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char optionMenu = '\0';
		boolean verificador_1 = false;
		boolean verificador_2 = false;
		int nuss = 0;
		byte sintoma = 0;
		byte exploracion = 0;
		byte nivelPrioridad = 0;
		float temperaturaActual = 0;

		System.out.print("\033[H\033[2J");
		System.out.print("Hola, introduzca cualquier tecla para continuar y registrar al paciente o introduzca '0' para salir ---> ");
		optionMenu = sc.next().charAt(0);
		while (optionMenu != '0') {
			System.out.print("\033[H\033[2J");
			do {
				System.out.print("Introduzca el número de seguridad social del paciente: ");
				verificador_1 = sc.hasNextInt();
				System.out.print("\033[H\033[2J");
				if (verificador_1) {
					nuss = sc.nextInt();
					if (nuss < MIN_NUSS || nuss > MAX_NUSS) {
						System.out.println("El número que ha introducido no es correcto\n¡ASÍ QUE POR FAVOR!");
					}
				} else {
					System.out.println("No sea boludo introduzca un número de verdad maldito neandertal");
					sc.nextLine();
				}
			} while ((nuss < MIN_NUSS || nuss > MAX_NUSS) || !verificador_1);
			do {
				System.out.print("¿Cuál es el síntoma?:\n\tDolor (0)\n\tLesión traumática (1)\n\tFiebre alta (2)\n\tConfusión o desorientación (3)\n: ");
				verificador_1 = sc.hasNextByte();
				System.out.print("\033[H\033[2J");
				if (verificador_1) {
					sintoma = sc.nextByte();
					switch (sintoma) {
						case 0:
							do {
								System.out.print("¿Exploración?\n\tDolor torácico (0)\n\tDolor abdominal (1)\n\tDolor de cabeza (2)\n\tMigraña (3)\n:");
								verificador_2 = sc.hasNextByte();
								System.out.print("\033[H\033[2J");
								if (verificador_2) {
									exploracion = sc.nextByte();
									if (exploracion < 0 || exploracion > 3) {
										System.out.println("La opción " + exploracion + " no existe, por favor introduzca una opción válida");
									}
								}
								else {
									System.out.println("Joder es que la gente... ¿Qué parte de introduzca un numero no entiende?");
									sc.nextLine();
								}
							} while ((exploracion < 0 || exploracion > 3) || !verificador_2);
							break;
						case 1:
							do {
								System.out.print("¿Exploración?\n\tFractura ósea (0)\n\tHerida de bala (1)\n\tQuemadura (2)\n\tLesión cerebral traumática (3)\n:");
								verificador_2 = sc.hasNextByte();
								System.out.print("\033[H\033[2J");
								if (verificador_2) {
									exploracion = sc.nextByte();
									if (exploracion < 0 || exploracion > 3) {
										System.out.println("La opción " + exploracion + " no existe, por favor introduzca una opción válida");
									}
								}
								else {
									System.out.print("Joder es que la gente... ¿Qué parte de introduzca un numero no entiende?");
									sc.nextLine();
								}
							} while ((exploracion < 0 || exploracion > 3) || !verificador_2);
							break;
						case 2:
							do {
								System.out.print("¿Exploración?\n\tNeumonía (0)\n\tMeningitis (1)\n\tInfección viral (2)\n\tReacción alérgica (3)\n:");
								verificador_2 = sc.hasNextByte();
								System.out.print("\033[H\033[2J");
								if (verificador_2) {
									exploracion = sc.nextByte();
									if (exploracion < 0 || exploracion > 3) {
										System.out.println("La opción " + exploracion + " no existe, por favor introduzca una opción válida");
									}
								}
								else {
									System.out.println("Joder es que la gente... ¿Qué parte de introduzca un numero no entiende?");
									sc.nextLine();
								}
							} while ((exploracion < 0 || exploracion > 3) || !verificador_2);
							break;
						case 3:
							do {
								System.out.print("¿Exploración?\n\tIntoxicación por drogas o alcohol (0)\n\tDeshidratación severa (1)\n\tAccidente cerebrovascular (2)\n\tHipoglucemia severa (3)\n:");
								verificador_2 = sc.hasNextByte();
								System.out.print("\033[H\033[2J");
								if (verificador_2) {
									exploracion = sc.nextByte();
									if (exploracion < 0 || exploracion > 3) {
										System.out.println("La opción " + exploracion + " no existe, por favor introduzca una opción válida");
									}
								}
								else {
									System.out.println("Joder es que la gente... ¿Qué parte de introduzca un numero no entiende?");
									sc.nextLine();
								}
							} while ((exploracion < 0 || exploracion > 3) || !verificador_2);
							break;
						default:
							System.out.println("La opción " + sintoma + " no existe, por favor introduzca una opción válida");
							break;
					}
				} else {
					System.out.println("¿Te tengo que enseñar lo que es un número válido?");
					sc.nextLine();
				}
			} while ((sintoma < 0 || sintoma > 3) || !verificador_1);
			do {
				System.out.print("¿Nivel de prioridad?\n:");
				verificador_1 = sc.hasNextByte();
				System.out.print("\033[H\033[2J");
				if (verificador_1) {
					nivelPrioridad = sc.nextByte();
					if (nivelPrioridad < 0 || nivelPrioridad > 5) {
						System.out.println("El nivel de proridad " + nivelPrioridad + " no existe, por favor introduzca un valor correcto");
					}
				}
				else {
					System.out.println("Por eso es que la humanidad está como está. Introduzca un número por favor");
					sc.nextLine();
				}
			} while ((nivelPrioridad < 0 || nivelPrioridad > 5) || !verificador_1);
			do {
				System.out.print("¿Temperatura actual?\n:");
				verificador_1 = sc.hasNextFloat();
				System.out.print("\033[H\033[2J");
				if (verificador_1) {
					temperaturaActual = sc.nextFloat();
					if (temperaturaActual < 27 || temperaturaActual > 45) {
						System.out.println("Esa temperatura no es normal hermano, o introduce una temperatura real o me temo decirle que la persona con número de seguridad social " + nuss + " ya fue con San Pedro");
					}
				}
				else {
					System.out.println("Por favor, introduzca un número de temperatura válido y después de utilizar este programa busque ayuda mental se lo suplico");
					sc.nextLine();
				}
			} while ((temperaturaActual < 27 || temperaturaActual > 45) || !verificador_1);
			System.out.println("El paciente ha sido registrado con los siguientes datos\n\nNUSS: " + nuss);
			switch (sintoma) {
				case 0:
					System.out.println("Síntoma: Dolor");
					switch (exploracion) {
						case 0:
							System.out.println("Exploración: Dolor torácico");
							break;
						case 1:
							System.out.println("Exploración: Dolor abdominal");
							break;
						case 2:
							System.out.println("Exploración: Dolor de cabeza");
							break;
						case 3:
							System.out.println("Exploración: Migraña");
							break;
					}
					break;
				case 1:
					System.out.println("Síntoma: Lesión traumática");
					switch (exploracion) {
						case 0:
							System.out.println("Exploración: Fractura ósea");
							break;
						case 1:
							System.out.println("Exploración: Herida de bala");
							break;
						case 2:
							System.out.println("Exploración: Quemadura");
							break;
						case 3:
							System.out.println("Exploración: Lesión cerebral traumática");
							break;
						}
						break;
				case 2:
					System.out.println("Síntoma: Fiebre alta");
					switch (exploracion) {
						case 0:
							System.out.println("Exploración: Neumonía");
							break;
						case 1:
							System.out.println("Exploración: Meningitis");
							break;
						case 2:
							System.out.println("Exploración: Infección viral");
							break;
						case 3:
							System.out.println("Exploración: Reacción alérgica");
							break;
					}
					break;
				case 3:
					System.out.println("Síntoma: Confusión o desorientación");
					switch (exploracion) {
						case 0:
							System.out.println("Exploración: Intoxicación por drogas o alcohol");
							break;
						case 1:
							System.out.println("Exploración: Deshidratación severa");
							break;
						case 2:
							System.out.println("Exploración: Accidente cerebrovascular");
							break;
						case 3:
							System.out.println("Exploración: Hipoglucemia severa");
							break;
					}
					break;
			}
			System.out.println("Nivel de prioridad: " + nivelPrioridad);
			System.out.println("Temperatura actual: " + temperaturaActual);
			System.out.print("\nSi quiere registrar otro paciente introduzca cualquier tecla para continuar o introduzca '0' para salir... ");
			optionMenu = sc.next().charAt(0);
		}
		System.out.println("\n\nHasta la próxima amiguito");
		sc.close();
	}
}