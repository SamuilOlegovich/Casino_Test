public class Field {
    private int bonus;
    private double factor;
    private final String RED;
    private final String LOTO;
    private final String BLACK;
    private Generator generator;
    private int centerAndOfField;
    private final int endOfField;
    private Statistics statistics;
    private final int satarOfField;
    private int centerStartOfField;
    private boolean floatingAverage;


    public Field(Statistics statistics) {
        this.RED = "Red";
        this.LOTO = "Loto";
        this.BLACK = "Black";
        this.endOfField = 100;
        this.satarOfField = 1;
        this.centerAndOfField = 51;
        this.centerStartOfField = 49;
        this.statistics = statistics;
    }

    public Field(Statistics statistics, Generator generator) {
        this.RED = "Red";
        this.LOTO = "Loto";
        this.BLACK = "Black";
        this.endOfField = 100;
        this.satarOfField = 1;
        this.generator = generator;
        this.statistics = statistics;
    }

    public void makeBetRed(int bet, int number) {

        if (floatingAverage) {
            generator.generatorEndOfField();
            generator.generatorStartOfField();
        }

        if (number > satarOfField && number < centerStartOfField) {
            statistics.setUserWin(statistics.getUserWin() + (int) (bet * factor));
            statistics.setCommonBank(statistics.getCommonBank() - bet);
        } else {
            statistics.setUserLosing(statistics.getUserLosing() + bet);
            statistics.setCommonBank(statistics.getCommonBank() + (int) ((bet / 100.0) * bonus));
            statistics.setLotoBank(statistics.getLotoBank() + (int) ((bet / 100.0) * (100 - bonus)));
        }
        statistics.setBet(bet);
        statistics.setNameBet(RED);
        statistics.recordStat();
    }

    public void makeBetBlack(int bet, int number) {

        if (floatingAverage) {
            generator.generatorEndOfField();
            generator.generatorStartOfField();
        }

        if (number > centerAndOfField && number < endOfField) {
            statistics.setUserWin(statistics.getUserWin() + (int) (bet * factor));
            statistics.setCommonBank(statistics.getCommonBank() - bet);
        } else {
            statistics.setUserLosing(statistics.getUserLosing() + bet);
            statistics.setCommonBank(statistics.getCommonBank() + (int) ((bet / 100.0) * bonus));
            statistics.setLotoBank(statistics.getLotoBank() + (int) ((bet / 100.0) * (100 - bonus)));
        }

        statistics.setBet(bet);
        statistics.setNameBet(BLACK);
        statistics.recordStat();
    }

    public void makeBetLoto(int bet, int number) {
            centerAndOfField = 51;
            centerStartOfField = 49;
        if (number > centerStartOfField && number < centerAndOfField) {
            statistics.setUserWin(statistics.getUserWin() + (int) ((statistics.getLotoBank() / 100.0) * 90));
            statistics.setMyBank(statistics.getMyBank() + (int) ((statistics.getLotoBank() / 100.0) * 10));
            statistics.setCountWinLoto(statistics.getCountWinLoto() + 1);
            statistics.setLotoBank(0);
        } else {
            statistics.setMylotoBank(statistics.getMylotoBank() + bet);
        }

        statistics.setBet(bet);
        statistics.setNameBet(LOTO);
        statistics.recordStat();
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public void setFactor(double factor) {
        this.factor = factor;
    }

    public void setCenterAndOfField(int centerAndOfField) {
        this.centerAndOfField = centerAndOfField;
    }

    public void setFloatingAverage(boolean floatingAverage) {
        this.floatingAverage = floatingAverage;
    }

    public void setCenterStartOfField(int centerStartOfField) {
        this.centerStartOfField = centerStartOfField;
    }

}
