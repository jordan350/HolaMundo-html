/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author LabingXEON
 */
public class BD {
private ArrayList<Persona> personas;
    public BD() {
   this.personas=new ArrayList<>();
    this.personas.add(new Persona("jordan","G"));
    this.personas.add(new Persona("jor","A"));
    this.personas.add(new Persona("j","x"));
    
    }
  
   public void addp(Persona persona){
       this.personas.add(persona);
   }
   
   
   public ArrayList<Persona> getP(){
       return personas;
   }
   
}
