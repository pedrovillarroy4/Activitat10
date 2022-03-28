/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACTIVITAT10_PEDRO;

import METODES_ACT10.metodes;

public class STRINGMARAVILLOSO {

    public static void main(String[] args) {
        String M = "MARAVILLOSO";

        System.out.println("La versió que tenim a github ha estat actualitzada i"
                + " és mes actual que la que tinc en local");

        metodes.partSuperior(M);

        metodes.partInferior(M);
        
        System.out.println("Modificació petita.");
        
    }
}