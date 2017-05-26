
package recappservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the recappservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetApplicationsResponse_QNAME = new QName("http://applications/", "getApplicationsResponse");
    private final static QName _SetApplications_QNAME = new QName("http://applications/", "setApplications");
    private final static QName _RemoveApplication_QNAME = new QName("http://applications/", "removeApplication");
    private final static QName _SearchByStatus_QNAME = new QName("http://applications/", "searchByStatus");
    private final static QName _Logout_QNAME = new QName("http://applications/", "logout");
    private final static QName _SetApplicationsResponse_QNAME = new QName("http://applications/", "setApplicationsResponse");
    private final static QName _SearchByRecruiter_QNAME = new QName("http://applications/", "searchByRecruiter");
    private final static QName _GetApplications_QNAME = new QName("http://applications/", "getApplications");
    private final static QName _SearchByOfferResponse_QNAME = new QName("http://applications/", "searchByOfferResponse");
    private final static QName _AddApplicationResponse_QNAME = new QName("http://applications/", "addApplicationResponse");
    private final static QName _SearchByRecruiterResponse_QNAME = new QName("http://applications/", "searchByRecruiterResponse");
    private final static QName _Login_QNAME = new QName("http://applications/", "login");
    private final static QName _SearchByApplicantResponse_QNAME = new QName("http://applications/", "searchByApplicantResponse");
    private final static QName _Exception_QNAME = new QName("http://applications/", "Exception");
    private final static QName _SearchByStatusResponse_QNAME = new QName("http://applications/", "searchByStatusResponse");
    private final static QName _LoginResponse_QNAME = new QName("http://applications/", "loginResponse");
    private final static QName _LogoutResponse_QNAME = new QName("http://applications/", "logoutResponse");
    private final static QName _SearchByOffer_QNAME = new QName("http://applications/", "searchByOffer");
    private final static QName _AddApplication_QNAME = new QName("http://applications/", "addApplication");
    private final static QName _SearchByApplicant_QNAME = new QName("http://applications/", "searchByApplicant");
    private final static QName _RemoveApplicationResponse_QNAME = new QName("http://applications/", "removeApplicationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: recappservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SearchByStatusResponse }
     * 
     */
    public SearchByStatusResponse createSearchByStatusResponse() {
        return new SearchByStatusResponse();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link LogoutResponse }
     * 
     */
    public LogoutResponse createLogoutResponse() {
        return new LogoutResponse();
    }

    /**
     * Create an instance of {@link SearchByOffer }
     * 
     */
    public SearchByOffer createSearchByOffer() {
        return new SearchByOffer();
    }

    /**
     * Create an instance of {@link AddApplication }
     * 
     */
    public AddApplication createAddApplication() {
        return new AddApplication();
    }

    /**
     * Create an instance of {@link RemoveApplicationResponse }
     * 
     */
    public RemoveApplicationResponse createRemoveApplicationResponse() {
        return new RemoveApplicationResponse();
    }

    /**
     * Create an instance of {@link SearchByApplicant }
     * 
     */
    public SearchByApplicant createSearchByApplicant() {
        return new SearchByApplicant();
    }

    /**
     * Create an instance of {@link AddApplicationResponse }
     * 
     */
    public AddApplicationResponse createAddApplicationResponse() {
        return new AddApplicationResponse();
    }

    /**
     * Create an instance of {@link SearchByRecruiterResponse }
     * 
     */
    public SearchByRecruiterResponse createSearchByRecruiterResponse() {
        return new SearchByRecruiterResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link SearchByApplicantResponse }
     * 
     */
    public SearchByApplicantResponse createSearchByApplicantResponse() {
        return new SearchByApplicantResponse();
    }

    /**
     * Create an instance of {@link SearchByStatus }
     * 
     */
    public SearchByStatus createSearchByStatus() {
        return new SearchByStatus();
    }

    /**
     * Create an instance of {@link Logout }
     * 
     */
    public Logout createLogout() {
        return new Logout();
    }

    /**
     * Create an instance of {@link SetApplicationsResponse }
     * 
     */
    public SetApplicationsResponse createSetApplicationsResponse() {
        return new SetApplicationsResponse();
    }

    /**
     * Create an instance of {@link GetApplications }
     * 
     */
    public GetApplications createGetApplications() {
        return new GetApplications();
    }

    /**
     * Create an instance of {@link SearchByOfferResponse }
     * 
     */
    public SearchByOfferResponse createSearchByOfferResponse() {
        return new SearchByOfferResponse();
    }

    /**
     * Create an instance of {@link SearchByRecruiter }
     * 
     */
    public SearchByRecruiter createSearchByRecruiter() {
        return new SearchByRecruiter();
    }

    /**
     * Create an instance of {@link GetApplicationsResponse }
     * 
     */
    public GetApplicationsResponse createGetApplicationsResponse() {
        return new GetApplicationsResponse();
    }

    /**
     * Create an instance of {@link RemoveApplication }
     * 
     */
    public RemoveApplication createRemoveApplication() {
        return new RemoveApplication();
    }

    /**
     * Create an instance of {@link SetApplications }
     * 
     */
    public SetApplications createSetApplications() {
        return new SetApplications();
    }

    /**
     * Create an instance of {@link JobOffer }
     * 
     */
    public JobOffer createJobOffer() {
        return new JobOffer();
    }

    /**
     * Create an instance of {@link Applicant }
     * 
     */
    public Applicant createApplicant() {
        return new Applicant();
    }

    /**
     * Create an instance of {@link Application }
     * 
     */
    public Application createApplication() {
        return new Application();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetApplicationsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://applications/", name = "getApplicationsResponse")
    public JAXBElement<GetApplicationsResponse> createGetApplicationsResponse(GetApplicationsResponse value) {
        return new JAXBElement<GetApplicationsResponse>(_GetApplicationsResponse_QNAME, GetApplicationsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetApplications }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://applications/", name = "setApplications")
    public JAXBElement<SetApplications> createSetApplications(SetApplications value) {
        return new JAXBElement<SetApplications>(_SetApplications_QNAME, SetApplications.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveApplication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://applications/", name = "removeApplication")
    public JAXBElement<RemoveApplication> createRemoveApplication(RemoveApplication value) {
        return new JAXBElement<RemoveApplication>(_RemoveApplication_QNAME, RemoveApplication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://applications/", name = "searchByStatus")
    public JAXBElement<SearchByStatus> createSearchByStatus(SearchByStatus value) {
        return new JAXBElement<SearchByStatus>(_SearchByStatus_QNAME, SearchByStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Logout }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://applications/", name = "logout")
    public JAXBElement<Logout> createLogout(Logout value) {
        return new JAXBElement<Logout>(_Logout_QNAME, Logout.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetApplicationsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://applications/", name = "setApplicationsResponse")
    public JAXBElement<SetApplicationsResponse> createSetApplicationsResponse(SetApplicationsResponse value) {
        return new JAXBElement<SetApplicationsResponse>(_SetApplicationsResponse_QNAME, SetApplicationsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByRecruiter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://applications/", name = "searchByRecruiter")
    public JAXBElement<SearchByRecruiter> createSearchByRecruiter(SearchByRecruiter value) {
        return new JAXBElement<SearchByRecruiter>(_SearchByRecruiter_QNAME, SearchByRecruiter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetApplications }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://applications/", name = "getApplications")
    public JAXBElement<GetApplications> createGetApplications(GetApplications value) {
        return new JAXBElement<GetApplications>(_GetApplications_QNAME, GetApplications.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByOfferResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://applications/", name = "searchByOfferResponse")
    public JAXBElement<SearchByOfferResponse> createSearchByOfferResponse(SearchByOfferResponse value) {
        return new JAXBElement<SearchByOfferResponse>(_SearchByOfferResponse_QNAME, SearchByOfferResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddApplicationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://applications/", name = "addApplicationResponse")
    public JAXBElement<AddApplicationResponse> createAddApplicationResponse(AddApplicationResponse value) {
        return new JAXBElement<AddApplicationResponse>(_AddApplicationResponse_QNAME, AddApplicationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByRecruiterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://applications/", name = "searchByRecruiterResponse")
    public JAXBElement<SearchByRecruiterResponse> createSearchByRecruiterResponse(SearchByRecruiterResponse value) {
        return new JAXBElement<SearchByRecruiterResponse>(_SearchByRecruiterResponse_QNAME, SearchByRecruiterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://applications/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByApplicantResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://applications/", name = "searchByApplicantResponse")
    public JAXBElement<SearchByApplicantResponse> createSearchByApplicantResponse(SearchByApplicantResponse value) {
        return new JAXBElement<SearchByApplicantResponse>(_SearchByApplicantResponse_QNAME, SearchByApplicantResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://applications/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://applications/", name = "searchByStatusResponse")
    public JAXBElement<SearchByStatusResponse> createSearchByStatusResponse(SearchByStatusResponse value) {
        return new JAXBElement<SearchByStatusResponse>(_SearchByStatusResponse_QNAME, SearchByStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://applications/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogoutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://applications/", name = "logoutResponse")
    public JAXBElement<LogoutResponse> createLogoutResponse(LogoutResponse value) {
        return new JAXBElement<LogoutResponse>(_LogoutResponse_QNAME, LogoutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByOffer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://applications/", name = "searchByOffer")
    public JAXBElement<SearchByOffer> createSearchByOffer(SearchByOffer value) {
        return new JAXBElement<SearchByOffer>(_SearchByOffer_QNAME, SearchByOffer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddApplication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://applications/", name = "addApplication")
    public JAXBElement<AddApplication> createAddApplication(AddApplication value) {
        return new JAXBElement<AddApplication>(_AddApplication_QNAME, AddApplication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByApplicant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://applications/", name = "searchByApplicant")
    public JAXBElement<SearchByApplicant> createSearchByApplicant(SearchByApplicant value) {
        return new JAXBElement<SearchByApplicant>(_SearchByApplicant_QNAME, SearchByApplicant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveApplicationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://applications/", name = "removeApplicationResponse")
    public JAXBElement<RemoveApplicationResponse> createRemoveApplicationResponse(RemoveApplicationResponse value) {
        return new JAXBElement<RemoveApplicationResponse>(_RemoveApplicationResponse_QNAME, RemoveApplicationResponse.class, null, value);
    }

}
