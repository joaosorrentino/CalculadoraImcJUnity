package control;

public class CalculadoraImc {

    public String calcularImc(double peso, double altura, int idade, String sexo) {
        if (idade >= 2 && idade <= 12) {
            return calcularImcCrianca(peso, altura, idade, sexo);
        } else if (idade > 18) {
            return calcularImcAdulto(peso, altura);
        } else {
            throw new IllegalArgumentException("Idade não suportada para cálculo de IMC.");
        }
    }

    private String calcularImcAdulto(double peso, double altura) {
        double imc = peso / (altura * altura);

        if (imc < 16) {
            return "Baixo peso muito grave";
        } else if (imc < 17) {
            return "Baixo peso grave";
        } else if (imc < 18.5) {
            return "Baixo peso";
        } else if (imc < 25) {
            return "Peso normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else if (imc < 35) {
            return "Obesidade grau I";
        } else if (imc < 40) {
            return "Obesidade grau II";
        } else {
            return "Obesidade grau III";
        }
    }

    private String calcularImcCrianca(double peso, double altura, int idade, String sexo) {
        double imc = peso / (altura * altura);
        // Exemplos de lógica para faixas de IMC para crianças, com base na idade e sexo
        if (idade == 2) {
            return (imc < 14.5) ? "Baixo peso" : (imc <= 18) ? "Peso normal" : "Sobrepeso";
        } else if (idade == 4) {
            return (imc < 14) ? "Baixo peso" : (imc <= 17) ? "Peso normal" : "Sobrepeso";
        } else if (idade == 6) {
            return (imc < 14.5) ? "Baixo peso" : (imc <= 18) ? "Peso normal" : "Sobrepeso";
        } else if (idade == 8) {
            return (imc < 15) ? "Baixo peso" : (imc <= 19) ? "Peso normal" : "Sobrepeso";
        } else if (idade == 10) {
            return (imc < 15.5) ? "Baixo peso" : (imc <= 20) ? "Peso normal" : "Sobrepeso";
        } else if (idade == 12) {
            return (imc < 16) ? "Baixo peso" : (imc <= 21) ? "Peso normal" : "Sobrepeso";
        } else {
            throw new IllegalArgumentException("Idade não suportada.");
        }
    }
}

