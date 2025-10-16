/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class InfoSystem {
    private  ArrayList <Agent> agents;
    private  Storage storage;

    public InfoSystem() {
        this.agents = agents;
        this.storage = storage;
    }
    
    //system.createAgent(10024001, "Scrap");
    public void createAgent(int id, String name){
        Agent agent = new Agent(id,name);
    }
    //        system.getAgent(10024001).addCommand(new Create(), new Object[]{system.getStorage(), "Doctor", 501L, "Dr. Juan Perez", 45, "Cardiology"});
public Agent getAgent(int id){
    for(Agent agent: this.agents){
        if(agent.getId()==id){
            return agent;
        }
    }
    return null;
}

}

