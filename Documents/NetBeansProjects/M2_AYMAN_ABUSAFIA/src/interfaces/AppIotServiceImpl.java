
package interfaces;

import classes.AppIot;
import classes.EProtocols;


public class AppIotServiceImpl implements AppIotService{

    @Override
    public AppIot createAPP() {
     AppIot appiot=new AppIot(true, true, EProtocols.HTTP);
     return appiot;
    }
    
    
    
    
    
    
    
    
}
