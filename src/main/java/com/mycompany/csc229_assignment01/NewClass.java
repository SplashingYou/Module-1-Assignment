
package com.mycompany.csc229_assignment01;

/**
 *
 * @author MoaathAlrajab
 */
public class NewClass {
    
     public static void main(String[] args) {
        Course X = new Course(16, "0016", "Richard");
        
        X.setName("Rick");
        X.setID(17);
        X.setCode("0017");
        
        System.out.println(X.getName());
        System.out.println(X.getID());
        System.out.println(X.getCode());
        
    }
    
}
