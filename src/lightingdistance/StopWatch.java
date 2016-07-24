/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lightingdistance;

/**
 *
 * @author kuba
 */
public class StopWatch {
    
    private long start;
    
    private long stop;
    
    private String name;
    
    
    public StopWatch(String name){
        
        this.name = name;
    
    
    }
    
    
  public void start(){
  
      start = System.currentTimeMillis();
  
  }
    
    public void stop(){
    
        stop = System.currentTimeMillis();
  
    }
    
    public double takeScore(){
       
        return (stop - start) / 1000.0;
    
    }
    
    public String toString(){
       
        return name + ": " + this.takeScore() + " s.";
        
    }
}
