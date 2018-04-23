package trianguloPackage;

public class Triangulo {

	public static String tipoTriangulo(Object ...lados) {
		int[] ladosValid = new int[3];
		if (esTriangulo(lados)) { // Verifico que los lados ingresados formen un triangulo.
			for (int i = 0 ; i < 3 ; i++) {
				ladosValid[i] = (int) lados[i];
			}
			if (esEquilatero(ladosValid)) { // Veo primero si es triangulo equilatero.
				return "Es un triangulo equilatero";
			} else {
				if (esEscaleno(ladosValid)) { // Si no es triangulo equilatero, veo si es escaleno.
					return "Es un triangulo escaleno";
				} else {
					return "Es un triangulo isosceles"; // Si no es equilatero ni escaleno, entonces es isosceles.
				}
			}
		} else {
			return "No es un triangulo"; // No verifica condicion de triangulo, entonces no es un triangulo.
		}
	}

	private static boolean esTriangulo(Object[] lados) {
		int l1;
		int l2;
		int l3;
		if (lados.length == 3) { // Chequeo que se hayan ingresado tres lados.
			if (lados[0] instanceof Integer && lados[1] instanceof Integer && lados[2] instanceof Integer) { // Chequeo que los tres lados ingresados sean de tipo entero.
				l1 = (int) lados[0];
				l2 = (int) lados[1];
				l3 = (int) lados[2];
				return (l1 + l2) > l3 && (l1 + l3) > l2 && (l2 + l3) > l1; // Retorna true si se verifica la condicion de triangulo
			}
		}
		return false;
	}
	
	private static boolean esEquilatero(int[] lados) {
		return (lados[0] == lados[1]) && (lados[0] == lados[2]);
	}
	
	private static boolean esEscaleno(int[] lados) {

		return lados[0] != lados[1] && lados[1] != lados[2] && lados[0] != lados[2];
	}
}
