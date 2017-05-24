package applications;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mateu on 2017-05-23.
 */
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

    public List<Application> searchByOffer(String offer) {
        List<Application> results = new ArrayList<>();

        for (Application a: applications) {
            if (a.getJobOffer().getTitle().contains(offer)) {
                results.add(a);
            }
        }
        return results;
    }

    public List<Application> searchByApplicant(String applicant) {
        List<Application> results = new ArrayList<>();

        for (Application a: applications) {
            if (a.getApplicant().getName().contains(applicant)) {
                results.add(a);
            }
        }
        return results;
    }

    public List<Application> searchByStatus(String status) {
        List<Application> results = new ArrayList<>();

        for (Application a: applications) {
            if (a.getStatus().equalsIgnoreCase(status)) {
                results.add(a);
            }
        }
        return results;
    }

    public List<Application> searchByRecruiter(String recruiter) {
        List<Application> results = new ArrayList<>();

        for (Application a: applications) {
            if (a.getRecruiter().equalsIgnoreCase(recruiter)) {
                results.add(a);
            }
        }
        return results;
    }
}
