/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ptts.fun;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;

/**
 *
 * @author vihas
 */
public class Metodos {
    Database d = new Database();
    Connection con = null;
    ResultSet rs = null;
    Statement st = null;
    
    public void fillDataJList(JList jList) {
  
    try{
          DefaultListModel mo = new DefaultListModel();
          con = d.conexion();
          st = con.createStatement();
          rs = st.executeQuery("SELECT * FROM harbour ORDER BY st_name asc");
          while(rs.next()){
            String stname = rs.getString("st_name");
            mo.addElement(stname);
            
          }
          jList.setModel(mo);
    } catch(SQLException sqle){

    }

    }
     public void serDataJlist(JList jList,String in){
        
        try{
             DefaultListModel mo = new DefaultListModel();
          con = d.conexion();
          st = con.createStatement();
          rs = st.executeQuery("SELECT st_name FROM harbour wHERE st_name LIKE '"+in+"%'");
          while(rs.next()){
            String stname = rs.getString("st_name");
            mo.addElement(stname);
            
          }
          jList.setModel(mo);
    } catch(SQLException sqle){

    }
     }
}   
