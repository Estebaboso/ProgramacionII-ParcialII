package uniquindio.edu.co;

public class PedidoPrioritario {
    @Override
    public String getDescripcion() {
        return pedidoBase.getDescripcion() + ", con Manejo Prioritarío Frágil";
    }

    @Override
    public double getPrecio() {
        return pedidoBase.getCosto() + 25000;
    }
}
