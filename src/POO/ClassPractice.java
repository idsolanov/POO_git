/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

import java.util.List;

/**
 *
 * @author Santiago
 */
public class ClassPractice implements Base {

    @Override
    public long weirdMath(Struct s) {
        return s.getB()-s.getD();
    }

    @Override
    public long MaxWeirdMath(List<Struct> list) {
        long x = MINUS_INF;
        for(Struct s : list){
            x = Math.max(x, weirdMath(s));
        }
        System.out.println("weirdMath = B-D, by Santiago Rojas");
        return x;
    }

}
