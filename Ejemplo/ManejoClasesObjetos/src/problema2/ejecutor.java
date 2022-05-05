package problema2;

import problema2.equivalenteHora;
public class ejecutor {
    public static void main(String[] args) {
        equivalenteHora ft = new equivalenteHora();
        // Valores de entrada
        int horas = 24;

        ft.establecerHora(horas);
        ft.calcularMinutos();
        ft.calcularSegundos();
        ft.calcularDias();

        System.out.printf("Cantidad de horas : %.2f" + "\n Minutos : %.2f" + "\n Segundos : %.2f" + "\n Días : %.2f \n",
                ft.obtenerHora(),ft.obtenerMinutos(),ft.obtenerSegundos(),
                ft.obtenerDias());
    }
}

