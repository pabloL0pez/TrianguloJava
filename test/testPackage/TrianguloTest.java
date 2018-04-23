package testPackage;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import trianguloPackage.Triangulo;

public class TrianguloTest {

	@Test
	public void noTrianguloSumaPrimerosIgualTerceroTest() {
		Assert.assertEquals("No es un triangulo", Triangulo.tipoTriangulo(1, 2, 3));
	}
	
	@Test
	public void noTrianguloSumaPrimerosIgualTerceroPermutandoTest() {
		Assert.assertEquals("No es un triangulo", Triangulo.tipoTriangulo(2, 1, 3));
	}
	
	@Test
	public void noTrianguloSumaPrimerosMenorTereceroTest() {
		Assert.assertEquals("No es un triangulo", Triangulo.tipoTriangulo(2, 1, 5));
	}
	
	@Test
	public void noTrianguloSumaPrimerosMenorTereceroPermutandoTest() {
		Assert.assertEquals("No es un triangulo", Triangulo.tipoTriangulo(1,2,6));
	}
	
	@Test
	public void equilateroValidoTest() {
		Assert.assertEquals("Es un triangulo equilatero", Triangulo.tipoTriangulo(2, 2, 2));
	}
	
	@Test
	public void isoscelesValidoTest() {
		Assert.assertEquals("Es un triangulo isosceles", Triangulo.tipoTriangulo(2, 2, 3));
	}
	
	@Test
	public void isocelesPermutado1Test() {
		Assert.assertEquals("Es un triangulo isosceles", Triangulo.tipoTriangulo(2, 3, 2));
	}
	
	@Test
	public void isocelesPermutado2Test() {
		Assert.assertEquals("Es un triangulo isosceles", Triangulo.tipoTriangulo(3, 2, 2));
	}
	
	@Test
	public void entradaNegativaTest() {
		Assert.assertEquals("No es un triangulo", Triangulo.tipoTriangulo(-1, -4, -10));
	}
	
	@Test
	public void entradaCharTest() {
		Assert.assertEquals("No es un triangulo", Triangulo.tipoTriangulo('A', 3, 5));
	}
	
	@Test
	public void entradaStringTest() {
		Assert.assertEquals("No es un triangulo", Triangulo.tipoTriangulo("Hola", "soy", "unestring"));
	}
	
	@Test
	public void entradaFloatTest() {
		Assert.assertEquals("No es un triangulo", Triangulo.tipoTriangulo(3.14, 2.17, "HOLA"));
	}
	
	@Test
	public void entradaEspecialTest() {
		Assert.assertEquals("No es un triangulo", Triangulo.tipoTriangulo('!', '$', '%'));
	}
	
	@Test
	public void entradaCerosTest() {
		Assert.assertEquals("No es un triangulo", Triangulo.tipoTriangulo(0, 0, 0));
	}
	
	@Test
	public void unaEntradaConCeroTest() {
		Assert.assertEquals("No es un triangulo", Triangulo.tipoTriangulo(0, 4, 5));
	}
	
	@Test
	public void entradaMal1Test() {
		Assert.assertEquals("No es un triangulo", Triangulo.tipoTriangulo(3, 3));
	}
	
	@Test
	public void entradaMal2Test() {
		Assert.assertEquals("No es un triangulo", Triangulo.tipoTriangulo(3, 3, 4, 5));
	}
}