/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

import java.util.List;

/**
 *
 * @author Ivan Dario Solano Velasquez
 */
public class IvanSolano implements Base {
    
    @Override
    public long weirdMath(Struct s){
        return (s.getA()+s.getB()+s.getC()+s.getD())/(s.getA()*s.getB()*s.getC()*s.getD());
    }

    @Override
    public long MaxWeirdMath(List<Struct> list) {
        long max = MINUS_INF;
        for (Struct s: list){
            max = Math.max(max,weirdMath(s));
        }
        System.out.println("\n WeirdMath = (A+B+C)/(A*B*C), by Ivan Dario Solano Velasquez");
        return max;
    }
    
}
