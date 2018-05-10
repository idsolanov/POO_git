/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

/**
 *
 * @author andresardilaagudelo
 */


import static POO.Base.MINUS_INF;
import java.util.List;

/**
 *
 * @author AndresArdila
 */
public class AndresArdila implements Base{
    @Override
    public long weirdMath(Struct s){
        return s.getC()%s.getB();
    }
    public long MaxWeirdMath(List<Struct> list){
        long max = MINUS_INF;
        for(Struct s : list){
            max = Math.max(max, weirdMath(s));
        }
        System.out.println("weirdMath = C%B, by Andres Ardila");
        return max;
    }
}