package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {

	@Test
	void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto() {
		BonusService service = new BonusService();
		
		//Receber EXCEÇÃO 01
//		assertThrows(IllegalArgumentException.class, () -> service.calcularBonus(new Funcionario("nome", 
//				LocalDate.now(), new BigDecimal("25000"))));
		
		
		// Receber EXCEÇÃO 02
		try {
			service.calcularBonus(new Funcionario("nome", 
					LocalDate.now(), new BigDecimal("2500")));
			fail("Não deu a exception");
		} catch(Exception ex) {
			
		}
	}
	@Test
	void bonusDeveriaSer10PorCentoDoSalario() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("nome",
				LocalDate.now(), new BigDecimal("2500")));
		assertEquals(new BigDecimal("250.0"), bonus);
	}
	@Test
	void bonusQuandoOBonusIgualA1000() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("nome",
				LocalDate.now(), new BigDecimal("10000")));
		assertEquals(new BigDecimal("1000.0"), bonus);
	}
}
