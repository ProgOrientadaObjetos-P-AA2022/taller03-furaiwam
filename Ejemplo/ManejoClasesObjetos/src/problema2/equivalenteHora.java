package problema2;

public class equivalenteHora {
    private double hora;
    private double minutos;
    private double segundos;
    private double dias;

    public void establecerHora(int c){
        hora = c;
    }

    public void calcularMinutos(){
        minutos = hora * 60;
    }

    public void calcularSegundos(){
        segundos = hora * 3600;
    }
    public void calcularDias(){
        dias = hora / 24;
    }

    public double obtenerHora(){
        return hora;
    }
    public double obtenerMinutos(){
        return minutos;
    }

    public double obtenerSegundos(){
        return segundos;
    }

    public double obtenerDias(){
        return  dias;
    }

}
