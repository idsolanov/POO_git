package POO;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fffeelipe
 */

public class Main {

    /**
     * @param size
     * @param args the command line arguments
     */
    public static List<Struct> listGenerator(int size){
        LinkedList<Struct> list = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            long a, b, c, d;
            Random randomGenerator = new Random();
            a = randomGenerator.nextLong();
            b = randomGenerator.nextLong();
            c = randomGenerator.nextLong();
            d = randomGenerator.nextLong();
            Struct s = new Struct(a, b, c, d);
            list.add(s);
        }
        return list;
    }
    
    public static void main(String[] args) {
        LinkedList<Struct> list = (LinkedList<Struct>)listGenerator(50);
        LinkedList<Base> based = new LinkedList<>();
        TreeSet<Long> visited = new TreeSet<>();
        
        //create and insert your object - example
        Example example = new Example();
        based.add(example);
                
        Practice p=new Practice();
        based.add(p);
        
        
        // here you create and add your instance of class
        
        
        
        //do not touch
        for (int i = 0; i < based.size(); i++) {
            long temp = based.get(i).MaxWeirdMath(list);
            System.out.println(temp);
            int visited_size = visited.size();
            visited.add(temp);
            if(visited_size == visited.size()){
                System.out.println("FAILED TEST");
                System.exit(0);
            }
        }
        
        
    }
    
}
