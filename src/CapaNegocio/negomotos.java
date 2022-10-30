package CapaNegocio;

import CapaDatos.BDMotos;
import CapaRecursos.Vehiculos;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Elian Villa
 */
public class negomotos {

    public void Registrar(Vehiculos vehiculo, JTable Jtable1) {
        try {
            Jtable1.setModel(BDMotos.Registrar(vehiculo, Jtable1));
        } catch (Exception ex) {

        }

    }

    public List<Vehiculos> Leer(JTable tabla) {
        List<Vehiculos> listaAutos = new ArrayList<>();

        try {
            listaAutos = BDMotos.LeerTodo(tabla);
        } catch (Exception ex) {

        } finally {
            return listaAutos;
        }

    }

}
