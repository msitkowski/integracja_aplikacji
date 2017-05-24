/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applications;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
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
            
            // create job offer for new application
            JobOffer jobOffer = new JobOffer("Python Developer",
                    "Programowanie w języku python aplikacji internetowych "
                            + "oraz programów automatyzujących procesy",
                    "kariera@company.com", "421-636-123",
                    6000.0, 8500.0, "Umowa o pracę");
            
            // create applicant which send application
            Applicant applicant = new Applicant("Mateusz Sitkowski",
                    "mateuszsitek.sitkowski@gmail.com", "123-456-789");
            // create new application
            Application application = new Application(
                    "101", jobOffer, applicant,
                    "Stanisław Wroński", "Otrzymana", "24/05/2017",
                    true, "Bardzo rozległa wiedza i umiejętności");
            
            // add new application to applications loaded from file
            am.getApplications().add(application);
            
            // searching applications for python developer job
            List<Application> results = am.searchByOffer("Python Developer");
            System.out.println(results);
            
            // create new ApplicationList object
            // for search results which will be saved in file
            ApplicationList appList = new ApplicationList();
            appList.setApplications(results);
            
            // create output file for results
            FileWriter outputFile = new FileWriter("python_devs.xml");
            // create marshaller object from context
            Marshaller ms = context.createMarshaller();
            // save search results in file using marshaller
            ms.marshal(appList, outputFile);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
