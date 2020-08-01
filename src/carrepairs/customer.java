/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrepairs;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sam
 */
 public class customer extends coreService {
     
        private String nom;
        private List<String> serv_List;
        
        public customer(String nom)
        {
            this.nom=nom;
            this.serv_List = new ArrayList<>();
        }
        public String getNom()
        {
            return nom;
        }
        public void setNom(String nom)
        {
            this.nom= nom;
        }
        public void addService(Services c1)
        {
            super.cost +=c1.getCost();
            this.serv_List.add(c1.getService_name());
        }
        public void removeService(Services c1)
        {
            serv_List.stream().filter((serv1) -> (serv1.equals(c1.getService_name()))).forEachOrdered((_item) -> {
                super.cost -= c1.getCost();
            });
        }
    }
