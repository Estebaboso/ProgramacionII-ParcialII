package uniquindio.edu.co;

public abstract class PedidoDecorator implements Pedido {
    protected Pedido PedidoBase;


    public PedidoDecorator(Pedido PedidoBase) {
        this.PedidoBase = PedidoBase;
    }

    @Override
    public String getDescripcion() {
        return PedidoBase.getDescripcion();
    }

    @Override
    public double getPrecio() {
        return PedidoBase.getPrecio();
    }
}