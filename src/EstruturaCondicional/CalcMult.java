package EstruturaCondicional;

public class CalcMult {
    public String calcMult(int n1, int n2){
        String msg;
        if (n1 > n2){
            if (n1 % n2 == 0){
                msg = "Sao Multiplos.";
            } else {
                msg = "Nao sao Multiplos.";
            }
        } else {
            if (n2 % n1 == 0) {
                msg = "Sao Multiplos.";
            } else {
                msg = "Nao sao Multiplos.";
            }
        }
        return msg;
    }
}
