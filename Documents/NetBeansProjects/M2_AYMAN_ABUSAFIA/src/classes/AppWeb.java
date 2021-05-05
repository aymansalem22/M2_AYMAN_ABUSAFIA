package classes;


public class AppWeb extends AppSoftware {
   private String backEnd;
   private String fronEnd;

 

   public AppWeb(String Y, String Z) {
         super();
        this.backEnd = Y;
        this.fronEnd = Z;
        
    }

    @Override
    public void tecnology() {
        //use cconcat string 
        String info="The programming language used is :".concat(super.getLenguajeDeProgramacion())+"\n the backend framework is : ".concat(backEnd)+"\nand the frontend framework is :".concat(fronEnd);
        System.out.println(info);
      
      
    }

    @Override
    public String toString() {
        return "AppWeb{" + "backEnd=" + backEnd + ", fronEnd=" + fronEnd + '}';
    }
    
    
    
           
   
   
}
