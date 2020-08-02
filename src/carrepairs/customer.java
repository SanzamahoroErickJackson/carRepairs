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
 public class customer {
     
        private String nom;
        private double total_Cost;
        
        public customer(String nom)
        {
            this.nom=nom;
            this.total_Cost=0;
        }
        public String getNom()
        {
            return nom;
        }
        public void setNom(String nom)
        {
            this.nom= nom;
        }
        
        public double getTotal_Cost()
        {
            return total_Cost;
        }
        
        public void interested(double cost)
        {
            total_Cost +=cost;
        }
    }
