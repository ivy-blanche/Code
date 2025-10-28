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

        // 注册观察者
        sensor.registerObserver(observer1);
        sensor.registerObserver(observer2);

        // 模拟数据更新
        double[] temps = {24.6, 25.2, 25.2, 24.8, 26.0};
        for (double t : temps) {
            sensor.setTemperature(t);
            Thread.sleep(1000);
        }
    }
}
