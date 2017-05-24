/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applications;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author mateu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // read data from xml and load to list
            JAXBContext context = JAXBContext.newInstance(
                    ApplicationList.class);
            Unmarshaller um = context.createUnmarshaller();
            
            FileReader inputFile = new FileReader("Applications.xml");
            ApplicationList applications = (ApplicationList)um.unmarshal(
                    inputFile);
            
            inputFile.close();
            
            ApplicationsManager am = new ApplicationsManager(
                    applications.getApplications());
            List<Application> results = am.searchByOffer("Python Developer");
            System.out.println(results);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
