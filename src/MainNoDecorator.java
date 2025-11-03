import display.base.Display;
import display.chart.KLineChart;
import display.chart.LineChart;
import observer.DisplayObserver;
import subject.DataSource;
public class MainNoDecorator {

    public static void main(String[] args) throws InterruptedException {
        // 初始化被观察者（指定股票代码）
        DataSource stockSource = new DataSource("A股-600000");


        Display elineChart = new LineChart();
        Display ekLineChart = new KLineChart();
        DisplayObserver observer3 = new DisplayObserver(elineChart);
        DisplayObserver observer4 = new DisplayObserver(ekLineChart);

        stockSource.registerObserver(observer3);
        stockSource.registerObserver(observer4);

        double[] prices = {102.5, 103.2, 103.2, 102.8, 104.0};
        for (double price : prices) {
            stockSource.setPrice(price);
            Thread.sleep(1000);
        }
    }
}
