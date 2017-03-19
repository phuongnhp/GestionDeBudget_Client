/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsf;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.xml.ws.WebServiceRef;
import service.aut.Utilisateur_Service;

/**
 *
 * @author phuong
 */
@ManagedBean(name = "userBean")
@SessionScoped
public class UserBean implements Serializable {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/GestionDeBudget_Webservice/Utilisateur.wsdl")
    private Utilisateur_Service service;
    String username;
    String mdp;
    String mdpConfirme;
    String message;

    public void inscription() {
        String res = sInscrire(username, mdp);
        if ( res == null) {
            message = "Insciption error";
        }
        else if (res.matches("OK")) {
            message = "Inscription avec succès";
        }
    }
    
    public void init(){
        username = null;
        mdp = null;
        mdpConfirme = null;
        message = null;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getMdpConfirme() {
        return mdpConfirme;
    }

    public void setMdpConfirme(String mdpConfirme) {
        this.mdpConfirme = mdpConfirme;
    }

    private String sInscrire(java.lang.String username, java.lang.String mdp) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        service.aut.Utilisateur port = service.getUtilisateurPort();
        return port.sInscrire(username, mdp);
    }

}
