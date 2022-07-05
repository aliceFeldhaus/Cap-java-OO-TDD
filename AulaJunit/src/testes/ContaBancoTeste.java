package testes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entidades.ContaBanco;

public class ContaBancoTeste {

	ContaBanco conta;
	double saldoAtual = 0;
	
	@BeforeEach
	public void setup() {
		conta = new ContaBanco(1, 200);
		saldoAtual = conta.getSaldo();
	}
	
	@Test
	public void lancaExceptionQuandoValorDepositadoForNegativo() {
		double valorDepositado = -10;
		
		Exception ex = Assertions.assertThrows(Exception.class, () -> conta.depositar(valorDepositado));
		Assertions.assertTrue(ex.getMessage().contains("O deposito não pode ser negativo"));
	}
	
	//depositar
	
	@Test
	public void aumetaSaldoQuandoDeposita() throws Exception {

		double saldoAtual = conta.getSaldo();

		double valorDepositado = 100;
		conta.depositar(valorDepositado);
		double novoSaldo = conta.getSaldo();

		Assertions.assertTrue(novoSaldo > saldoAtual);
	}

	//sacar valor disponivel
	
	@Test
	public void diminuiQuandoSacarValorComSaldoSuficiente() throws Exception {

		double saldoAtual = conta.getSaldo();
		double valorSacado = 50;

		conta.sacar(valorSacado);
		double novoSaldo = conta.getSaldo();
		
		Assertions.assertTrue((saldoAtual - valorSacado) == novoSaldo);
	}

	//tentar sacar valor que não possui na conta
	
	@Test
	public void lancaExceptionQuandoValorSaqueMaiorQueSaldo() {
		
		double valorSacado = 201;
		
		Exception ex = Assertions.assertThrows(Exception.class, () -> conta.sacar(valorSacado));
		Assertions.assertTrue(ex.getMessage().contains("Saldo insuficiente"));
		
	}
	
}
