package CapaNegocio;

import CapaAplicacion.frmAutos;
import CapaDatos.Consultas;
import CapaRecursos.Vehiculos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControlaVehiculo implements ActionListener {
    
    private Vehiculos vehiculo;
    private Consultas consilt;
    private frmAutos frm;
    
    public ControlaVehiculo(Vehiculos vehiculo, Consultas consilt, frmAutos frm) {
        this.vehiculo = vehiculo;
        this.consilt = consilt;
        this.frm = frm;
        this.frm.btRegistrar.addActionListener(this);
        this.frm.btnActualizar.addActionListener(this);
        this.frm.btnConsultar.addActionListener(this);
        this.frm.btnEliminar.addActionListener(this);
    }
    
    public void iniciar() {
        frm.setTitle("Vehiculos");
        frm.setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frm.btRegistrar) {
            vehiculo.setId(Integer.parseInt(frm.txtId.getText()));
            vehiculo.SetMarca(frm.txtMarca.getText());
            vehiculo.SetModelo(frm.txtModelo.getText());
            vehiculo.SetCilindraje(frm.txtCilindraje.getText());
            if (consilt.registrar(vehiculo)) {
                limpiar();
                JOptionPane.showMessageDialog(null, "Registro exitoso");
            } else {
                JOptionPane.showMessageDialog(null, "Ocurrior un error");
                
            }
        }
        
        if (e.getSource() == frm.btnActualizar) {
            vehiculo.setId(Integer.parseInt(frm.txtId.getText()));
            vehiculo.SetMarca(frm.txtMarca.getText());
            vehiculo.SetModelo(frm.txtModelo.getText());
            vehiculo.SetCilindraje(frm.txtCilindraje.getText());
            if (consilt.update(vehiculo)) {
                JOptionPane.showMessageDialog(null, "Registro modificado");
            } else {
                JOptionPane.showMessageDialog(null, "Ocurrior un error");
                
            }
        }
        
        if (e.getSource() == frm.btnEliminar) {
            vehiculo.setId(Integer.parseInt(frm.txtId.getText()));
            
            if (consilt.delete(vehiculo)) {
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
            } else {
                JOptionPane.showMessageDialog(null, "Ocurrior un error");
                
            }
        }
        
        if (e.getSource() == frm.btnConsultar) {
            vehiculo.setId(Integer.parseInt(frm.txtId.getText()));
            if (consilt.consultar(vehiculo)) {
                frm.txtMarca.setText(vehiculo.GetMarca());
                frm.txtModelo.setText(vehiculo.GetModelo());
                frm.txtCilindraje.setText(vehiculo.GetCilindraje());
            }else{
             JOptionPane.showMessageDialog(null, "Dato no encontrado");
            }
        }
    }
    public void limpiar(){
    frm.txtId.setText("");
    frm.txtMarca.setText("");
    frm.txtMarca.setText("");
    frm.txtModelo.setText("");
    frm.txtCilindraje.setText("");
    }
    
}
