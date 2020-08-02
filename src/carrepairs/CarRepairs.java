/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrepairs;

/**
 *
 * @author Sam
 */
public class CarRepairs {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        garage grg1= new garage("Toyota");
        
        grg1.setCore_service("Basic Inspection",50.0);
        
        grg1.addService("Oil Change",85);
        grg1.addService("Tire rotation",23.5);
        
        grg1.displayGarageServices();
        
        System.out.println(" ");
        System.out.println(" ");
        
        customer cst1 = new customer("Faiq");
        cst1.interested(grg1.getServiceCost("Basic Inspection"));
        cst1.interested(grg1.getServiceCost("Oil Change"));
        cst1.interested(grg1.getServiceCost("Tire rotation"));
        System.out.println(cst1.getNom()+" "+cst1.getTotal_Cost());
        
        customer cst2 = new customer("Eshaan");
        cst2.interested(grg1.getServiceCost("Basic Inspection"));
        cst2.interested(grg1.getServiceCost("Oil Change"));
        System.out.println(cst2.getNom()+" "+cst2.getTotal_Cost());
        
        customer cst3 = new customer("Aliu");
        cst3.interested(grg1.getServiceCost("Basic Inspection"));
        cst3.interested(grg1.getServiceCost("Tire rotation"));
        
        System.out.println(cst3.getNom()+" "+cst3.getTotal_Cost());
        
        
    }
}
