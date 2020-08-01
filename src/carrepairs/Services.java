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

public class Services {
    
    private String service_name;
    private double cost;

    public Services(String serv,double cost) 
    {
        this.service_name = serv;
        this.cost = cost;
    }
    
    public String getService_name()
    {
        return service_name;
    }
    
    public void setService_name(String serv)
    {
        this.service_name= serv;
    }
    
    public double getCost()
    {
        return cost;
    }
    
    public void setCost(double cost)
    {
        this.cost= cost;
    }
    
}
