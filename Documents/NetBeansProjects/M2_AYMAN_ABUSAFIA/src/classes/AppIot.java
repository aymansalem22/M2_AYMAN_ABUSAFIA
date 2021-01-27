package classes;


public class AppIot extends AppSoftware{

    private boolean tiene_Grafica;
    private boolean tiene_Wifi;
    private EProtocols e_Protcols;

    public AppIot() {
    }

    public AppIot(boolean tiene_Grafica, boolean tiene_Wifi, EProtocols e_Protcols) {
        this.tiene_Grafica = tiene_Grafica;
        this.tiene_Wifi = tiene_Wifi;
        this.e_Protcols = e_Protcols;
    }
    
    @Override
    public void tecnology() {
        
    }

    @Override
    public String toString() {
        return "ApploT{" + "tiene_Grafica=" + tiene_Grafica + ", tiene_Wifi=" + tiene_Wifi + ", e_Protcols=" + e_Protcols + '}';
    }
    
}
