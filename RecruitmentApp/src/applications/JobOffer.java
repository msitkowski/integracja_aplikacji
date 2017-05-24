package applications;

/**
 * Created by mateu on 2017-05-23.
 */
public class JobOffer {

    private String title;
    private String description;
    private String contact_email;
    private String contact_phone;
    private Double min_salary;
    private Double max_salary;
    private String contract_type;

    public JobOffer() {
    }

    public JobOffer(String title, String description,
                    String contact_email, String contact_phone,
                    Double min_salary, Double max_salary,
                    String contract_type) {

        this.title = title;
        this.description = description;
        this.contact_email = contact_email;
        this.contact_phone = contact_phone;
        this.min_salary = min_salary;
        this.max_salary = max_salary;
        this.contract_type = contract_type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContact_email() {
        return contact_email;
    }

    public void setContact_email(String contact_email) {
        this.contact_email = contact_email;
    }

    public String getContact_phone() {
        return contact_phone;
    }

    public void setContact_phone(String contact_phone) {
        this.contact_phone = contact_phone;
    }

    public Double getMin_salary() {
        return min_salary;
    }

    public void setMin_salary(Double min_salary) {
        this.min_salary = min_salary;
    }

    public Double getMax_salary() {
        return max_salary;
    }

    public void setMax_salary(Double max_salary) {
        this.max_salary = max_salary;
    }

    public String getContract_type() {
        return contract_type;
    }

    public void setContract_type(String contract_type) {
        this.contract_type = contract_type;
    }
}
