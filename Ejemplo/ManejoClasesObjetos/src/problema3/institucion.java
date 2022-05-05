package problema3;

public class institucion {
    private String nombre;
    private String tipoDeInstitucion;
    private int numeroDeAlumnos;
    private int numeroDeDocentes;
    private int nuDeSedes;
    private double gasProPoEstudia;
    private double presu;

    public void establecerNombre(String c){
        nombre = c;
    }

    public void establecerTipoDeAlumnos(String c){
        tipoDeInstitucion = c;
    }

    public void establecerNumeroDeAlumnos(int c){
        numeroDeAlumnos = c;
    }
    public void establecerNumeroDeDocentes(int c){
        numeroDeDocentes = c;
    }
    public void establecerNuDeSedes(int c){
        nuDeSedes = c;
    }
    public void establecerGasProPoEstudia(double c){
        gasProPoEstudia = c;
    }
    public void calcularPresupuesto(){
        presu = numeroDeAlumnos * gasProPoEstudia;
    }

    public String obtenerNombre(){
        return nombre;
    }
    public String obtenerTipoDeInstitucion(){
        return tipoDeInstitucion;
    }

    public int obtenerNumeroDeAlumnos(){
        return numeroDeAlumnos;
    }

    public int obtenerNumeroDeDocentes(){
        return  numeroDeDocentes;
    }
    public int obtenerNuDeSedes(){
        return  nuDeSedes;
    }
    public double obtenerGasProPoEstudia() {
        return gasProPoEstudia;
    }
        public double obtenerPresu(){
            return presu;
        }
}
