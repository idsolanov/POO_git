/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;
import java.util.List;
/**
 *
 * @author LithAngel
 */
public class LithAngel implements Base {
    @Override
    public long weirdMath (Struct s){
        return s.getA()- s.getD();
    }
    @Override
    public long MaxWeirdMath(List<Struct> list){
        long l = MINUS_INF;
        for(Struct s : list){
            l = Math.max(l, weirdMath(s));
        }
        System.out.println("\n WeirdMath = A-D, by Lith Angel");
        return l;
    }
}
