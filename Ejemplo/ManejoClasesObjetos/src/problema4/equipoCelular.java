package problema4;

public class equipoCelular {
    private String sisteOpe;
    private String tamaPant;
    private double costInic;
    private double ivaPor;
    private double ivaCosICostFi;
    private double costoFinal;
    private String direMac;
    private String infIMEI;

    public void establecerSisteOpe(String c){
        sisteOpe = c;
    }

    public void establecerTamaPant(String c){
        tamaPant = c;
    }

    public void establecerCostInic(double c){
        costInic = c;
    }
    public void establecerIvaPor(double c){
        ivaPor = c;
    }
    public void calcularIvaCosICostFi(){
        ivaCosICostFi = costInic * ivaPor;
    }

    public void calcularCostoFinal(){
        costoFinal = costInic + ivaCosICostFi;

    }
    public void establecerDireMac(String c){
        direMac = c;
    }

    public void establecerInfIMEI(String c) {
        infIMEI = c;
    }


    public String obtenerSisteOpe(){
        return  sisteOpe;
    }
    public String obtenertamaPant(){
        return  tamaPant;
    }
    public double obtenerCostInic() {
        return costInic;
    }
    public double obtenerIvaPor(){
        return ivaPor;
    }

    public double obtenerIvaCostInicial(){
        return ivaCosICostFi;
    }
    public double obtenerCostoFinal(){
        return costoFinal;
    }
    public String obtenerMac(){
        return direMac;
    }

    public String obtenerInfIMEI(){
       return infIMEI;
    }
}

