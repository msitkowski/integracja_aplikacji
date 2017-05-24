package applications;

/**
 * Created by mateu on 2017-05-23.
 */
public class Application {

    private Integer id;
    private JobOffer jobOffer;
    private Applicant applicant;
    private String recruiter;
    private String status;
    private String date;
    private Boolean data_processing_agreement;
    private String notes;

    public Application() {
    }

    public Application(Integer id, JobOffer jobOffer,
                       Applicant applicant, String recruiter,
                       String status, String date,
                       Boolean data_processing_agreement, String notes) {

        this.id = id;
        this.jobOffer = jobOffer;
        this.applicant = applicant;
        this.recruiter = recruiter;
        this.status = status;
        this.date = date;
        this.data_processing_agreement = data_processing_agreement;
        this.notes = notes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public JobOffer getJobOffer() {
        return jobOffer;
    }

    public void setJobOffer(JobOffer jobOffer) {
        this.jobOffer = jobOffer;
    }

    public Applicant getApplicant() {
        return applicant;
    }

    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }

    public String getRecruiter() {
        return recruiter;
    }

    public void setRecruiter(String recruiter) {
        this.recruiter = recruiter;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Boolean getData_processing_agreement() {
        return data_processing_agreement;
    }

    public void setData_processing_agreement(Boolean data_processing_agreement) {
        this.data_processing_agreement = data_processing_agreement;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
