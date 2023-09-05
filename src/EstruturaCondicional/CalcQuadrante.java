package EstruturaCondicional;

public class CalcQuadrante {
    public String posPlan(float x, float y){
        String msg;
        if (x == 0f && y == 0f){
            msg = "Origem.";
        } else if (x > 0f && y> 0f) {
            msg = "Q1.";
        } else if (x < 0f && y > 0f) {
            msg = "Q2.";
        } else if (x < 0f && y < 0f) {
            msg = "Q3.";
        } else if (x > 0f && y < 0f) {
            msg = "Q4.";
        } else {
            msg = "Semiplano.";
        }
        return  msg;
    }
}
