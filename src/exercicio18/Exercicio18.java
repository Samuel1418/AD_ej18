/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio18;

import java.sql.SQLException;

/**
 *
 * @author oracle
 */
public class Exercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        Producto prod= new Producto();
        //Añadida la libreria que esta en /home/oracle/Drivers
//        prod.addProducto("p1", "parafusos", 3);
//        prod.addProducto("p2", "cravos", 4);
//        prod.addProducto("p3", "tachas", 6);
     //   prod.actPrezo("p3", 20);
        prod.verLista();
        prod.borrar("p1");
        prod.verLista();
        prod.verFila("p3");
    }
    
}
