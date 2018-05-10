/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

import java.util.List;

/**
 *
 * @author fffeelipe
 */
public class Example implements Base{
    @Override
    public long weirdMath(Struct s){
        return s.getA()+s.getB();
    }
    public long MaxWeirdMath(List<Struct> list){
        long max = MINUS_INF;
        for(Struct s : list){
            max = Math.max(max, weirdMath(s));
        }
        System.out.println("weirdMath = A+B, by Felipe Epia");
        return max;
    }
}
