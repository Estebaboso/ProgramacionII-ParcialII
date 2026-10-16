package uniquindio.edu.co;

public class PedidoEmpaque {


    @Override
    public String getDescripcion() {
        return pedidoBase.getDescripcion() + ", con Empaque de Regalo Premium";
    }

    @Override
    public double getPrecio() {
        return pedidoBase.getCosto() + 15000;
    }
}