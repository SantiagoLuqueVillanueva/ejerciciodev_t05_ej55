public class App {
    public static void main(String[] args) throws Exception {
        int numeroIntroducido = Integer.parseInt(System.console().readLine("Introduzca un número: "));

        int ultimoDigito = numeroIntroducido % 10;
        int restoDelNumero = numeroIntroducido / 10;

        int multiplicador = 1;
        int aux = restoDelNumero;

        while (aux != 0) {
            multiplicador *= 10;
            aux /= 10;
        }

        int numeroFinal = (ultimoDigito * multiplicador) + restoDelNumero;

        System.out.println("El número resultado es: " + numeroFinal);
    }
}
