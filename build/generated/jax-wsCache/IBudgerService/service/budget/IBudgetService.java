
package service.budget;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IBudgetService", targetNamespace = "http://budget.service/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IBudgetService {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "supprimerOpt", targetNamespace = "http://budget.service/", className = "service.budget.SupprimerOpt")
    @ResponseWrapper(localName = "supprimerOptResponse", targetNamespace = "http://budget.service/", className = "service.budget.SupprimerOptResponse")
    public int supprimerOpt(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<java.lang.Object>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listerCats", targetNamespace = "http://budget.service/", className = "service.budget.ListerCats")
    @ResponseWrapper(localName = "listerCatsResponse", targetNamespace = "http://budget.service/", className = "service.budget.ListerCatsResponse")
    public List<Object> listerCats(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns service.budget.OperationDetail
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "chercherOpt", targetNamespace = "http://budget.service/", className = "service.budget.ChercherOpt")
    @ResponseWrapper(localName = "chercherOptResponse", targetNamespace = "http://budget.service/", className = "service.budget.ChercherOptResponse")
    public OperationDetail chercherOpt(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @return
     *     returns service.budget.Droit
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenirDroit", targetNamespace = "http://budget.service/", className = "service.budget.ObtenirDroit")
    @ResponseWrapper(localName = "obtenirDroitResponse", targetNamespace = "http://budget.service/", className = "service.budget.ObtenirDroitResponse")
    public Droit obtenirDroit();

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg5
     * @param arg4
     * @param arg1
     * @param arg0
     * @param arg7
     * @param arg6
     * @param arg8
     * @return
     *     returns service.budget.OperationDetail
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "creerOpt", targetNamespace = "http://budget.service/", className = "service.budget.CreerOpt")
    @ResponseWrapper(localName = "creerOptResponse", targetNamespace = "http://budget.service/", className = "service.budget.CreerOptResponse")
    public OperationDetail creerOpt(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        double arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        double arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        XMLGregorianCalendar arg4,
        @WebParam(name = "arg5", targetNamespace = "")
        String arg5,
        @WebParam(name = "arg6", targetNamespace = "")
        String arg6,
        @WebParam(name = "arg7", targetNamespace = "")
        int arg7,
        @WebParam(name = "arg8", targetNamespace = "")
        String arg8);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<java.lang.Object>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listerOpts", targetNamespace = "http://budget.service/", className = "service.budget.ListerOpts")
    @ResponseWrapper(localName = "listerOptsResponse", targetNamespace = "http://budget.service/", className = "service.budget.ListerOptsResponse")
    public List<Object> listerOpts(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg5
     * @param arg4
     * @param arg1
     * @param arg0
     * @param arg7
     * @param arg6
     * @param arg9
     * @param arg8
     * @return
     *     returns service.budget.OperationDetail
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "modifierOpt", targetNamespace = "http://budget.service/", className = "service.budget.ModifierOpt")
    @ResponseWrapper(localName = "modifierOptResponse", targetNamespace = "http://budget.service/", className = "service.budget.ModifierOptResponse")
    public OperationDetail modifierOpt(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        double arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        double arg4,
        @WebParam(name = "arg5", targetNamespace = "")
        XMLGregorianCalendar arg5,
        @WebParam(name = "arg6", targetNamespace = "")
        String arg6,
        @WebParam(name = "arg7", targetNamespace = "")
        String arg7,
        @WebParam(name = "arg8", targetNamespace = "")
        int arg8,
        @WebParam(name = "arg9", targetNamespace = "")
        String arg9);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns service.budget.Partage
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "creerPartage", targetNamespace = "http://budget.service/", className = "service.budget.CreerPartage")
    @ResponseWrapper(localName = "creerPartageResponse", targetNamespace = "http://budget.service/", className = "service.budget.CreerPartageResponse")
    public Partage creerPartage(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2);

    /**
     * 
     * @param arg0
     * @return
     *     returns service.budget.Categorie
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "chercherCat", targetNamespace = "http://budget.service/", className = "service.budget.ChercherCat")
    @ResponseWrapper(localName = "chercherCatResponse", targetNamespace = "http://budget.service/", className = "service.budget.ChercherCatResponse")
    public Categorie chercherCat(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<java.lang.Object>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listerPartage", targetNamespace = "http://budget.service/", className = "service.budget.ListerPartage")
    @ResponseWrapper(localName = "listerPartageResponse", targetNamespace = "http://budget.service/", className = "service.budget.ListerPartageResponse")
    public List<Object> listerPartage(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.Object>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listerDroits", targetNamespace = "http://budget.service/", className = "service.budget.ListerDroits")
    @ResponseWrapper(localName = "listerDroitsResponse", targetNamespace = "http://budget.service/", className = "service.budget.ListerDroitsResponse")
    public List<Object> listerDroits();

}
