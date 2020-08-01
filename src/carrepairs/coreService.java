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
    
    protected String service;
    protected double cost;

    public coreService() 
    {
        service="Core service";
        cost=50.0;
    }

    public double getCost()
    {
        return cost;
    }
}
