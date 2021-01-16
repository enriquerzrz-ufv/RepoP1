//Fichero para mostrar por consola el JSON generado a partir del CSV y almacenarlo en el fichero best-golf-players.json
package org.dis;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class EscribeJSON {

    public static void main(String[] args) {
        String json = new Gson().toJson(LeeCSV.parseaCSV("best-golf-players.csv"));
        System.out.println(json);

        
    }
    
 }
