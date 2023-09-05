package EstruturaCondicional;

public class CalcPedido {
    float pedido1 = 4f, pedido2 = 4.5f, pedido3 = 5f, pedido4 = 2f, pedido5 = 1.5f;
    public float calcConta(int codigo, int quantidade){
        float conta;
        if (codigo == 1){
            conta = pedido1 * quantidade;
        } else if (codigo == 2) {
            conta = pedido2 * quantidade;
        } else if (codigo == 3) {
            conta = pedido3 * quantidade;
        } else if (codigo == 4) {
            conta = pedido4 * quantidade;
        } else {
            conta = pedido5 * quantidade;
        }

        return conta;
    }
}
