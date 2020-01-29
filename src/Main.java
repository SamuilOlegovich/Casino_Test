public class Main {
    private static boolean floatingAverage = true;
    private static Statistics statistics;
    private static PrintInfo printInfo;
    private static Generator generator;
    private static Field field;
    private static User user;
    private static int cycle = 10000000;
    private static int bonus = 90;
    private static double factor = 1.0;

    public static void main(String[] args) {

        if (floatingAverage) {
            user = new User();
            generator = new Generator();
            statistics = new Statistics();
            printInfo = new PrintInfo(statistics);
            field = new Field(statistics, generator);
            generator.setField(field);
            field.setFloatingAverage(floatingAverage);
            field.setFactor(factor);
            field.setBonus(bonus);
            user.setField(field);
        } else {
            user = new User();
            statistics = new Statistics();
            printInfo = new PrintInfo(statistics);
            field = new Field(statistics);
            field.setFloatingAverage(floatingAverage);
            field.setFactor(factor);
            field.setBonus(bonus);
            user.setField(field);
        }

        for (int i = 1; i < cycle; i++) {
            statistics.setNumberSteep(i);
            user.strategyGo();
        }

        printInfo.printInfoInMonitore();
    }
}
