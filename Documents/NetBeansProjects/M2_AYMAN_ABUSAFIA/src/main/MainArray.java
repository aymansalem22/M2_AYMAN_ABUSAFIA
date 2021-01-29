package main;

import classes.AppIot;
import classes.AppMobile;
import classes.AppWeb;
import classes.EProtocols;
import java.util.Arrays;
import java.util.Scanner;

public class MainArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter tipo de operacion\n");
        int tipo_App = sc.nextInt();
        if (tipo_App == 1) {
            AppWeb[] webs = new AppWeb[2];
            for (int i = 0; i < 2; i++) {
                System.out.print("enter first object \n");
                String Y = sc.next();
                String Z = sc.next();
                webs[i] = new AppWeb(Y, Z);
                System.out.println(webs[i].toString());
            }

            // 
        } else if (tipo_App == 2) {

            AppMobile[] appMobiles = new AppMobile[2];
            
            

            for (int i = 0; i < appMobiles.length; i++) {
                System.out.print("usaHibrida: enter true or false for "+i+" object  \n");
                boolean Y = sc.nextBoolean();
                appMobiles[i] = new AppMobile(Y, perisoses());  
            } sc.close();
            for (AppMobile appMobile : appMobiles) {
                  System.out.println(appMobile.toString()); 
            }

            //se funciona a respecto igual se entra a  los items en  enum
        } else if (tipo_App == 3) {
            AppIot[] appIots = new AppIot[2];
            int i;
            for (i = 0; i < appIots.length; i++) {
                System.out.print("enter first object \n");
                boolean Y = sc.nextBoolean();
                boolean Z = sc.nextBoolean();
                EProtocols X = EProtocols.valueOf(sc.next());
                appIots[i] = new AppIot(Y, Z, X);
                System.out.println(appIots[i].toString());

            }

        } else {
            System.out.println("out of program!!");
        }

    }

    public static String[] perisoses() {
        Scanner sc = new Scanner(System.in);
        String[] per = new String[3];
        for (int i = 0; i < per.length; i++) {
            System.out.println("3 permisos for each object so enter " + i + " permisos");
            per[i] = sc.next();

        }
        return per;

    }

}

