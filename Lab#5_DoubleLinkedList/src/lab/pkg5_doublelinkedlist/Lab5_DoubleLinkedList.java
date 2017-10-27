/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg5_doublelinkedlist;

/**
 *
 * @author FelipeGB
 */
public class Lab5_DoubleLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List <String> MyList = new List<>();
        
        Position<String> ref0, ref1, ref2, ref3 ;
        
        ref0 = MyList.addFirst("CANADA");            // guarda nodo como referencia para addAfter()
        ref1 = MyList.addAfter(ref0, "ONTARIO");
        ref2 = MyList.addAfter(ref1, "CALGARY");
        
        MyList.addLast("VANCOUVER");
        
        
        
        
        
        
        
    }
    
}
