package EstruturaCondicional;

public class CalcIntervalo {
    public String defInterval(float num){
        String msg;
        if (num < 0 || num > 100){
            msg = "Fora de intervalo.";
        } else if (num <= 25) {
            msg = "Intervalo [0,25]";
        } else if (num <= 50) {
            msg = "Intervalo (25,50]";
        } else if (num <= 75) {
            msg = "Intervalo (50,75]";
        } else {
            msg = "Intervalo (75, 100]";
        }
        return msg;
    }
}
