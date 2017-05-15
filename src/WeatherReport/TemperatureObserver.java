/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WeatherReport;

import java.util.Random;

/**
 *
 * @author c16311
 */
public class TemperatureObserver implements Observer{
    @Override
    public  void update(PlaceGenerator generator){
        Random rand = new Random();
         int number = rand.nextInt(35)-5;
        System.out.println("気温:"+number);
    }
}
