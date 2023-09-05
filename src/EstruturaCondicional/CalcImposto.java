package EstruturaCondicional;
public class CalcImposto {
    public String calcImp(double sal){
        String msg;
        if (sal >= 0f && sal <= 2000f){
            msg = "Isento.";
        } else if (sal > 2000f && sal <= 3000f) {
            sal = (sal - 2000f) * 0.08;
            msg = Double.toString(sal);
        } else if (sal > 3000f && sal <= 4500f) {
            sal = (sal - 3000f) * 0.18 + 1000f * 0.08;
            msg = Double.toString(sal);
        } else if (sal > 4500f){
            sal = (sal - 4500f) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
            msg = Double.toString(sal);
        } else {
            msg = "Salário inválido.";
        }
        return msg;
    }

}
