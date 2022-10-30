package CapaDatos;

import CapaRecursos.Vehiculos;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class BDMotos {

    public static DefaultTableModel Registrar(Vehiculos vehiculo, JTable Jtable1) {

        DefaultTableModel modeloDeDatosTabla = (DefaultTableModel) Jtable1.getModel();

        Object[] datosRegistro
                = {
                    vehiculo.GetMarca(),
                    vehiculo.GetModelo(),
                    vehiculo.GetCilindraje()

                };

        modeloDeDatosTabla.addRow(datosRegistro);

        return modeloDeDatosTabla;

    }

    public static List<Vehiculos> LeerTodo(JTable lsVehiculos) {
        List<Vehiculos> listaVehiculo = new ArrayList<>();

        for (int i = 0; i < lsVehiculos.getRowCount(); i++) {
            Vehiculos vehiculo = new Vehiculos();
            vehiculo.SetMarca(lsVehiculos.getValueAt(i, 0).toString());
            vehiculo.SetModelo(lsVehiculos.getValueAt(i, 1).toString());
            vehiculo.SetCilindraje(lsVehiculos.getValueAt(i, 2).toString());

            listaVehiculo.add(vehiculo);

        }

        return listaVehiculo;

    }

}
