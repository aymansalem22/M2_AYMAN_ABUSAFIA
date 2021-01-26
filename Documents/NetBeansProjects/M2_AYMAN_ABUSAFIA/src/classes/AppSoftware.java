package classes;


public abstract class AppSoftware {
//atributos
    private String lenguajeDeProgramacion;
    private boolean tiene_Datos;
    private double complejidad;
    private int codigoLineas;
    private int casosTest;

   

    public String getLenguajeDeProgramacion() {
        return lenguajeDeProgramacion;
    }

    public void setLenguajeDeProgramacion(String lenguajeDeProgramacion) {
        this.lenguajeDeProgramacion = lenguajeDeProgramacion;
    }

    public boolean isTiene_Datos() {
        return tiene_Datos;
    }

    public void setTiene_Datos(boolean tiene_Datos) {
        this.tiene_Datos = tiene_Datos;
    }

    public double getComplejidad() {
        return complejidad;
    }

    public void setComplejidad(double complejidad) {
        this.complejidad = complejidad;
    }

    public int getCodigoLineas() {
        return codigoLineas;
    }

    public void setCodigoLineas(int codigoLineas) {
        this.codigoLineas = codigoLineas;
    }

    public int getCasosTest() {
        return casosTest;
    }

    public void setCasosTest(int casosTest) {
        this.casosTest = casosTest;
    }

    public double calcularCalidad() {
        double valor = 100.00;
        if (complejidad < 20 && complejidad > 11) {
            valor = complejidad - 10;
        } else if (complejidad > 21 && complejidad < 50) {
            valor = complejidad - 30;
        } else if (complejidad >= 50) {
            valor = complejidad - 50;
        }
        if (codigoLineas > 5000 && casosTest < 3000) {
            valor = complejidad - 20;
        }
        return valor;
    }
    
    public void tecnology(){
        System.out.println("father clase");
    }
}
