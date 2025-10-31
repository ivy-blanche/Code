import display.base.Display;
import display.chart.KLineChart;
import display.chart.LineChart;
import display.decorator.TrendLineDecorator;
import display.decorator.LabelDecorator;
import observer.DisplayObserver;
import subject.DataSource;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        DataSource sensor = new DataSource();

        // 第一个观察者：折线图 + 标签 + 趋势
        Display lineChart = new LineChart();
        lineChart = new LabelDecorator(lineChart);
        lineChart = new TrendLineDecorator(lineChart);
        DisplayObserver observer1 = new DisplayObserver(lineChart);

        // 第二个观察者：K线图 + 标签
        Display klineChart = new KLineChart();
        klineChart = new LabelDecorator(klineChart);
        DisplayObserver observer2 = new DisplayObserver(klineChart);

        // 注册观察者（必须在数据更新前注册）
        sensor.registerObserver(observer1);
        sensor.registerObserver(observer2);

        // 模拟数据更新
        double[] stockPrices = {102.5, 103.2, 103.2, 102.8, 104.0};
        for (double price : stockPrices) {
            sensor.setPrice(price);
            Thread.sleep(1000);
        }
    }
}
