/*
 * 課題3
 * アメダスで観測される気温などの情報を取得して、その結果を表示するプログラムを
 * Observerパターンを使って実現しなさい。
 * 複数の観測地点に対応すること。
 */
package WeatherReport;

/**
 *
 * @author c16311
 */
public class Main {
    public static void main(String[] args){
        /*NamePlaceGenerator generator = new NamePlaceGenerator("甲府");
        Observer observer1 = new weatherObserver();
        Observer observer2 = new TemperatureObserver();
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.excute();*/
        NamePlaceGenerator[] generatorlist = new NamePlaceGenerator[3];
        Observer observer1 = new weatherObserver();
        Observer observer2 = new TemperatureObserver();
        generatorlist[0] = new NamePlaceGenerator("甲府");
        generatorlist[1] = new NamePlaceGenerator("指宿");
        generatorlist[2] = new NamePlaceGenerator("稚内");
        
        for (NamePlaceGenerator generatorlist1 : generatorlist) {
            generatorlist1.addObserver(observer1);
            generatorlist1.addObserver(observer2);
            generatorlist1.excute();
        }
    }
}
