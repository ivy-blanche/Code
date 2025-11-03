import display.base.Display;
import display.chart.KLineChart;
import display.chart.LineChart;
import display.decorator.TrendLineDecorator;
import display.decorator.LabelDecorator;
import observer.DisplayObserver;
import subject.DataSource;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // 初始化被观察者（指定股票代码）
        DataSource stockSource = new DataSource("A股-600000");

        // 装饰者链1：折线图 + 标签 + 趋势
        Display lineChart = new LineChart();
        lineChart = new LabelDecorator(lineChart);
        lineChart = new TrendLineDecorator(lineChart);
        DisplayObserver observer1 = new DisplayObserver(lineChart);

        // 装饰者链2：K线图 + 标签 + 趋势
        Display klineChart = new KLineChart();
        klineChart = new LabelDecorator(klineChart);
        klineChart = new TrendLineDecorator(klineChart);
        DisplayObserver observer2 = new DisplayObserver(klineChart);


        // 注册观察者
        stockSource.registerObserver(observer1);
        stockSource.registerObserver(observer2);


        // 模拟数据变化
        double[] prices = {102.5, 103.2, 103.2, 102.8, 104.0};
        for (double price : prices) {
            stockSource.setPrice(price);
            Thread.sleep(1000);
        }
    }
}
