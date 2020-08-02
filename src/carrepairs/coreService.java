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
class coreService {
    
    protected String core_service;
    protected double cost;

    public coreService() 
    {
        this.core_service="";
        this.cost=0;
    }
    
    public void setCore_service(String serv,double cst)
    {
        this.core_service=serv;
        this.cost=cst;
    }

    public double getCost()
    {
        return cost;
    }
    public String getCore_service()
    {
        return core_service;
    }
    
}
