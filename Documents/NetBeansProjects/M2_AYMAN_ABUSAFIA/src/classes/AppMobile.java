package classes;

import java.util.Arrays;
import java.util.Scanner;

public class AppMobile extends AppSoftware {

    private boolean usaHibrida;
    private String[] Permisos;

    public AppMobile() {
    }

    public AppMobile(boolean usaHibrida,String[]permios) {
        //super();
        this.usaHibrida = usaHibrida;
        this.Permisos=permios;
    }

    public boolean isUsaHibrida() {
        return usaHibrida;
    }

    public void setUsaHibrida(boolean usaHibrida) {
        this.usaHibrida = usaHibrida;
    }

    public String[] getPermisos() {
        return Permisos;
    }

    public void setPermisos(String[] Permisos) {
        this.Permisos = Permisos;
    }

    @Override
    public void tecnology() {
        if (usaHibrida == true) {
            System.out.println(getLenguajeDeProgramacion() + " utiliza tecnología híbrida");
        } else {
            System.out.println(getLenguajeDeProgramacion() + " utiliza tecnología nativa");
        }

    }

    @Override
    public String toString() {
        return "AppMobile{" + "usaHibrida=" + usaHibrida + ", Permisos=" + Arrays.toString(Permisos) + '}';
    }

    
}
 

