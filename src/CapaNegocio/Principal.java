package CapaNegocio;

import CapaAplicacion.frmAutos;
import CapaNegocio.ControlaVehiculo;
import CapaDatos.Consultas;
import CapaRecursos.Vehiculos;
import CapaNegocio.ControlaVehiculo;
public class Principal {

    public static void main(String[] args) {
        Vehiculos vec = new Vehiculos();
        Consultas con = new Consultas();
        frmAutos frm = new frmAutos();
        ControlaVehiculo controla = new ControlaVehiculo(vec, con, frm);
        controla.iniciar();
        frm.setVisible(true);
    }

}
