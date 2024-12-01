package control;

import junit.framework.TestCase;

import org.junit.Test;

public class CalculadoraImcTestes extends TestCase{

    @Test
    public void testCalculoImcAdultoPesoNormal() {
        CalculadoraImc calculadora = new CalculadoraImc();
        String resultado = calculadora.calcularImc(70, 1.75, 25, "M");
        assertEquals("Peso normal", resultado);
    }

    @Test
    public void testCalculoImcAdultoObesidadeGrauIII() {
        CalculadoraImc calculadora = new CalculadoraImc();
        String resultado = calculadora.calcularImc(120, 1.70, 40, "F");
        assertEquals("Obesidade grau III", resultado);
    }

    @Test
    public void testCalculoImcCriancaBaixoPeso() {
        CalculadoraImc calculadora = new CalculadoraImc();
        String resultado = calculadora.calcularImc(12, 0.95, 2, "F");
        assertEquals("Baixo peso", resultado);
    }

    @Test
    public void testCalculoImcCriancaPesoNormal() {
        CalculadoraImc calculadora = new CalculadoraImc();
        String resultado = calculadora.calcularImc(15, 1.00, 4, "M");
        assertEquals("Peso normal", resultado);
    }

    @Test
    public void testCalculoImcCriancaSobrepeso() {
        CalculadoraImc calculadora = new CalculadoraImc();
        String resultado = calculadora.calcularImc(25, 1.20, 8, "M");
        assertEquals("Sobrepeso", resultado);
    }

    @Test
    public void testIdadeNaoSuportada() {
        CalculadoraImc calculadora = new CalculadoraImc();
        try {
            calculadora.calcularImc(50, 1.60, 15, "F");
            fail("Deveria ter lançado IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Idade não suportada para cálculo de IMC.", e.getMessage());
        }
    }
}
