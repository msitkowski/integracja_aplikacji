/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applications;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mateu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Applicant applicant1 = new Applicant(
                "Jan Kowalski", "jkowalski@mail.com", "902842418");
        Applicant applicant2 = new Applicant(
                "Janusz Cebula", "jcebula@mail.com", "922841318");
        Applicant applicant3 = new Applicant(
                "Tadeusz Drozda", "tdrozda@mail.com", "831093518");
        
        JobOffer jobOffer1 = new JobOffer(
                "C++ Developer", "Automotice c++ developer with Qt framework",
                "kariera@company.com", "139482094",
                5000.0, 8000.0, "Umowa o prace");
        JobOffer jobOffer2 = new JobOffer(
                "Tester", "Tworzenie testów automatycznych.",
                "kariera@company.com", "139482094",
                4000.0, 6000.0, "Umowa o prace");
        
        Application application1 = new Application(
                1, jobOffer2, applicant3,
                "Zdzisław Nowak", "Otrzymana",
                "23-05-2017", true, "");
        Application application2 = new Application(
                2, jobOffer1, applicant2,
                "Tomasz Kos", "Odrzucona",
                "12-05-2017", true, "Kandydat nie posiada odpowiednie wiedzy");
        Application application3 = new Application(
                3, jobOffer2, applicant1,
                "Stefan Lis", "Otrzymana",
                "21-02-2017", true, "");
        Application application4 = new Application(
                4, jobOffer1, applicant3,
                "Zdzisław Nowak", "Kontrakt zaproponowany",
                "03-02-2017", true, "");
        Application application5 = new Application(
                5, jobOffer2, applicant2,
                "Stefan Lis", "Do rozważenia",
                "14-03-2017", true, "");
        List<Application> applications = new ArrayList<>();
        applications.add(application1);
        applications.add(application2);
        applications.add(application3);
        applications.add(application4);
        applications.add(application5);
        ApplicationsManager am = new ApplicationsManager(applications);
        System.out.println(am.searchByApplicant("Tadeusz Drozda"));
        System.out.println(am.searchByOffer("Tester"));
        System.out.println(am.searchByRecruiter("Stefan Lis"));
        System.out.println(am.searchByStatus("Odrzucona"));
    }
    
}
