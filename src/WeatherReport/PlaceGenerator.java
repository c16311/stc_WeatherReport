package WeatherReport;
/**
 *
 * @author c16311
 */

import java.util.ArrayList;
import java.util.Iterator;
/**
 * 数を生成するオブジェクトを表す抽象クラス
 * @author c16311
 */
public abstract class PlaceGenerator {
    private ArrayList<Observer> observers = new ArrayList(); //集約(has-a関係)
    
    //観測地点の追加
    public void addObserver(Observer observer){
        observers.add(observer);
    }
    //観測地点の削除
    public void deleteObserver(Observer observer){
        observers.remove(observer);
    }
    //登録されいる観測地点をupdateするようにメッセージを送る。
    public void notifyObservers(){
        /*for(Observer ob:observers){
            ob.update(this);
        }*/
        observers.forEach((ob) -> {
            ob.update(this);
        });
    }
    public abstract String getPlace();
    public abstract void excute();
}

