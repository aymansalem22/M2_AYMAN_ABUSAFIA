
package interfaces;

import classes.AppMobile;


public class AppMobileServiceImpl implements AppMobileService{

    @Override
    public AppMobile createAPP() {
     String[] permis={"camera","micrfono","ubicación"};
     AppMobile appmobile=new AppMobile(true, permis);
     
     return appmobile;
    }
    
}












