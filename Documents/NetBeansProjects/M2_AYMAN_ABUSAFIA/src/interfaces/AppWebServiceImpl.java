
package interfaces;

import classes.AppWeb;


public class AppWebServiceImpl implements AppWebService{

    @Override
    public AppWeb createApp() {
        AppWeb web1=new AppWeb("Spring", "Angular");
        return web1;
    }
    
}













