
package service.aut;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service.aut package. 
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

    private final static QName _SeConnecterResponse_QNAME = new QName("http://aut.service/", "seConnecterResponse");
    private final static QName _Hello_QNAME = new QName("http://aut.service/", "hello");
    private final static QName _ListerUtilisateursResponse_QNAME = new QName("http://aut.service/", "listerUtilisateursResponse");
    private final static QName _SInscrireResponse_QNAME = new QName("http://aut.service/", "sInscrireResponse");
    private final static QName _SeConnecter_QNAME = new QName("http://aut.service/", "seConnecter");
    private final static QName _HelloResponse_QNAME = new QName("http://aut.service/", "helloResponse");
    private final static QName _ListerRolesResponse_QNAME = new QName("http://aut.service/", "listerRolesResponse");
    private final static QName _ListerRoles_QNAME = new QName("http://aut.service/", "listerRoles");
    private final static QName _ListerUtilisateurs_QNAME = new QName("http://aut.service/", "listerUtilisateurs");
    private final static QName _SInscrire_QNAME = new QName("http://aut.service/", "sInscrire");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service.aut
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListerRoles }
     * 
     */
    public ListerRoles createListerRoles() {
        return new ListerRoles();
    }

    /**
     * Create an instance of {@link ListerUtilisateurs }
     * 
     */
    public ListerUtilisateurs createListerUtilisateurs() {
        return new ListerUtilisateurs();
    }

    /**
     * Create an instance of {@link SInscrire }
     * 
     */
    public SInscrire createSInscrire() {
        return new SInscrire();
    }

    /**
     * Create an instance of {@link ListerRolesResponse }
     * 
     */
    public ListerRolesResponse createListerRolesResponse() {
        return new ListerRolesResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link SeConnecter }
     * 
     */
    public SeConnecter createSeConnecter() {
        return new SeConnecter();
    }

    /**
     * Create an instance of {@link SInscrireResponse }
     * 
     */
    public SInscrireResponse createSInscrireResponse() {
        return new SInscrireResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link ListerUtilisateursResponse }
     * 
     */
    public ListerUtilisateursResponse createListerUtilisateursResponse() {
        return new ListerUtilisateursResponse();
    }

    /**
     * Create an instance of {@link SeConnecterResponse }
     * 
     */
    public SeConnecterResponse createSeConnecterResponse() {
        return new SeConnecterResponse();
    }

    /**
     * Create an instance of {@link Utilisateur_Type }
     * 
     */
    public Utilisateur_Type createUtilisateur_Type() {
        return new Utilisateur_Type();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeConnecterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aut.service/", name = "seConnecterResponse")
    public JAXBElement<SeConnecterResponse> createSeConnecterResponse(SeConnecterResponse value) {
        return new JAXBElement<SeConnecterResponse>(_SeConnecterResponse_QNAME, SeConnecterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aut.service/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListerUtilisateursResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aut.service/", name = "listerUtilisateursResponse")
    public JAXBElement<ListerUtilisateursResponse> createListerUtilisateursResponse(ListerUtilisateursResponse value) {
        return new JAXBElement<ListerUtilisateursResponse>(_ListerUtilisateursResponse_QNAME, ListerUtilisateursResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SInscrireResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aut.service/", name = "sInscrireResponse")
    public JAXBElement<SInscrireResponse> createSInscrireResponse(SInscrireResponse value) {
        return new JAXBElement<SInscrireResponse>(_SInscrireResponse_QNAME, SInscrireResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeConnecter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aut.service/", name = "seConnecter")
    public JAXBElement<SeConnecter> createSeConnecter(SeConnecter value) {
        return new JAXBElement<SeConnecter>(_SeConnecter_QNAME, SeConnecter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aut.service/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListerRolesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aut.service/", name = "listerRolesResponse")
    public JAXBElement<ListerRolesResponse> createListerRolesResponse(ListerRolesResponse value) {
        return new JAXBElement<ListerRolesResponse>(_ListerRolesResponse_QNAME, ListerRolesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListerRoles }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aut.service/", name = "listerRoles")
    public JAXBElement<ListerRoles> createListerRoles(ListerRoles value) {
        return new JAXBElement<ListerRoles>(_ListerRoles_QNAME, ListerRoles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListerUtilisateurs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aut.service/", name = "listerUtilisateurs")
    public JAXBElement<ListerUtilisateurs> createListerUtilisateurs(ListerUtilisateurs value) {
        return new JAXBElement<ListerUtilisateurs>(_ListerUtilisateurs_QNAME, ListerUtilisateurs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SInscrire }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aut.service/", name = "sInscrire")
    public JAXBElement<SInscrire> createSInscrire(SInscrire value) {
        return new JAXBElement<SInscrire>(_SInscrire_QNAME, SInscrire.class, null, value);
    }

}
