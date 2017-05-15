/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WeatherReport;

/**
 *
 * @author c16311
 */
public class NamePlaceGenerator extends PlaceGenerator{
    private String PlaceName;
    private String address;
    
    public NamePlaceGenerator(String PlaceName){
        this.PlaceName=PlaceName;
    }
    @Override
    public  String getPlace(){
        return this.PlaceName;
    }
    @Override
    public  void excute(){
        System.out.println("観測地点:"+this.getPlace());
        notifyObservers();
    }
}
