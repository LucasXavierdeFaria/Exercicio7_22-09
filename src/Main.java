public class Main {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(3, 4, 5);
        TrianguloService trianguloService = new TrianguloService();

        if (trianguloService.isValido(triangulo)) {
            double area = trianguloService.calcularArea(triangulo);
            System.out.println("Área do triângulo: " + area);
        } else {
            System.out.println("Os lados fornecidos não formam um triângulo válido.");
        }
    }
}
