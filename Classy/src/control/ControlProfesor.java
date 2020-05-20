/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modelo.Profesor;

/**
 *
 * @author Usuario
 */
public class ControlProfesor {
    
    public boolean insertarProfesor(Profesor objp) {
        boolean t=false;
        Profesor objprofesor = new Profesor();
        String sql="INSERT INTO profesor() value('"+ objprofesor.getNombre1_profesor() +"');";
        t = objprofesor.insertProfesor(sql);
        
        return t;       
        
    }
}
