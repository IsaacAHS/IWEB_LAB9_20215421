package com.example.lab920215421.Daos;

import com.example.lab920215421.Beans.Licencia;
import com.example.lab920215421.Beans.Pais;
import com.example.lab920215421.Beans.Usuario;
import java.sql.*;
import java.util.ArrayList;

public class UsuarioDao{


    public ArrayList<Usuario> listarUsuario(){

        ArrayList<Usuario> lista= new ArrayList<>();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException e){
            throw new RuntimeException(e);
        }

        String url = "jdbc:mysql://localhost:3306/iweb_lab9";
        String username = "root";
        String password = "root";
        String sql="SELECT us.idusuario,us.nombres,us.apellidos,li.categoria,pa.nombre_pais\n" +
                "\n" +
                "FROM usuario us\n" +
                "LEFT JOIN rol ro ON us.rol_idrol=ro.idrol" +
                "LEFT JOIN licencia li ON us.licencia_idlicencia=li.idlicencia\n" +
                "LEFT JOIN pais pa ON li.pais_idpais= pa.idpais";
        try (Connection conn = DriverManager.getConnection(url, username, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Usuario user = new Usuario();
                user.setIdUsuario(rs.getInt(1));
                user.setNombres(rs.getString(2));
                user.setApellidos(rs.getString(3));
                user.setTelefono(rs.getInt(4));

                Licencia licencia= new Licencia();
                licencia.setCategoria(rs.getString("li.categoria"));
                user.setLicencia(licencia);

                Pais pais= new Pais();
                pais.setNombrePais(rs.getString("pa.nombre_pais"));
                licencia.setPais(pais);

                lista.add(user);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return lista;
    }



}
