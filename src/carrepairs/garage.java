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


import java.util.ArrayList;

/**
 *
 * @author Sam
 */
 public class garage extends coreService {
     
        private final String gerageName;
        private final ArrayList<String> serv_List;
        private final ArrayList<Double> serv_Cost;
        
        public garage(String nom)
        {
            this.gerageName=nom;
            this.serv_Cost = new ArrayList<>();
            this.serv_List = new ArrayList<>();
        }
        
        public String getGerageName()
        {
            return gerageName;
        }
        
        public Double getServiceCost(String serv)
        {
            if(super.core_service.equals(serv))
            {
                return super.cost;
            }
            
            for(int i = 0; i < serv_List.size(); i++)
            {
                if(serv_List.get(i).equals(serv))
                {
                    return serv_Cost.get(i);
                }
            }
         return 0d;
        }
        
        public void addService(String serv,double cost)
        {
            this.serv_Cost.add(cost);
            this.serv_List.add(serv);
        }
        public void removeService(String serv)
        {
            for(int i = 0; i < serv_List.size(); i++)
            {
                if(serv_List.get(i).equals(serv))
                {
                    serv_List.remove(i);
                    serv_Cost.remove(i);
                }
            }
        }
        public void displayGarageServices()
        {
            System.out.println("List of all services offered by "+gerageName+" Garage ");
            System.out.println("------------------------------------------------------ ");
            
            System.out.println("1. "+super.getCore_service()+" Cost :"+super.getCost()+" $");
            
            if(!serv_List.isEmpty())
            {
                int cmpt=2;
                for(int i=0; i < serv_List.size(); i++)
                {
                    System.out.println(cmpt+". "+serv_List.get(i)+" Cost :"+serv_Cost.get(i)+" $");
                    cmpt++;
                }
            }
        }
    }
