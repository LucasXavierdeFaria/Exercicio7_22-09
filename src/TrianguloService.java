public class TrianguloService {
    // Verifica se os lados formam um triângulo válido
    public boolean isValido(Triangulo triangulo) {
        double a = triangulo.getLadoA();
        double b = triangulo.getLadoB();
        double c = triangulo.getLadoC();

        // Condição da existência de um triângulo: a soma de dois lados deve ser maior que o terceiro
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    // Calcula a área do triângulo usando a fórmula de Herão
    public double calcularArea(Triangulo triangulo) {
        if (!isValido(triangulo)) {
            throw new IllegalArgumentException("Os lados fornecidos não formam um triângulo válido.");
        }

        double a = triangulo.getLadoA();
        double b = triangulo.getLadoB();
        double c = triangulo.getLadoC();

        // Semiperímetro
        double s = (a + b + c) / 2;

        // Fórmula de Herão para área do triângulo
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
