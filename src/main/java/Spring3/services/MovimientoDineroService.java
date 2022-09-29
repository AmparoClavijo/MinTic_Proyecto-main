package Spring3.services;
import Sprint2.MovimientoDinero;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class MovimientoDineroService {
    MovimientoDinero transaccion;
    MovimientoDinero listaTransaccion;
    MovimientoDinero fechaTransaccion;
    MovimientoDinero montoTransaccion;

    IngresoDinero transferencias;

    public MovimientoDineroService(){

    this.transaccion = new MovimientoDinero("consignacion", LocalDate.of(2022,09,25));
    this.listaTransaccion = new MovimientoDinero("Cantidad de Consignaciones", LocalDate.of(2022,09,25));
    this.fechaTransaccion = new MovimientoDinero("fecha de Consignacion", LocalDate.of(2022,09,25));
    this.montoTransaccion = new MovimientoDinero("Monto de la Consignacion", LocalDate.of(2022,09,25));

    this.transferencias = new IngresoDinero("nuevo ingreso de dinero");
    transferencias.addMovimientoDinero(transaccion);
    transferencias.addMovimientoDinero(listaTransaccion);
    transferencias.addMovimientoDinero(fechaTransaccion);
    transferencias.addMovimientoDinero(montoTransaccion);

    }

    public IngresoDinero getIngresoDinero() {

        return this.transferencias;
    }
}
