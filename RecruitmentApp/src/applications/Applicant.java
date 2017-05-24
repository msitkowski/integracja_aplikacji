package applications;

import javax.xml.bind.annotation.XmlType;

/**
 * Created by mateu on 2017-05-23.
 */
@XmlType(name = "applicant")
public class Applicant {

    private String name;
    private String email;
    private String phone;

    public Applicant() {
    }

    public Applicant(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
