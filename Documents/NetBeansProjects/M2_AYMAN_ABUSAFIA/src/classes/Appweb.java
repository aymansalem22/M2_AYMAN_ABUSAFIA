package classes;


public class Appweb extends AppSoftware {
   private String backEnd;
   private String fronEnd;

   public Appweb(String X,String Y, String Z) {
        this.backEnd = Y;
        this.fronEnd = Z;
        super.setLenguajeDeProgramacion(X);
    }

    @Override
    public void tecnology() {
        
        System.out.println("The programming language used is "+ backEnd+" the backend framework is "+ fronEnd+ " and the frontend framework is "+ super.getLenguajeDeProgramacion());
      
      
    }
    
    
    
           
   
   
}
