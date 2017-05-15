/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. amedas
 */
package WeatherReport;

/**
 *
 * @author c16311
 */
/**
 * 観察者を表すインターフェース
 * @author c16311
 */
public interface Observer {
    public abstract void update(PlaceGenerator generator);
}
