package problema1;

public class terreno {
    private double costo_terreno;
    private double ancho;
    private double largo;
    private double area;
    private double valorMetrosCuadrados;


    public void calcularCosto_terreno(){

        costo_terreno= area * valorMetrosCuadrados;
    }

    public void establecerAncho(double c){
        ancho = c;
    }

    public void establecerLargo(double c){

        largo= c;
    }
    public void calcularArea(){
        area = ancho * largo;
    }

    // public void establecerValorFactura(){
    public void establecerValorMetrosCuadrados(double c){
        valorMetrosCuadrados = c;
    }

    public double obtenerCosto_terreno(){
        return costo_terreno;
    }

    public double obtenerAncho(){
        return ancho;
    }

    public double obtenerLargo(){
        return largo;
    }
    public double obtenerArea(){
        return area;
    }
    public double obtenerValorMetrosCuadrados() {
        return valorMetrosCuadrados;
    }

}