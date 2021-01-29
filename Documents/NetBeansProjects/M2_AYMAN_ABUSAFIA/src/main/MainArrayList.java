/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import classes.AppIot;
import classes.AppMobile;
import classes.AppWeb;
import classes.EProtocols;
import interfaces.AppWebServiceImpl;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sayma
 */
public class MainArrayList {

    public static void main(String[] args) {

        System.out.println("enter value operations");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a == 1) {
            ArrayList<AppWeb> webs = new ArrayList<AppWeb>();

            int contador = 0;
            while (contador < 3) {
                System.out.println("enter BACKEND ");
                String Y = sc.next();
                System.out.println("enter FRONTEND ");
                String Z = sc.next();
                webs.add(new AppWeb(Y, Z));
                contador++;
            }
            for (AppWeb web : webs) {
                System.out.println(web);
            }

            //----------------------------------------
            
        } else if (a == 2) {
            ArrayList<AppMobile> mobiles = new ArrayList<AppMobile>();
            int contador = 2;

            for (int i = 0; i < contador; i++) {

                System.out.println("usaHibrida: enter true or false ");
                boolean Y = sc.nextBoolean();
                mobiles.add(new AppMobile(Y, perisoses()));
            }
            sc.close();
            for (AppMobile mobile : mobiles) {
                System.out.println(mobile);
            }
        } 




//=============================
        else if (a == 3) {
            ArrayList<AppIot> appIiot = new ArrayList<AppIot>();
            int contador = 2;
            for (int i = 0; i < contador; i++) {

                System.out.println("tiene grafica: escribe true or false ");
                boolean d = sc.nextBoolean();
                System.out.println("tiene wifi: escribe  true or false ");
                boolean r = sc.nextBoolean();
                System.out.println("escribe una de esos protocols: HTTP,AMQP,MQTT,SOAP,UDDI,WSDL ");
                EProtocols X = EProtocols.valueOf(sc.next());
                appIiot.add(new AppIot(d, r, X));

            }
            for (AppIot appiott : appIiot) {
                System.out.println(appiott);
            }
        } else {
            System.out.println("game over");
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
