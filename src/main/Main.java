/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import core.InfoSystem;

/**
 *
 * @author USUARIO
 */
public class Main {
    
    public static void main(String[] args) {
        // Creates the information system
        InfoSystem system = new InfoSystem();

        // Creates the agents
        system.createAgent(10024001, "Scrap");
        system.createAgent(10024002, "Lightning");
        System.out.println("");
        
        // Add commands to agents
        system.getAgent(10024001).addCommand(new Create(), new Object[]{system.getStorage(), "Doctor", 501L, "Dr. Juan Perez", 45, "Cardiology"});
        system.getAgent(10024002).addCommand(new Create(), new Object[]{system.getStorage(), "Doctor", 503L, "Dr. Felipe Andrade", 50, "Oncology"});
        system.getAgent(10024001).addCommand(new Create(), new Object[]{system.getStorage(), "Doctor", 502L, "Dr. Ana Gomez", 38, "Neurology"});
        system.getAgent(10024002).addCommand(new Create(), new Object[]{system.getStorage(), "Doctor", 504L, "Dr. Sofia Ramirez", 37, "Pediatrics"});
        system.getAgent(10024001).addCommand(new Create(), new Object[]{system.getStorage(), "Patient", 601L, "Carlos Ruiz", 29, "Hypertension"});
        system.getAgent(10024002).addCommand(new Create(), new Object[]{system.getStorage(), "Patient", 605L, "Miguel Castro", 47, "Arthritis"});
        system.getAgent(10024001).addCommand(new Create(), new Object[]{system.getStorage(), "Patient", 602L, "Maria Torres", 54, "Diabetes"});
        system.getAgent(10024002).addCommand(new Create(), new Object[]{system.getStorage(), "Patient", 606L, "Lucia Mendoza", 22, "Anemia"});
        system.getAgent(10024001).addCommand(new Update(), new Object[]{system.getStorage(), "Doctor", 501L, "Dr. Juan Perez", 46, "Cardiology"});
        system.getAgent(10024002).addCommand(new Update(), new Object[]{system.getStorage(), "Doctor", 503L, "Dr. Felipe Andrade", 51, "Oncology"});
        system.getAgent(10024001).addCommand(new Update(), new Object[]{system.getStorage(), "Patient", 602L, "Maria Torres", 55, "Type 2 Diabetes"});
        system.getAgent(10024002).addCommand(new Update(), new Object[]{system.getStorage(), "Patient", 606L, "Lucia Mendoza", 23, "Iron-deficiency Anemia"});
        system.getAgent(10024001).addCommand(new Delete(), new Object[]{system.getStorage(), "Doctor", 502L});
        system.getAgent(10024002).addCommand(new Delete(), new Object[]{system.getStorage(), "Doctor", 504L});
        
        // Execute commands
        system.getAgent(10024001).executeCommands();
        system.getAgent(10024002).executeCommands();
        
        // Add command to agents
        system.getAgent(10024001).addCommand(new Create(), new Object[]{system.getStorage(), "Patient", 603L, "Laura Herrera", 41, "Asthma"});
        system.getAgent(10024002).addCommand(new Delete(), new Object[]{system.getStorage(), "Patient", 605L});
        system.getAgent(10024001).addCommand(new Create(), new Object[]{system.getStorage(), "Patient", 604L, "Pedro Jimenez", 32, "Anxiety"});
        system.getAgent(10024002).addCommand(new Create(), new Object[]{system.getStorage(), "Patient", 607L, "Julian Lopez", 35, "Astigmatism"});
        system.getAgent(10024001).addCommand(new Update(), new Object[]{system.getStorage(), "Patient", 603L, "Laura Herrera", 42, "Asthma (mild)"});
        system.getAgent(10024002).addCommand(new Create(), new Object[]{system.getStorage(), "Doctor", 505L, "Dr. Carolina Ortiz", 42, "Dermatology"});
        
        // Execute commands
        system.getAgent(10024001).executeCommands();
        system.getAgent(10024002).executeCommands();
        
        // Methods execution
        System.out.println("The oldest doctor is: " + system.getOldestDoctor().getName());
        System.out.println("The youngest patient is: " + system.getYoungestPatient().getName());
        System.out.println("The average age of all person is: " + String.format("%.2f", system.getAverageAge()));
    }
    
}

/*
------------- Resultados -------------

Agent 10024001 (Scrap) created
Agent 10024002 (Lightning) created

Agent 10024001 (Scrap) executes command Create with args [Storage, Doctor, 501, Dr. Juan Perez, 45, Cardiology]
Agent 10024001 (Scrap) executes command Create with args [Storage, Doctor, 502, Dr. Ana Gomez, 38, Neurology]
Agent 10024001 (Scrap) executes command Create with args [Storage, Patient, 601, Carlos Ruiz, 29, Hypertension]
Agent 10024001 (Scrap) executes command Create with args [Storage, Patient, 602, Maria Torres, 54, Diabetes]
Agent 10024001 (Scrap) executes command Update with args [Storage, Doctor, 501, Dr. Juan Perez, 46, Cardiology]
Agent 10024001 (Scrap) executes command Update with args [Storage, Patient, 602, Maria Torres, 55, Type 2 Diabetes]
Agent 10024001 (Scrap) executes command Delete with args [Storage, Doctor, 502]
Agent 10024001 (Scrap) clears its command list

Agent 10024002 (Lightning) executes command Create with args [Storage, Doctor, 503, Dr. Felipe Andrade, 50, Oncology]
Agent 10024002 (Lightning) executes command Create with args [Storage, Doctor, 504, Dr. Sofia Ramirez, 37, Pediatrics]
Agent 10024002 (Lightning) executes command Create with args [Storage, Patient, 605, Miguel Castro, 47, Arthritis]
Agent 10024002 (Lightning) executes command Create with args [Storage, Patient, 606, Lucia Mendoza, 22, Anemia]
Agent 10024002 (Lightning) executes command Update with args [Storage, Doctor, 503, Dr. Felipe Andrade, 51, Oncology]
Agent 10024002 (Lightning) executes command Update with args [Storage, Patient, 606, Lucia Mendoza, 23, Iron-deficiency Anemia]
Agent 10024002 (Lightning) executes command Delete with args [Storage, Doctor, 504]
Agent 10024002 (Lightning) clears its command list

Agent 10024001 (Scrap) executes command Create with args [Storage, Patient, 603, Laura Herrera, 41, Asthma]
Agent 10024001 (Scrap) executes command Create with args [Storage, Patient, 604, Pedro Jimenez, 32, Anxiety]
Agent 10024001 (Scrap) executes command Update with args [Storage, Patient, 603, Laura Herrera, 42, Asthma (mild)]
Agent 10024001 (Scrap) clears its command list

Agent 10024002 (Lightning) executes command Delete with args [Storage, Patient, 605]
Agent 10024002 (Lightning) executes command Create with args [Storage, Patient, 607, Julian Lopez, 35, Astigmatism]
Agent 10024002 (Lightning) executes command Create with args [Storage, Doctor, 505, Dr. Carolina Ortiz, 42, Dermatology]
Agent 10024002 (Lightning) clears its command list

The oldest doctor is: Dr. Felipe Andrade
The youngest patient is: Lucia Mendoza
The average age of all person is: 39,44
*/

