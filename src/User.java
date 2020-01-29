public class User {
    private Field field;
    private int strategy;
    private int countTakeLoto;
    private boolean started;

    public User() {
        this.started = false;
    }

    public void strategyGo() {
        if (countTakeLoto == 0 && started == false) {
            countTakeLotoGo();
            started = true;
        }
        if (countTakeLoto == 0 && started == true) {
            countTakeLotoGo();
            field.makeBetLoto(1, redAndBlack());
        } else {
            countTakeLoto--;
            strategy = (int) (1 + Math.random() * 2);
            if (strategy == 1) {
                field.makeBetRed(casinoBetGo(), redAndBlack());
            } else if (strategy == 2) {
                field.makeBetBlack(casinoBetGo(), redAndBlack());
            }
        }
    }

    public int redAndBlack() {
        return  (int) (1 + Math.random() * 100);
    }

    public int casinoBetGo() {
        return  100;//(int) (1 + Math.random() * 100);
    }

    public void countTakeLotoGo() {
        countTakeLoto = (int) (1 + Math.random() * 100);
    }

    public void setField(Field field) {
        this.field = field;
    }
}
