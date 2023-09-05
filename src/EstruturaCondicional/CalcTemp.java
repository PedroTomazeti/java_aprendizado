package EstruturaCondicional;

public class CalcTemp {
    public int calcHora(int inicial, int fim){
        int calc;
        if (inicial < fim){
            calc = fim - inicial;
        } else {
            calc = 24 - inicial + fim;
        }
        return calc;
    }
}
