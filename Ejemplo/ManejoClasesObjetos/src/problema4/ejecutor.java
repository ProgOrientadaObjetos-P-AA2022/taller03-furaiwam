package problema4;


public class ejecutor {
    public static void main(String[] args) {
        equipoCelular ft = new equipoCelular();

        String sisteOpe="android";
        String tamaPant= "7";
        double costInic= 2000;
        double ivaPor= 0.12;
        String direMac= "01:3A:5D:67:9R";
        String infIMEI= "70153453450";


        ft.establecerSisteOpe(sisteOpe);
        ft.establecerTamaPant(tamaPant);
        ft.establecerCostInic(costInic);
        ft.establecerIvaPor(ivaPor);
        ft.establecerDireMac(direMac);
        ft.establecerInfIMEI(infIMEI);

        ft.calcularIvaCosICostFi();
        ft.calcularCostoFinal();

        //Presentacion en pantalla
        System.out.printf("\nEquipo Celular \n" + "\n Sistema Operativo : %s" +
                        "\n Tamaño de la Pantalla : %s in" + "\n Direccion MAC : %s" +
                        "\n Informacion IMEI : %s" + "\n Costo Inicial : $ %.2f" +
                        "\n Costo Final mas IVA : $ %.2f \n",ft.obtenerSisteOpe(),
                ft.obtenertamaPant(), ft.obtenerMac(), ft.obtenerInfIMEI(),
                ft.obtenerCostInic(), ft.obtenerCostoFinal());
    }
}

