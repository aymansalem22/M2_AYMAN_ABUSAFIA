
package main;


import classes.AppIot;
import classes.AppMobile;
import classes.AppWeb;
import interfaces.AppIotServiceImpl;
import interfaces.AppMobileServiceImpl;
import interfaces.AppWebServiceImpl;

public class Main {
    public static void main(String[] args) {
        
        //1.
       AppWebServiceImpl appWebServiceImpl=new AppWebServiceImpl();
       AppWeb appweb= appWebServiceImpl.createApp();
       appweb.setLenguajeDeProgramacion("C++");
       appweb.tecnology();
        System.out.println(appweb.toString());
        
        //2.
        AppMobileServiceImpl appMobileServiceImpl=new AppMobileServiceImpl();
        AppMobile appmobile=appMobileServiceImpl.createAPP();
       System.out.println(appmobile.toString());
       
       //3
       AppIotServiceImpl appIotServiceImpl=new AppIotServiceImpl();
       AppIot appiot=appIotServiceImpl.createAPP();
        System.out.println(appiot.toString());
    }
  
}












