public class IMC {
    public static void main(String[] args) {
        double peso = 94;
        double altura = 1.73;

        double imc = peso / (altura * altura);
        System.out.printf("Seu IMC é: %.2f\n", imc);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc < 24.9) {
            System.out.println("Peso normal");
        } else if (imc < 29.9) {
            System.out.println("Sobrepeso");
        } else if (imc < 34.9) {
            System.out.println("Obesidade grau 1");
        } else if (imc < 39.9) {
            System.out.println("Obesidade grau 2");
        } else {
            System.out.println("Obesidade grau 3 (grave)");
        }
    }
}
