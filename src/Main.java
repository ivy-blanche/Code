public class Main {
    public static void main(String[] args) throws InterruptedException {
        DataSource dataSource = new DataSource();

        // 基础显示 + 装饰器
        Display baseDisplay = new ConcreteDisplay();
        Display labeled = new LabelDecorator(baseDisplay);
        Display decorated = new TrendLineDecorator(labeled);

        // 绑定观察者
        DisplayObserver observer = new DisplayObserver(decorated);
        dataSource.registerObserver(observer);

        // 模拟温度变化
        double[] temps = {24.6, 25.2, 25.2, 24.8};
        for (double t : temps) {
            dataSource.setTemperature(t);
            Thread.sleep(1000); // 模拟时间间隔
        }
    }
}
