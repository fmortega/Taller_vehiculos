package CapaDatos;

import CapaRecursos.Vehiculos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Consultas extends Conexion {

    public boolean registrar(Vehiculos v) {
        PreparedStatement ps = null;
        Connection con = getConnetion();
        String query = "insert into autos (id,marca,modelo,cilindraje) values(?,?,?,?)";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, v.getId());
            ps.setString(2, v.GetMarca());
            ps.setString(3, v.GetModelo());
            ps.setString(4, v.GetCilindraje());
            ps.execute();
            return true;
        } catch (Exception e) {
            JOptionPane.showInternalMessageDialog(null, e + "Primeraexeption");
            return false;
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                JOptionPane.showInternalMessageDialog(null, e);
            }
        }
    }

    public boolean update(Vehiculos v) {
        PreparedStatement ps = null;
        Connection con = getConnetion();
        String query = "update  autos set marca=?,modelo=?,cilindraje=? where id=?";
        try {
            ps = con.prepareStatement(query);

            ps.setString(1, v.GetMarca());
            ps.setString(2, v.GetModelo());
            ps.setString(3, v.GetCilindraje());
            ps.setInt(4, v.getId());
            ps.execute();
            return true;
        } catch (Exception e) {
            JOptionPane.showInternalMessageDialog(null, e);
            return false;
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                JOptionPane.showInternalMessageDialog(null, e);
            }
        }
    }

    public boolean delete(Vehiculos v) {
        PreparedStatement ps = null;
        Connection con = getConnetion();
        String query = "delete  from autos  where id=?";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, v.getId());
            ps.execute();
            return true;
        } catch (Exception e) {
            JOptionPane.showInternalMessageDialog(null, e);
            return false;
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                JOptionPane.showInternalMessageDialog(null, e);
            }
        }
    }

    public boolean consultar(Vehiculos v) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConnetion();
        String query = "select * from autos where id=?";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, v.getId());
            rs = ps.executeQuery();
            if (rs.next()) {
                v.setId(Integer.parseInt(rs.getString("id")));
                v.SetMarca(rs.getString("marca"));
                v.SetModelo(rs.getString("modelo"));
                v.SetCilindraje(rs.getString("cilindraje"));
                return true;
            }
            return false;
        } catch (Exception e) {
            JOptionPane.showInternalMessageDialog(null, e);
            return false;
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                JOptionPane.showInternalMessageDialog(null, e);
            }
        }
    }
}
