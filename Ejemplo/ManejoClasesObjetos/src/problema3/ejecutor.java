package problema3;

public class ejecutor {
    public static void main(String[] args) {
        institucion ft = new institucion();

        String nombre="Unidad Educativa Adolfo Valarezo";
        String tipoDeInstitucion= "fiscomisional";
        int numeroDeAlumnos= 2000;
        int numeroDeDocentes= 80;
        int nuDeSedes= 30;
        double gasProPoEstudia= 70.10;

        ft.establecerNombre(nombre);
        ft.establecerTipoDeAlumnos(tipoDeInstitucion);
        ft.establecerNumeroDeAlumnos(numeroDeAlumnos);
        ft.establecerNumeroDeDocentes(numeroDeDocentes);
        ft.establecerNuDeSedes(nuDeSedes);
        ft.establecerGasProPoEstudia(gasProPoEstudia);

        ft.calcularPresupuesto();

        //Presentacion en pantalla
        System.out.printf("\nNombre : %s" + "\nTipo de institución : %s" +
                        "\nNúmero de alumnos : %d" + "\nNumero de docentes : %d" +
                        "\nNúmero de sedes : %d" + "\nGastos por estudiante : $ %.2f" +
                        "\nPresupuesto : $ %.2f \n",ft.obtenerNombre(), ft.obtenerTipoDeInstitucion(),
                ft.obtenerNumeroDeAlumnos(), ft.obtenerNumeroDeDocentes(),ft.obtenerNuDeSedes(),
                ft.obtenerGasProPoEstudia(), ft.obtenerPresu());
    }
}

