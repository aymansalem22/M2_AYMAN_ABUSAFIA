package classes;

public class AppMobile extends AppSoftware {

    private boolean usaHibrida;
    private String[] Permisos;

    public AppMobile() {
    }

    public AppMobile(boolean usaHibrida,String[]permios) {
        super();
        this.usaHibrida = usaHibrida;
        this.Permisos=permios;
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
        return "AppMobile{" + "usaHibrida=" + usaHibrida + ", Permisos=" + Permisos + '}';
    }

    
    
}
