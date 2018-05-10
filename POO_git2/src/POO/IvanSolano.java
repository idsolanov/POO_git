/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

import static POO.Base.MINUS_INF;
import java.util.List;

/**
 *
 * @author Saeekz
 */
public class IvanSolano implements Base {
    @Override
    public long weirdMath (Struct s){
        return (s.getA()+s.getB()+s.getC()+s.getD())/(s.getA()*s.getB()*s.getC()*s.getD());
    }
    @Override
    public long MaxWeirdMath(List<Struct> list){
        long maximo = MINUS_INF;
        for(Struct s : list){
            maximo = Math.max(maximo, weirdMath(s));
        }
        System.out.println("\n WeirdMath = (A+B+C+D)/(A*B*C*D), by Ivan Dario Solano Velasquez");
        return maximo;
    }
}
