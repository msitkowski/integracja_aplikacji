
package recappservice;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ApplicationsManager", targetNamespace = "http://applications/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ApplicationsManager {


    /**
     * 
     * @return
     *     returns java.util.List<recappservice.Application>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getApplications", targetNamespace = "http://applications/", className = "recappservice.GetApplications")
    @ResponseWrapper(localName = "getApplicationsResponse", targetNamespace = "http://applications/", className = "recappservice.GetApplicationsResponse")
    @Action(input = "http://applications/ApplicationsManager/getApplicationsRequest", output = "http://applications/ApplicationsManager/getApplicationsResponse")
    public List<Application> getApplications();

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "setApplications", targetNamespace = "http://applications/", className = "recappservice.SetApplications")
    @ResponseWrapper(localName = "setApplicationsResponse", targetNamespace = "http://applications/", className = "recappservice.SetApplicationsResponse")
    @Action(input = "http://applications/ApplicationsManager/setApplicationsRequest", output = "http://applications/ApplicationsManager/setApplicationsResponse")
    public void setApplications(
        @WebParam(name = "arg0", targetNamespace = "")
        List<Application> arg0);

    /**
     * 
     * @param recruiter
     * @return
     *     returns java.util.List<recappservice.Application>
     */
    @WebMethod
    @WebResult(name = "application", targetNamespace = "")
    @RequestWrapper(localName = "searchByRecruiter", targetNamespace = "http://applications/", className = "recappservice.SearchByRecruiter")
    @ResponseWrapper(localName = "searchByRecruiterResponse", targetNamespace = "http://applications/", className = "recappservice.SearchByRecruiterResponse")
    @Action(input = "http://applications/ApplicationsManager/searchByRecruiterRequest", output = "http://applications/ApplicationsManager/searchByRecruiterResponse")
    public List<Application> searchByRecruiter(
        @WebParam(name = "recruiter", targetNamespace = "")
        String recruiter);

    /**
     * 
     * @param id
     * @return
     *     returns java.lang.Boolean
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(name = "removed", targetNamespace = "")
    @RequestWrapper(localName = "removeApplication", targetNamespace = "http://applications/", className = "recappservice.RemoveApplication")
    @ResponseWrapper(localName = "removeApplicationResponse", targetNamespace = "http://applications/", className = "recappservice.RemoveApplicationResponse")
    @Action(input = "http://applications/ApplicationsManager/removeApplicationRequest", output = "http://applications/ApplicationsManager/removeApplicationResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://applications/ApplicationsManager/removeApplication/Fault/Exception")
    })
    public Boolean removeApplication(
        @WebParam(name = "id", targetNamespace = "")
        String id)
        throws Exception_Exception
    ;

    /**
     * 
     * @param applicant
     * @return
     *     returns java.util.List<recappservice.Application>
     */
    @WebMethod
    @WebResult(name = "application", targetNamespace = "")
    @RequestWrapper(localName = "searchByApplicant", targetNamespace = "http://applications/", className = "recappservice.SearchByApplicant")
    @ResponseWrapper(localName = "searchByApplicantResponse", targetNamespace = "http://applications/", className = "recappservice.SearchByApplicantResponse")
    @Action(input = "http://applications/ApplicationsManager/searchByApplicantRequest", output = "http://applications/ApplicationsManager/searchByApplicantResponse")
    public List<Application> searchByApplicant(
        @WebParam(name = "applicant", targetNamespace = "")
        String applicant);

    /**
     * 
     * @param status
     * @return
     *     returns java.util.List<recappservice.Application>
     */
    @WebMethod
    @WebResult(name = "application", targetNamespace = "")
    @RequestWrapper(localName = "searchByStatus", targetNamespace = "http://applications/", className = "recappservice.SearchByStatus")
    @ResponseWrapper(localName = "searchByStatusResponse", targetNamespace = "http://applications/", className = "recappservice.SearchByStatusResponse")
    @Action(input = "http://applications/ApplicationsManager/searchByStatusRequest", output = "http://applications/ApplicationsManager/searchByStatusResponse")
    public List<Application> searchByStatus(
        @WebParam(name = "status", targetNamespace = "")
        String status);

    /**
     * 
     * @param offer
     * @return
     *     returns java.util.List<recappservice.Application>
     */
    @WebMethod
    @WebResult(name = "application", targetNamespace = "")
    @RequestWrapper(localName = "searchByOffer", targetNamespace = "http://applications/", className = "recappservice.SearchByOffer")
    @ResponseWrapper(localName = "searchByOfferResponse", targetNamespace = "http://applications/", className = "recappservice.SearchByOfferResponse")
    @Action(input = "http://applications/ApplicationsManager/searchByOfferRequest", output = "http://applications/ApplicationsManager/searchByOfferResponse")
    public List<Application> searchByOffer(
        @WebParam(name = "offer", targetNamespace = "")
        String offer);

    /**
     * 
     * @param password
     * @param login
     * @return
     *     returns java.lang.String
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(name = "sessionID", targetNamespace = "")
    @RequestWrapper(localName = "login", targetNamespace = "http://applications/", className = "recappservice.Login")
    @ResponseWrapper(localName = "loginResponse", targetNamespace = "http://applications/", className = "recappservice.LoginResponse")
    @Action(input = "http://applications/ApplicationsManager/loginRequest", output = "http://applications/ApplicationsManager/loginResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://applications/ApplicationsManager/login/Fault/Exception")
    })
    public String login(
        @WebParam(name = "login", targetNamespace = "")
        String login,
        @WebParam(name = "password", targetNamespace = "")
        String password)
        throws Exception_Exception
    ;

    /**
     * 
     * @param sessionid
     * @return
     *     returns java.lang.Boolean
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "logout", targetNamespace = "http://applications/", className = "recappservice.Logout")
    @ResponseWrapper(localName = "logoutResponse", targetNamespace = "http://applications/", className = "recappservice.LogoutResponse")
    @Action(input = "http://applications/ApplicationsManager/logoutRequest", output = "http://applications/ApplicationsManager/logoutResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://applications/ApplicationsManager/logout/Fault/Exception")
    })
    public Boolean logout(
        @WebParam(name = "sessionid", targetNamespace = "")
        String sessionid)
        throws Exception_Exception
    ;

    /**
     * 
     * @param application
     * @return
     *     returns java.lang.Boolean
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(name = "added", targetNamespace = "")
    @RequestWrapper(localName = "addApplication", targetNamespace = "http://applications/", className = "recappservice.AddApplication")
    @ResponseWrapper(localName = "addApplicationResponse", targetNamespace = "http://applications/", className = "recappservice.AddApplicationResponse")
    @Action(input = "http://applications/ApplicationsManager/addApplicationRequest", output = "http://applications/ApplicationsManager/addApplicationResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://applications/ApplicationsManager/addApplication/Fault/Exception")
    })
    public Boolean addApplication(
        @WebParam(name = "application", targetNamespace = "")
        Application application)
        throws Exception_Exception
    ;

}
