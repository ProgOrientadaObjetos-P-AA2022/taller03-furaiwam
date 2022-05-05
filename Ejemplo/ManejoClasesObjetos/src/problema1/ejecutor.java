package problema1;


public class ejecutor {
    public static void main(String[] args) {
        terreno ft = new terreno();
        // Valores de entrada
        double ancho = 67;
        double largo = 90;
        double valorMetro = 6000;
        //Asignacion de valores a los atributos
        ft.establecerLargo(largo);
        ft.establecerAncho(ancho);
        ft.establecerValorMetrosCuadrados(valorMetro);

        ft.calcularArea();
        ft.calcularCosto_terreno();

        // Se hace uso de los métodos obtener para presentar en pantalla lo
        // requerido
        System.out.printf("\nCosto del Terreno: $ %.2f \n",ft.obtenerCosto_terreno());

    }

}
