import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Statistics {
    private int bet;                    // ставка
    private int myBank;                 // моя прибыль итого
    private int userWin;                // выиграл средств
    private int lotoBank;               // супер банк
    private int mylotoBank;             // моя прибыль от попыток взять банк
    private int commonBank;             // банк для выплат ставок
    private int userLosing;             // проиграл средств
    private String nameBet;             // название ставки
    private int numberSteep;            // номер ставки
    private int countWinLoto;           // количество выигранных раз лото
    private ArrayList<String> list;     // массив всех изменений для иксель


    public Statistics() {
        this.myBank = 0;
        this.userWin = 0;
        this.lotoBank = 0;
        this.mylotoBank = 0;
        this.commonBank = 0;
        this.userLosing = 0;
        this.numberSteep = 0;
        this.countWinLoto = 0;

        this.list = new ArrayList<String>();
        list.add("Шаг, Поле, Ставка, Банк, ЛОТО Банк, Выиграно, Проиграно, Прибыль, ЛОТО прибыль, Кол Лото");
    }


    public void recordStat() {
        list.add(numberSteep + ", " + nameBet + ", " + bet + ", " + commonBank + ", " + lotoBank
                + ", " + userWin + ", " + userLosing + ", " + myBank + ", " + mylotoBank + ", "
                + countWinLoto + ",");
    }


    public int getMyBank() {
        return myBank;
    }

    public int getUserWin() {
        return userWin;
    }

    public void listClear() {
        list.clear();
    }

    public int getLotoBank() {
        return lotoBank;
    }

    public int getUserLosing() {
        return userLosing;
    }

    public int getCommonBank() {
        return commonBank;
    }

    public int getMylotoBank() {
        return mylotoBank;
    }

    public void setBet(int bet) {
        this.bet = bet;
    }

    public int getCountWinLoto() {
        return countWinLoto;
    }

    public void setMyBank(int myBank) {
        this.myBank = myBank;
    }

    public ArrayList<String> getList() {
        return list;
    }

    public void setUserWin(int userWin) {
        this.userWin = userWin;
    }

    public void setLotoBank(int lotoBank) {
        this.lotoBank = lotoBank;
    }

    public void setNameBet(String nameBet) {
        this.nameBet = nameBet;
    }

    public void setCommonBank(int commonBank) {
        this.commonBank = commonBank;
    }

    public void setUserLosing(int userLosing) {
        this.userLosing = userLosing;
    }

    public void setMylotoBank(int mylotoBank) {
        this.mylotoBank = mylotoBank;
    }

    public void setNumberSteep(int numberSteep) {
        this.numberSteep = numberSteep;
    }

    public void setCountWinLoto(int countWinLoto) {
        this.countWinLoto = countWinLoto;
    }
}
