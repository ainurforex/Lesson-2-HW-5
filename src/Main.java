public class Main {
    public static int increaseMonthPay(int currentMonthPay, int increasePayPercent){
        return (currentMonthPay*increasePayPercent/100)+currentMonthPay;
    }
    public static int increaseYearPay(int currentMonthPay, int increaseMonthPay){
        return (increaseMonthPay*12)-(currentMonthPay*12);
    }
    public static void main(String[] args) {
        int currentMonthPayMasha=67760;
        int currentMonthPayDenis=83690;
        int currentMonthPayKristina=76230;
        int increasePayPercent=10;
        int increaseMonthPayMasha;
        int increaseMonthPayDenis;
        int increaseMonthPayKristina;
        int increaseYearPayMasha;
        int increaseYearPayDenis;
        int increaseYearPayKristina;

        increaseMonthPayMasha=increaseMonthPay(currentMonthPayMasha,increasePayPercent);
        increaseMonthPayDenis=increaseMonthPay(currentMonthPayDenis,increasePayPercent);
        increaseMonthPayKristina=increaseMonthPay(currentMonthPayKristina,increasePayPercent);
        increaseYearPayMasha=increaseYearPay(currentMonthPayMasha,increaseMonthPayMasha);
        increaseYearPayDenis=increaseYearPay(currentMonthPayDenis,increaseMonthPayDenis);
        increaseYearPayKristina=increaseYearPay(currentMonthPayKristina,increaseMonthPayKristina);

        System.out.println("Маша теперь получает " +increaseMonthPayMasha+" рублей."+ " Годовой доход вырос на "+increaseYearPayMasha+ " рублей.");
        System.out.println("Денис теперь получает " +increaseMonthPayDenis+" рублей."+ " Годовой доход вырос на "+increaseYearPayDenis+ " рублей.");
        System.out.println("Кристина теперь получает " +increaseMonthPayKristina+" рублей."+ " Годовой доход вырос на "+increaseYearPayKristina+ " рублей.");
    }
}