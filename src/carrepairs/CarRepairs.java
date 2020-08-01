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
        
        Services srvc1 = new Services("Oil_Change",85);
        Services srvc2 = new Services("Tire_rotation",23.5);
        
        customer cstm1 = new customer("Faiq");
        customer cstm2 = new customer("Eshaan");
        customer cstm3 = new customer("Aliu");
        
        cstm2.addService(srvc1);
        cstm3.addService(srvc2);
        
        cstm1.addService(srvc1);
        cstm1.addService(srvc2);
        
        System.out.println(cstm1.getNom()+" "+cstm1.getCost());
        System.out.println(cstm2.getNom()+" "+cstm2.getCost());
        System.out.println(cstm3.getNom()+" "+cstm3.getCost());
    }
}
