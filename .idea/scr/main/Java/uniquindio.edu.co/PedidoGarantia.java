package uniquindio.edu.co;

public class PedidoGarantia implements Pedido{

    @Override
    public String getDescripcion() {
        return "Poliza de Garantía";
    }

    @Override
    public double getCosto()  {

        return pedidoBase.getCosto() + (pedidoBase.getCosto() / 0.10);
}

}
