package applications;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * Created by mateu on 2017-05-23.
 */
@WebService
public class ApplicationsManager {

    private List<Application> applications;

    public ApplicationsManager() {
        this.applications = new ArrayList<>();
    }

    public ApplicationsManager(List<Application> applications) {
        this.applications = applications;
    }

    public List<Application> getApplications() {
        return applications;
    }

    public void setApplications(List<Application> applications) {
        this.applications = applications;
    }

    @WebMethod
    public @WebResult(name = "application")
        List<Application> searchByOffer(
                @WebParam(name = "offer") String offer) {
            
        List<Application> results = new ArrayList<>();

        for (Application a: applications) {
            if (a.getJobOffer().getTitle().contains(offer)) {
                results.add(a);
            }
        }
        return results;
    }

    @WebMethod
    public @WebResult(name = "application")
        List<Application> searchByApplicant(
                @WebParam(name = "applicant") String applicant) {
            
        List<Application> results = new ArrayList<>();

        for (Application a: applications) {
            if (a.getApplicant().getName().contains(applicant)) {
                results.add(a);
            }
        }
        return results;
    }

    @WebMethod
    public @WebResult(name = "application")
        List<Application> searchByStatus(
                @WebParam(name = "status") String status) {
            
        List<Application> results = new ArrayList<>();

        for (Application a: applications) {
            if (a.getStatus().equalsIgnoreCase(status)) {
                results.add(a);
            }
        }
        return results;
    }

    @WebMethod
    public @WebResult(name = "application")
        List<Application> searchByRecruiter(
                @WebParam(name = "recruiter") String recruiter) {
            
        List<Application> results = new ArrayList<>();

        for (Application a: applications) {
            if (a.getRecruiter().equalsIgnoreCase(recruiter)) {
                results.add(a);
            }
        }
        return results;
    }
        
    @WebMethod
    public @WebResult(name = "added")
        Boolean addApplication(
                @WebParam(name = "application")
                        Application application) throws Exception {
        
        Boolean result = false;
        // null pointer validation
        if (application == null) {
            throw new Exception("Given application is null!");
        }
        
        // recruiter validation
        if (application.getRecruiter() == null
                || application.getRecruiter().equalsIgnoreCase("")) {
            throw new Exception("Recruiter is required!");
        }
        
        // applicant validation
        if (application.getApplicant() == null) {
            throw new Exception("Applicant is required!");
        }
        else {
            if (application.getApplicant().getName() == null
                    || application.getApplicant().getName()
                            .equalsIgnoreCase("")) {
                throw new Exception("Applicant name is required!");
            }
            if (application.getApplicant().getEmail() == null
                    || application.getApplicant().getEmail()
                            .equalsIgnoreCase("")) {
                throw new Exception("Applicant email is required!");
            }
            if (application.getApplicant().getPhone() == null
                    || application.getApplicant().getPhone()
                            .equalsIgnoreCase("")) {
                throw new Exception("Applicant phone is required!");
            }
        }
        
        // job offer validation
        if (application.getJobOffer() == null) {
            throw new Exception("Job Offer is required!");
        }
        else {
            if (application.getJobOffer().getTitle() == null
                    || application.getJobOffer().getTitle()
                            .equalsIgnoreCase("")) {
                throw new Exception("Job Offer title is required!");
            }
            if (application.getJobOffer().getContact_email() == null
                    || application.getJobOffer().getContact_email()
                            .equalsIgnoreCase("")) {
                
                throw new Exception("Job Offer contact email is required!");
            }
            if (application.getJobOffer().getContract_type() == null
                    || application.getJobOffer().getContract_type()
                        .equalsIgnoreCase("")) {
                
                throw new Exception("Job Offer contract type is required!");
            }
            if (application.getJobOffer().getMin_salary() == null
                    || application.getJobOffer().getMin_salary() <= 0) {
                throw new Exception("Min salary must be higher than 0!");
            }
            if (application.getJobOffer().getMax_salary() == null
                    || application.getJobOffer().getMax_salary() <= 0) {
                throw new Exception("Max salary must be higher than 0!");
            }
            if (application.getJobOffer().getMin_salary()
                    >= application.getJobOffer().getMax_salary()) {
                
                throw new Exception(
                        "Max salary must be higher than Min salary!");
            }
        }
        
        // date validation
        if (application.getDate() == null
                || application.getDate().equalsIgnoreCase("")) {
            throw new Exception("Application date is required!");
        }
        else {
            if (!application.getDate().matches("^\\d{2}/\\d{2}/\\d{4}$")) {
                throw new Exception(
                        "Application date must be in format dd/mm/yyyy!");
            }
        }
        
        // status validation
        if (application.getStatus() == null
                || application.getStatus().equalsIgnoreCase("")) {
            throw new Exception("Application status is required!");
        }
        
        // object is correct and can be added to list
        this.applications.add(application);
        result = true;
        
        return result;
    }
        
    @WebMethod
    public @WebResult(name = "removed")
        Boolean removeApplication(
                @WebParam(name = "id")
                        String id) throws Exception {
            
        for (Application a: this.applications) {
            if (a.getId().equalsIgnoreCase(id)) {
                this.applications.remove(a);
                return true;
            }
        }
        throw new Exception("Given id not found!");
    }
        
    @WebMethod
    public @WebResult(name = "sessionID")
        String login(@WebParam(name = "login") String login,
                @WebParam(name = "password") String password) throws Exception {
    
        // check if login not empty
        if (login.equalsIgnoreCase("")) {
            throw new Exception("Login is required!");
        }
        
        // check if password not empty
        if (password.equalsIgnoreCase("")) {
            throw new Exception("Password is required!");
        }
        
        // login and password correct, return session id
        if (login.equals("msitkowski") && password.equals("admin1")) {
            Random r = new Random();
            return new BigInteger(160, r).toString(32);
        }
        else {
            throw new Exception("Incorrect login or password!");
        }
    }
    
    @WebMethod
    public @WebResult(name = "result")
        Boolean logout(@WebParam(name = "sessionid")
                String sessionid) throws Exception {
    
        Boolean result = true;
        
        // check session id length
        if (sessionid.length() < 32) {
            result = false;
        }
        return result;
    }
}
