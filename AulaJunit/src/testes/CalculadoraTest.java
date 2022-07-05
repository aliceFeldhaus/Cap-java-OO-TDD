package testes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entidades.Calculadora;

public class CalculadoraTest {

	//AAA
	
	//Arrange
	@Test
	public void resultadoQuandoSubtrair() {
		Calculadora calculadora = new Calculadora();
		
	//Ação
		double n1 = 5;
		double n2 = 3;
		
	//Assert
		double valorEsperado = 2;
		double valorRetornado = calculadora.subtrair(n1, n2);
		Assertions.assertEquals(valorEsperado, valorRetornado);
	}
	
	@Test
	public void resultadoQuandoMultiplicar() {
		Calculadora calculadora = new Calculadora();
		
		double valor = 2.0;
		double multiplicador = 2.0;

		double valorEsperado =4.0;
		double valorRetornado = calculadora.multiplicar(valor, multiplicador);
		Assertions.assertEquals(valorEsperado, valorRetornado);
	}
	
	@Test
	public void resultadoQuandoSomar() {
		Calculadora calculadora = new Calculadora();
	
		double resultado = calculadora.somar(5.0, 5.0);
		double valorEsperado = 10.0;
	
		Assertions.assertEquals(valorEsperado, resultado);
	}
	
	@Test
	public void resultadoQuandoDividir() throws Exception {
		Calculadora calculadora = new Calculadora();
		
		double dividendo = 20.0;
		double divisor = 4.0;
		
		double valorEsperado = 5.0;
		double valorRetornado = calculadora.dividir(dividendo, divisor);
		Assertions.assertEquals(valorEsperado, valorRetornado);
	}
	
	@Test
	public void resultadoQuandoZero() {
		Calculadora calculadora = new Calculadora();
		
		double dividendo = 10.0;
		double divisor = 0.0;
		
		Exception ex = Assertions.assertThrows(Exception.class, () -> calculadora.dividir(dividendo, divisor));
		Assertions.assertTrue(ex.getMessage().contains("Não é possivel dividir por zero."));
	}
	
}
