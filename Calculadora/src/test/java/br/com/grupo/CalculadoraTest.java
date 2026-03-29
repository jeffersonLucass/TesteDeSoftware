package br.com.grupo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    void testSomaCorreta() {
        assertEquals(10.0, calculadora.somar(7.0, 3.0));
    }

    @Test
    void testSubtracaoCorreta() {
        assertEquals(4.0, calculadora.subtrair(7.0, 3.0));
    }

    @Test
    void testMultiplicacaoCorreta() {
        assertEquals(21.0, calculadora.multiplicar(7.0, 3.0));
    }

    @Test
    void testDivisaoCorreta() {
        assertEquals(2.5, calculadora.dividir(5.0, 2.0));
    }

    @Test
    void testDivisaoPorZeroLancaExcecao() {
        IllegalArgumentException excecao = assertThrows(
            IllegalArgumentException.class,
            () -> calculadora.dividir(10.0, 0)
        );
        assertEquals("Não é possível dividir por zero!", excecao.getMessage());
    }
}
