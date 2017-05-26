
package recappservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for application complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="application">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicant" type="{http://applications/}applicant" minOccurs="0"/>
 *         &lt;element name="data_processing_agreement" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jobOffer" type="{http://applications/}jobOffer" minOccurs="0"/>
 *         &lt;element name="notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recruiter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "application", propOrder = {
    "applicant",
    "dataProcessingAgreement",
    "date",
    "jobOffer",
    "notes",
    "recruiter",
    "status"
})
public class Application {

    protected Applicant applicant;
    @XmlElement(name = "data_processing_agreement")
    protected Boolean dataProcessingAgreement;
    protected String date;
    protected JobOffer jobOffer;
    protected String notes;
    protected String recruiter;
    protected String status;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the applicant property.
     * 
     * @return
     *     possible object is
     *     {@link Applicant }
     *     
     */
    public Applicant getApplicant() {
        return applicant;
    }

    /**
     * Sets the value of the applicant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Applicant }
     *     
     */
    public void setApplicant(Applicant value) {
        this.applicant = value;
    }

    /**
     * Gets the value of the dataProcessingAgreement property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDataProcessingAgreement() {
        return dataProcessingAgreement;
    }

    /**
     * Sets the value of the dataProcessingAgreement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDataProcessingAgreement(Boolean value) {
        this.dataProcessingAgreement = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the jobOffer property.
     * 
     * @return
     *     possible object is
     *     {@link JobOffer }
     *     
     */
    public JobOffer getJobOffer() {
        return jobOffer;
    }

    /**
     * Sets the value of the jobOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobOffer }
     *     
     */
    public void setJobOffer(JobOffer value) {
        this.jobOffer = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the recruiter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecruiter() {
        return recruiter;
    }

    /**
     * Sets the value of the recruiter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecruiter(String value) {
        this.recruiter = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
