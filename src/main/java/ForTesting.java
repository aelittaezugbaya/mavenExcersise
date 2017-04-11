/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aelittaezugbaa
 */
public class ForTesting {
    
    boolean hello;
    
    public ForTesting(){
        this.hello=true;
    }
    
    public void change(){
       this.hello=!this.hello;
       //return this.hello;
    }
    
    public boolean value(){
        return this.hello;
    }
}
