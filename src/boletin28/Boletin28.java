/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin28;

/**
 *
 * @author ecollazodominguez
 */
public class Boletin28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Un obj1 = new Un();
        Dous obj2 = new Dous();
        Tres obj3 = new Tres();
        Catro obj4 = new Catro();
       
 System.out.println("obj1.test = "+ obj1.test());


        System.out.println("obj1.result1 = " + obj1.result1());


        System.out.println("obj2.test = "+obj2.test());


        System.out.println("obj2.result1 = "+obj3.result1());


        System.out.println("obj3.test = " +obj3.test());


        System.out.println("obj4.result1 = "+obj4.result1());

        System.out.println("obj3.result2 = " +obj3.result2());


        System.out.println("obj4.result2 = " +obj4.result2());


        System.out.println("obj3.result3 = " +obj3.result3());


        System.out.println("obj4.result3 = " +obj4.result3());
    }
    
}
