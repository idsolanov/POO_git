/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

/**
 *
 * @author Esteban
 */

import java.util.List;

/**
 *
 * @author Esteban
 */
public class Practice implements Base{

    @Override
    public long weirdMath(Struct s) {
        return s.getC()/s.getD();
    }

    @Override
    public long MaxWeirdMath(List<Struct> list) {
        long m=MINUS_INF;
        for(Struct t:list)
        {
            m=Math.max(m, weirdMath(t));
        }
        System.out.println("\nweirMath= C/D por Esteban Ladino");
        return m;
    }
    
}