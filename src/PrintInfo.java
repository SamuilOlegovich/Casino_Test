import java.util.ArrayList;

public class PrintInfo {
    private Statistics statistics;

    public PrintInfo(Statistics statistics) {
        this.statistics = statistics;
    }

    public void printInfoInMonitore() {
        ArrayList<String> list = new ArrayList<>();
        list = statistics.getList();

        for (String strings : list) {
            System.out.println(strings);
        }

        list.clear();
        statistics.listClear();
    }
}
