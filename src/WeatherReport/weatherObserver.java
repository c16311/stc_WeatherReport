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
public class weatherObserver implements Observer{
    @Override
    public  void update(PlaceGenerator generator){
        Random rand = new Random();
        //System.out.println("観測地点:"+generator.getPlace());
        System.out.print("天気:");
        int weather = rand.nextInt(3);
        switch (weather%3) {
            case 0:
                System.out.println("晴");
                break;
            case 1:
                System.out.println("曇");
                break;
            case 2:
                System.out.println("雨");
                break;
            default:
                break;
        }
       
        
    }
}
